package tebogo.mkhize.projects.investmentsmanager.product.domain;

import org.springframework.stereotype.Service;


@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
