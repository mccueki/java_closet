import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface ClothingPieceRepository extends JpaRepository<ClothingPiece, Long> {
    List<ClothingPiece> findByType(String type);
}
