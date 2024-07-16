public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
    List<Book> findByLanguage(String language);
}

public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByBirthYear(String birthYear);
}
