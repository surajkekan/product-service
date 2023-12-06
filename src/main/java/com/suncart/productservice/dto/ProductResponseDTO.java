package com.suncart.productservice.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductResponseDTO {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
