@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String birthYear;
    private String deathYear;

    // Getters e setters
}
