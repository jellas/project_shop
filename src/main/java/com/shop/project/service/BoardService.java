package com.shop.project.service;

import com.shop.project.dto.ProductsDto;

import java.util.List;

public interface BoardService {
    
    /*상품 목록*/
    List<ProductsDto> selectPrdList() throws Exception;

    //void insertPrd(ProductsDto prd) throws Exception;

}
