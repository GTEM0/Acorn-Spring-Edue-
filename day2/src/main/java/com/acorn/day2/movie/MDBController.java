package com.acorn.day2.movie;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MDBController {

    @Autowired
    MTestService service;

    @Autowired
    MTestDAO dao;  

    @RequestMapping("/dbTest1")
    public String test() {
        ArrayList<Movie> r= service.getMovie(1);   
        System.out.println( r);
        dao.select();
        return "movieList";
    }
}
