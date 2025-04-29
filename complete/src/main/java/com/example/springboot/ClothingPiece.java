import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class ClothingPiece {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // e.g., "Red Flannel Shirt"
    private String type; // e.g., "shirt", "pants", etc.
    private String color;
    private String season; // e.g., "summer", "winter"
    private String aesthetic; // e.g., "casual", "formal"
    private String imageUrl; // link or path to the image

    // Getters and setters
}
