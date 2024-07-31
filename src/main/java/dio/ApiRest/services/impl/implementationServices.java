package dio.ApiRest.services.impl;

import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.ApiRest.domain.model.User;
import dio.ApiRest.domain.model.repository.repositoryUser;
import dio.ApiRest.services.servicesUser;

@Service
public class implementationServices implements servicesUser {

    // private final repositoryUser userRepository;

    // public implementationServices(repositoryUser userRepository ){
    //     this.userRepository = userRepository;
    // }
    @Autowired
    private repositoryUser userRepository;

    @Override
    public User buscarPorId(Long id) {
       return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
       //foi usado method References para a criacao dessa exception NoSuchElementException::new
    }

    @Override
    public void alterarUser(Long id, User user) {
        System.out.println("Teste alterou.");
    }

    @Override
    public void deletarUser(Long id) {
        System.out.println("Teste deletou.");
    }

    @Override
    public User inserirUser(User user) {

       if(userRepository.existsByAccountNumber(user.getAccount().getNumero())){
            throw new IllegalArgumentException("Usuario invalido, insira novamente, usuario já existente ou não criado;");
       }
       return userRepository.save(user);
    }

    @Override
    public List<User> buscarTodos() {
      return userRepository.findAll();
    }

}
