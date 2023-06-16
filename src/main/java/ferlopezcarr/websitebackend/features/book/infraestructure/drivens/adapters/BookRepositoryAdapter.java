package ferlopezcarr.websitebackend.features.book.infraestructure.drivens.adapters;

import ferlopezcarr.websitebackend.core.validators.NullValidator;
import ferlopezcarr.websitebackend.features.book.domain.models.Book;
import ferlopezcarr.websitebackend.features.book.domain.models.BookId;
import ferlopezcarr.websitebackend.features.book.infraestructure.drivens.models.BookRepositoryDTO;
import ferlopezcarr.websitebackend.features.book.infraestructure.drivens.ports.BookRepository;
import ferlopezcarr.websitebackend.features.book.infraestructure.drivens.ports.BookRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookRepositoryAdapter implements BookRepositoryPort {

    private final BookRepository bookRepository;

    @Autowired
    public BookRepositoryAdapter(final BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<BookRepositoryDTO> getBookById(BookId id) {
        NullValidator.isNull(id);
        return this.bookRepository.findById(id.getId());
    }

    @Override
    public List<BookRepositoryDTO> getBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public void createBook(Book book) {

    }
}
