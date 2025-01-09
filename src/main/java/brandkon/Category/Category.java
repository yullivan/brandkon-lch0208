package brandkon.Category;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String slug;
    private String imageUrl;
    @CreatedDate
    private LocalDateTime createAt;
    @LastModifiedDate
    private LocalDateTime updateAt;

    public Category(LocalDateTime createAt, LocalDateTime updateAt) {
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Category(Long id, String name,String slug, String imageUrl) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.imageUrl = imageUrl;
    }



}
