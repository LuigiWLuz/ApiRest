package dio.ApiRest.controller.exceptions;

import java.util.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {

    //Foi criada esta classe para o tratamento de excecoes de maneira local, sera feita uma classe para o tratamento de excecoes remotamente(por Nuvem). 

   //a criacao dessa constante vai fazer com que force que quando a excecao espeficada for lançada ela fara o que esta dentro do ultimo metodo
   private static final Logger teste = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    

    @ExceptionHandler(IllegalArgumentException.class)
    //especificando a excecao que será tratada
    public ResponseEntity<String> handleDadojaCadastrado(IllegalArgumentException mensagemGerada){
        return new ResponseEntity<>(mensagemGerada.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
        //httpStatus é o erro no qual será mostrado o padrão é 500, com esse HttpStatus definido passa a ser 422
    }

    @ExceptionHandler(NoSuchElementException.class)
    //especificando a excecao que será tratada
    public ResponseEntity<String> handleUsuarioNaoEncontrado(NoSuchElementException elementoNaoEncontrado){
        return new ResponseEntity<>("Elemento não encontrado.",HttpStatus.NOT_FOUND);
        //httpStatus é o erro no qual será mostrado o padrão é 500, com esse HttpStatus definido passa a ser 422
    }

    @ExceptionHandler(Throwable.class)
    //especificando a excecao que será tratada
    //Throwable é para todas excecoes que não foram criadas metodos especificos, para o seu tratamento.
    //É uma boa pratica fazer este metodo
    public ResponseEntity<String> handleGenerico(Throwable excecaoNaoesperada){
        var mensagem = "Exceção inesperada.";
        teste.error("Exceção inesperada.", excecaoNaoesperada);
        return new ResponseEntity<>(mensagem,HttpStatus.INTERNAL_SERVER_ERROR);
        //httpStatus é o erro no qual será mostrado o padrão é 500, com esse HttpStatus definido passa a ser 422
    }


}
