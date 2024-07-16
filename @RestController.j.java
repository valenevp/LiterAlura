@RestController
@RequestMapping("/api")
public class LibraryController {
    private final LibraryService libraryService;
    private final GutendexService gutendexService;

    public LibraryController(LibraryService libraryService, GutendexService gutendexService) {
        this.libraryService = libraryService;
        this.gutendexService = gutendexService;
    }

    @GetMapping("/books/title")
    public Book getBookByTitle(@RequestParam String title) {
        Book book = gutendexService.getBookByTitle(title).block();
        return libraryService.saveBook(book);
    }

    @GetMapping("/books")
    public List<Book> listAllBooks() {
        return libraryService.listAllBooks();
    }

    @GetMapping("/authors")
    public List<Author> listAllAuthors() {
        return libraryService.listAllAuthors();
    }

    @GetMapping("/authors/year")
    public List<Author> listAuthorsByYear(@RequestParam String year) {
        return libraryService.listAuthorsByYear(year);
    }

    @GetMapping("/books/language")
    public List<Book> listBooksByLanguage(@RequestParam String language) {
        return libraryService.listBooksByLanguage(language);
    }
}
