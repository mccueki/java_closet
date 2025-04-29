import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

@Service
public class ClothingPieceService {

    @Autowired
    private ClothingPieceRepository repository;

    public List<ClothingPiece> getAll() {
        return repository.findAll();
    }

    public List<ClothingPiece> getByType(String type) {
        return repository.findByType(type);
    }

    public ClothingPiece save(ClothingPiece piece) {
        return repository.save(piece);
    }

    public List<ClothingPiece> shuffleOutfit() {
        // Basic shuffle logic
        List<String> types = List.of("hat", "shirt", "pants", "shoes");
        List<ClothingPiece> outfit = new ArrayList<>();

        for (String type : types) {
            List<ClothingPiece> options = repository.findByType(type);
            if (!options.isEmpty()) {
                ClothingPiece selected = options.get(new Random().nextInt(options.size()));
                outfit.add(selected);
            }
        }
        return outfit;
    }
}
