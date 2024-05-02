package com.shop.project.controller;


import com.shop.project.dto.ProductsDto;
import com.shop.project.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;
    
    /*메인*/
    @RequestMapping("/jShop/main")
    public ModelAndView selectPrdList() throws Exception {
        ModelAndView mv = new ModelAndView("/shop/itemList");
        List<ProductsDto> prd = boardService.selectPrdList();
        mv.addObject("prd", prd);
        return mv;
    }

    /*게시글 하나*/
    @RequestMapping(value = "/jShop/item/{prdIdx}", method = RequestMethod.GET)
    public ModelAndView selectPrdOne(@PathVariable("prdIdx") int prdIdx) throws Exception {
        ModelAndView mv = new ModelAndView("/shop/item_one");
        ProductsDto prd = boardService.selectPrdOne(prdIdx);
        mv.addObject("prd", prd);
        return mv;
    }
}
