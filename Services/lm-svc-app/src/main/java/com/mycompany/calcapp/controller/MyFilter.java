package com.mycompany.calcapp.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;



@Component
public class MyFilter implements Filter {
	
  

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		 HttpServletResponse httpServletResponse = (HttpServletResponse) response;
	        httpServletResponse.setHeader("X-MathOperation-APP", "super-header");
	        chain.doFilter(request, response);
		
	}

}
