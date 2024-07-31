package dio.ApiRest.domain.model.repository;

import dio.ApiRest.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositoryAccount extends JpaRepository<Account,Long> {

}
