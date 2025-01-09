package brandkon.practice;


import brandkon.Product.Product;
import brandkon.Product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class TestProductController {
//
//    private final TestProductRepository repository;
//
//    public TestProductController(TestProductRepository repository) {
//        this.repository = repository;
//    }
//}

    /*

    POST /products

    {
      "name": "티셔츠",
      "options": [
        {
          "name": XL,
          "stock": 50
        },
        {
          "name": L,
          "stock": 100
        },
        {
          "name": M,
          "stock": 80
        }
      ]
    }


    * */


//    // 상품 등록 API
//    @PostMapping("/products")
//    public void createProduct(@RequestBody CreateTestProductRequest request) {
//
//        TestProduct product = new TestProduct(request.name(),request.options()
//                .stream()
//                .map(TestProduct -> new
//
//
//        )));
//        repository.save(product);
//    }
//    // 원하는것:product 만 저장해도 옵션까지 같이 저장되는 기능
//    // 상품 디티오를 받아줄 문장이 필요함
//
//}
