package com.acorn.day4.naver;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class NaverController2 {

    @Autowired
    ApiExamSearchBlog2 api2;


    @RequestMapping("/naver")
    public String naverAPI2(Model model) {
        String result = api2.getNaverAPI();
        ArrayList<ItemDTO> list = api2.fromJSONtoItems(result);

        model.addAttribute("items", list);

        return "view";
    }
}
