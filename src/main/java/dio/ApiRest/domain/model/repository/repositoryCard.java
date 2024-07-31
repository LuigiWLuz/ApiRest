package dio.ApiRest.domain.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.ApiRest.domain.model.Card;

public interface repositoryCard extends JpaRepository<Card,Long> {

}
