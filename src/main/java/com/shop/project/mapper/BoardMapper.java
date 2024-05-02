package com.shop.project.mapper;

import com.shop.project.dto.ProductsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    /*상품*/
    List<ProductsDto> selectPrdList() throws Exception;
    //void insertPrd(ProductsDto prd) throws Exception;


}
