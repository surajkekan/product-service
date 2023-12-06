package com.suncart.productservice.controller;

import com.suncart.productservice.dto.ProductRequestDTO;
import com.suncart.productservice.dto.ProductResponseDTO;
import com.suncart.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public void createProduct(@RequestBody ProductRequestDTO productRequest){
        productService.createProduct(productRequest);
    }

    @GetMapping
    public List<ProductResponseDTO> getProduct(){
        return productService.getAllProducts();
    }
}

