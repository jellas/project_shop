package com.shop.project.service;

import com.shop.project.dto.ProductsDto;

import java.util.List;

public interface BoardService {
    
    /*상품 목록*/
    List<ProductsDto> selectPrdList() throws Exception;

    /*상품 하나 선택*/
    ProductsDto selectPrdOne(int prdIdx) throws Exception;

    //void insertPrd(ProductsDto prd) throws Exception;

}
