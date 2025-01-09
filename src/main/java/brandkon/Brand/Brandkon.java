package brandkon.Brand;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Brandkon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long Id;
   private String brandName;
   private String category;

    public Brandkon(Long id, String brandName, String category) {
        Id = id;
        this.brandName = brandName;
        this.category = category;
    }

    public Long getId() {
        return Id;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getCategory() {
        return category;
    }
}

