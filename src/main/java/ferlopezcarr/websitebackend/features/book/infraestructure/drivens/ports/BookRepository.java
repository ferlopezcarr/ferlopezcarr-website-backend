package ferlopezcarr.websitebackend.features.book.infraestructure.drivens.ports;

import ferlopezcarr.websitebackend.features.book.infraestructure.drivens.models.BookRepositoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookRepositoryDTO, String> {
}
