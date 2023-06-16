package ferlopezcarr.websitebackend.features.book.infraestructure.drivers.ports;

import ferlopezcarr.websitebackend.features.book.infraestructure.drivers.models.BookApiDTO;

import java.util.List;

public interface BookApiPort {

    BookApiDTO getBookById(String id);
    List<BookApiDTO> getBooks();
    void createBook(BookApiDTO bookApiDTO);

}
