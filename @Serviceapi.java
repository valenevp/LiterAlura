@Service
public class GutendexService {
    private final WebClient webClient;

    public GutendexService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://gutendex.com").build();
    }

    public Mono<Book> getBookByTitle(String title) {
        return this.webClient.get()
                .uri("/books?title=" + title)
                .retrieve()
                .bodyToMono(Book.class);
    }
}
