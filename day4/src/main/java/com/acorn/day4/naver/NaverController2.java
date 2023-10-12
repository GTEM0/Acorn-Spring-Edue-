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
    ApiExamSearchBlog2 api2; // ApiExamSearchBlog2 클래스의 객체를 자동으로 주입 (의존성 주입)

    @RequestMapping("/naver5")
    public String naverAPI2(Model model) {
        // 네이버 API를 호출하여 결과를 가져오는 메서드를 호출
        String result = api2.getNaverAPI();

        // API 응답을 JSON 데이터에서 변환하여 아이템 목록으로 얻어오는 메서드를 호출
        ArrayList<ItemDTO> list = api2.fromJSONtoItems(result);

        // Model 객체를 사용하여 뷰로 데이터를 전달
        model.addAttribute("items", list);

        // "view"라는 뷰를 반환 (Spring MVC에서 해당 뷰로 이동)
        return "view";
    }
}
