package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/converter")
public class ConverterController {
    @GetMapping
    public String converter() {
        System.out.println("Spring Converter");
        return "converter";
    }

    @PostMapping
    public String save(
            @RequestParam double usd, Model model) {
        double result = usd * 23000;
        model.addAttribute("result", result);
        return "converter";
    }
}