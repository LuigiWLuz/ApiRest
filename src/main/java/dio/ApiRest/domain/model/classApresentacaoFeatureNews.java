package dio.ApiRest.domain.model;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class classApresentacaoFeatureNews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "icone")
    private String icon;
    @Column(name = "Descricao")
    private String Description;

    public String getDescription() {
        return Description;
    }

    public String getIcon() {
        return icon;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
