package com.suncart.productservice.service;

import com.suncart.productservice.dto.ProductRequestDTO;
import com.suncart.productservice.dto.ProductResponseDTO;
import com.suncart.productservice.model.Product;
import com.suncart.productservice.respository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequestDTO productRequest){
        Product product= Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} is saved",product.getId());
    }

    public List<ProductResponseDTO> getAllProducts(){
        List<Product> products= productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponseDTO mapToProductResponse(Product product){
        return ProductResponseDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

}
