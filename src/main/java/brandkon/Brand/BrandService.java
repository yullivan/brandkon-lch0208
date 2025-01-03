package brandkon.Brand;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
//
//@Service
//public class BrandService {
//    BrandRepository brandRepository;
//
//    public BrandService(BrandRepository brandRepository) {
//        this.brandRepository = brandRepository;
//    }
//
//    List<BrandResponse> findAll() {
//        List<Brand> brands = brandRepository.findAll();
//        return brandRepository.findAll()
//        .stream()
//                .map(brand -> new BrandResponse(
//                        brand.getId(),
//                        brand.getName(),
//                        brand.getGuideLines(),
//                        brand.getImageUrl(),
//                        brand.getCategory()))
//                .toList();
//
//    }
//}
//
