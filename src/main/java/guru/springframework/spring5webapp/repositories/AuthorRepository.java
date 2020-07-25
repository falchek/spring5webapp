package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Creates a CRUD repository with Spring Data
 * We provide the interface for this, and SpringData provides the implementation.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {


}
