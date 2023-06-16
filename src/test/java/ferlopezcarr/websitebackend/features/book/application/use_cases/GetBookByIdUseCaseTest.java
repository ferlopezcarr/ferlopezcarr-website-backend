package ferlopezcarr.websitebackend.features.book.application.use_cases;

import ferlopezcarr.websitebackend.features.book.domain.models.Book;
import ferlopezcarr.websitebackend.features.book.domain.models.BookId;
import ferlopezcarr.websitebackend.features.book.infraestructure.drivens.models.BookRepositoryDTO;
import ferlopezcarr.websitebackend.features.book.infraestructure.drivens.ports.BookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@SpringBootTest
class GetBookByIdUseCaseTest {

    @Mock
    private BookRepository bookRepository;
    @Spy
    @InjectMocks
    private GetBookByIdUseCase getBookByIdUseCase;

    @Test
    public void testGetBookByIdUseCase() {
        // Given
        BookId bookId = new BookId("1");
        BookRepositoryDTO bookRepositoryDTO = mock(BookRepositoryDTO.class);
        bookRepositoryDTO.setId(bookId.getId());
        when(bookRepository.findById(bookId.getId())).thenReturn(Optional.of(bookRepositoryDTO));

        // When
        Book book = this.getBookByIdUseCase.execute(bookId);

        // Then
        assertEquals(book.getId().getId(), id);
    }

}