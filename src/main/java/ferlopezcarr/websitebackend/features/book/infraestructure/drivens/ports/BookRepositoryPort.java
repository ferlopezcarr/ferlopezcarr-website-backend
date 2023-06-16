package ferlopezcarr.websitebackend.features.book.infraestructure.drivens.ports;


import ferlopezcarr.websitebackend.features.book.domain.models.Book;
import ferlopezcarr.websitebackend.features.book.domain.models.BookId;
import ferlopezcarr.websitebackend.features.book.infraestructure.drivens.models.BookRepositoryDTO;

import java.util.List;
import java.util.Optional;

public interface BookRepositoryPort {

    Optional<BookRepositoryDTO> getBookById(BookId id);
    List<BookRepositoryDTO> getBooks();
    void createBook(Book bookApi);

}
