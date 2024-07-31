package dio.ApiRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.ApiRest.domain.model.User;
import dio.ApiRest.services.impl.implementationServices;

@RestController
//serve para definir um path(Caminho) para os endpoints
@RequestMapping("/users")
public class userController {

    @Autowired
    private implementationServices servicesImplementation;

    //Especificando que o que sera passado sera o id
    @GetMapping("/{id}")
    // @Pathvariable que é o padrão dentro deste  @GetMapping("/{id}")
    public ResponseEntity<User> buscaPorId(@PathVariable Long id){
        return ResponseEntity.ok(servicesImplementation.buscarPorId(id));
    }

    @PostMapping
    //utiliza-se a refrencia do requestBody por passar o conteudo todo não algo em especifico
    public ResponseEntity<User> adicionaUser(@RequestBody User user){
        return ResponseEntity.ok(servicesImplementation.inserirUser(user));
    }

}
