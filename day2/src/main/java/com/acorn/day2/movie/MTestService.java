package com.acorn.day2.movie;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MTestService {

	@Autowired
	MTestDAO testDAO;
	
	public ArrayList<Movie> getMovie(int movie){
		
		ArrayList<Movie> movieList;  
		movieList=testDAO.select();
		return movieList;
		
	}
}
