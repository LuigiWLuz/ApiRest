package dio.ApiRest.domain.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

@Entity
@Table(name = "Usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Features> features;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    public Account getAccount() {
        return account;
    }

    public Card getCard() {
        return card;
    }

    public List<Features> getFeatures() {
        return features;
    }

    public List<News> getNews() {
        return news;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public void setCard(Card card) {
        this.card = card;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public void setName(String name) {
        this.name = name;
    }

   


}
