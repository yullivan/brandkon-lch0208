package brandkon;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryService {


    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public  List<CategoryResponse> findAll() {
        List<Category>categories = CategoryRepository.findAll();
        return categories.stream().map(category -> new CategoryResponse(
                category.name(),
                category.id())).collect(Collectors.toList());



    }
}
