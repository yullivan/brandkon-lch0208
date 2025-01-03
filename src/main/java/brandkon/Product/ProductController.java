package brandkon.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/products")
    public List<ProductResponse> findAll(
            @RequestParam(required = false) Long brandId) {
        return List.of();
    }

    @GetMapping("/products/popular")
    public List<ProductResponse> findPopular(
            @RequestParam(required = false) Long categoryId,
            @RequestParam(required = false) Long brandId) {
        return List.of();
    }

    @GetMapping("/products/{productId}")
    public ProductDetailResponse findById(@PathVariable Long productId) {
        return new ProductDetailResponse(
                1L,
                "아메리카노",
                2000,
                new ProductDetailResponse.Brand(
                        1L,
                        "메가커피",
                        ""
                ),
                366
        );
    }






}
