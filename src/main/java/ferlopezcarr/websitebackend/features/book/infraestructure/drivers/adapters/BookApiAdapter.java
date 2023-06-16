package ferlopezcarr.websitebackend.features.book.infraestructure.drivers.adapters;

import ferlopezcarr.websitebackend.features.book.infraestructure.drivers.models.BookApiDTO;
import ferlopezcarr.websitebackend.features.book.infraestructure.drivers.ports.BookApiPort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookApiAdapter implements BookApiPort {

    @Override
    @GetMapping("/{id}")
    public BookApiDTO getBookById(@PathVariable("id") String id) {
        return null;
    }

    @Override
    @RequestMapping(method = RequestMethod.GET, path = "/books")
    public List<BookApiDTO> getBooks() {
        return null;
    }

    @Override
    @PostMapping
    public void createBook(BookApiDTO bookApiDTO) {
        
    }
}
