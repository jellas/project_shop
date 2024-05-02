package com.shop.project.dto;

import lombok.Data;

@Data
public class ProductsDto {
    int prdIdx;
    String prdId;
    String prdName;
    int prdPrice;
    String prdImage_url;
}
