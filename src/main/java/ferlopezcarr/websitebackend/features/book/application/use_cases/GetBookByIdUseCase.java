package ferlopezcarr.websitebackend.features.book.application.use_cases;

import ferlopezcarr.websitebackend.core.application.exceptions.EntityNotFoundException;
import ferlopezcarr.websitebackend.core.validators.NullValidator;
import ferlopezcarr.websitebackend.core.validators.StringValidator;
import ferlopezcarr.websitebackend.features.book.domain.models.Book;
import ferlopezcarr.websitebackend.features.book.domain.models.BookId;
import ferlopezcarr.websitebackend.features.book.infraestructure.drivens.models.BookRepositoryDTO;
import ferlopezcarr.websitebackend.features.book.infraestructure.drivens.ports.BookRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetBookByIdUseCase {

    private final BookRepositoryPort bookRepositoryPort;

    @Autowired
    public GetBookByIdUseCase(final BookRepositoryPort bookRepositoryPort) {
        this.bookRepositoryPort = bookRepositoryPort;
    }

    public Book execute(BookId bookId) throws EntityNotFoundException {
        NullValidator.isNull(bookId);

        Optional<BookRepositoryDTO> bookRepositoryDTO = this.bookRepositoryPort.getBookById(bookId);
        if (bookRepositoryDTO == null || bookRepositoryDTO.isEmpty()) {
            throw new EntityNotFoundException();
        }

        return null;
    }
}
