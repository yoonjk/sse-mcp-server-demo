package com.example.sse_mcp_server_demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Getter
@Setter
public class Product {

    private Long id;

    private String productName;

    private String description;

    private String catalog;

    private long price;

    private BigDecimal rate;

    @Builder
    public Product(Long id, String productName, String description, String catalog, long price, BigDecimal rate) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.catalog = catalog;
        this.price = price;
        this.rate = rate;
    }
}