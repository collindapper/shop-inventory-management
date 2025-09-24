package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.PartService;
import com.example.demo.service.PartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;
    private ApplicationContext context;
    private PartService partService;
    private List<Part> theParts;
    private static Product product1;
    private Product product;

    @PostMapping("/buyproduct")
    public String buyProduct(@RequestParam("productID") int theId, Model theModel) {
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product product1 = productService.findById(theId);

        int currInv = product1.getInv();
        currInv = currInv - 1;
        product1.setInv(currInv);

        return "confirmationbuyproduct";
    }
}
