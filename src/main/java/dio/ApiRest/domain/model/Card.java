package dio.ApiRest.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cartoes")
public class Card{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCartao")
    private Long id;
    @Column(name="numerosCartao",unique = true)
    private String numerosCartao;
    @Column(name = "limiteCartao",precision = 13,scale = 2)
    private BigDecimal limite;

    public BigDecimal getLimite() {
        return limite;
    }

    public String getNumerosCartao() {
        return numerosCartao;
    }

    public void setNumerosCartao(String numerosCartao) {
        this.numerosCartao = numerosCartao;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    

}
