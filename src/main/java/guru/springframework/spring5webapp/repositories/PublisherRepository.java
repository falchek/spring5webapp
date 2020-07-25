package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Repo for Publisher
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
