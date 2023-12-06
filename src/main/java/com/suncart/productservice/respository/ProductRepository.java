package com.suncart.productservice.respository;

import com.suncart.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository< Product,String> {
}

