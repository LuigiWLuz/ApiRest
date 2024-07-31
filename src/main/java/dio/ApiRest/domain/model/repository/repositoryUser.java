package dio.ApiRest.domain.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.ApiRest.domain.model.User;

public interface repositoryUser extends JpaRepository<User,Long> {

    // O jpa repository possui a capacidade de interpretar que caso o numero de cartao ja tenha sido inserido no BDD ele retorna se já existe ou não
    boolean existsByAccountNumber(String numero);
}
