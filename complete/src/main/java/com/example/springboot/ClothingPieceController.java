import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/clothing")
public class ClothingPieceController {

    @Autowired
    private ClothingPieceService service;

    @GetMapping
    public List<ClothingPiece> getAllClothing() {
        return service.getAll();
    }

    @PostMapping
    public ClothingPiece addClothing(@RequestBody ClothingPiece piece) {
        return service.save(piece);
    }

    @GetMapping("/shuffle")
    public List<ClothingPiece> shuffleOutfit() {
        return service.shuffleOutfit();
    }
}
