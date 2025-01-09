package brandkon.Category;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {


    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public  List<CategoryResponse> getAll() {
        List<Category>categories = categoryRepository.findAll();
        return categoryRepository.findAll()
                .stream()
                .map(category -> new CategoryResponse(
                        category.getId(),
                        category.getName(),
                        category.getSlug(),
                        category.getImageUrl()))
                .toList();



    }
}
