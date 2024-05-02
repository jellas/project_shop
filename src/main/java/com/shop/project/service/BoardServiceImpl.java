package com.shop.project.service;

import com.shop.project.dto.ProductsDto;
import com.shop.project.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardMapper boardMapper;


    @Override
    public List<ProductsDto> selectPrdList() throws Exception {
        return boardMapper.selectPrdList();
    }

    @Override
    public ProductsDto selectPrdOne(int prdIdx) throws Exception {
        ProductsDto prd = boardMapper.selectPrdOne(prdIdx);
        return prd;
    }

//    @Override
//    public void insertPrd(ProductsDto prd) throws Exception {
//        boardMapper.insertPrd(prd);
//    }
}
