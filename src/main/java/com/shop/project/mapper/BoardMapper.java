package com.shop.project.mapper;

import com.shop.project.dto.ProductsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    /*상품*/
    List<ProductsDto> selectPrdList() throws Exception;

    /*상품 하나 선택*/
    ProductsDto selectPrdOne(int prdIdx) throws Exception;

    //void insertPrd(ProductsDto prd) throws Exception;


}
