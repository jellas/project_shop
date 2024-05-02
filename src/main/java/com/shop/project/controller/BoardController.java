package com.shop.project.controller;


import com.shop.project.dto.ProductsDto;
import com.shop.project.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @RequestMapping("/jShop/main")
    public ModelAndView sampleLi() throws Exception {
        ModelAndView mv = new ModelAndView("/shop/itemList");
        List<ProductsDto> prd = boardService.selectPrdList();
        mv.addObject("prd", prd);
        return mv;
    }
}
