package com.wpp.controller;
import com.wpp.domain.Product;
import com.wpp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(path = "/product")
public class ProductorController {

    @Autowired
    private IProductService productService;
    @RequestMapping(path = "/finaAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> products = productService.findAllProduct();
        mv.addObject("productList",products);
        mv.setViewName("product-list");
        return mv;
    }
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.registerCustomEditor(Date.class, new MyDateEdit("yyyy-MM-dd HH:mm"));
//    }
    @RequestMapping(path = "/save.do")
    public String save(Product product) throws Exception {
        System.out.println("保存controller执行了");
        System.out.println(product);
        productService.save(product);
        return "redirect:finaAll.do";
    }
}
