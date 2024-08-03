package dio.ApiRest.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Contas")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConta")
    private Long Id;
    @Column(name="NumeroConta",unique = true)
    private String number;
    @Column(name="Agencia")
    private String agencia;
    //<<BigDecimal>> tipo recomendado quando se trata de valores monetarios
    @Column(name="Saldo",precision = 13,scale = 2)//são treze numeros 11 inteiros e dois pontos flutuantes
    private BigDecimal saldo;
    @Column(name="limiteConta",precision = 13,scale = 2)
    private BigDecimal limite;

    public String getAgencia() {
        return agencia;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public String getNumero() {
        return number;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public void setNumero(String number) {
        this.number = number;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
