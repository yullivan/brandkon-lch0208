package RepositoryTest;

import brandkon.Category.Category;
import brandkon.Category.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

//
//public class CategoryRepositoryTest {
//    @Autowired
//    CategoryRepository categoryRepository;
//
//    void SaveLocalDateTime() {
//        Category category = new Category('23 ',"cafe","","");
//        assertThat(category.getId()).isNull();
//        assertThat(category.getCreateAt()).isNull();
//        assertThat(category.getUpdateAt()).isNull();
//
//        categoryRepository.save(category);
//
//        assertThat(category.getId()).isNotNull();
//        assertThat(category.getCreateAt()).isNotNull();
//        assertThat(category.getUpdateAt()).isNotNull();
//
//    }
//
//}
