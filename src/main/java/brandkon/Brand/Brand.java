package brandkon.Brand;

import brandkon.Category.Category;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    public Brand(String name, String guideLines, String imageUrl, Category category) {
        this.name = name;
        this.guideLines = guideLines;
        this.imageUrl = imageUrl;
        this.category = category;
    }

    private String guideLines;
    private String imageUrl;
    @ManyToOne
    private Category category;



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGuideLines() {
        return guideLines;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Category getCategory() {
        return category;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
