package com.laptrinhjavaweb.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.DTO.CustomerDTO;
import com.laptrinhjavaweb.builder.CustomerSearchBuilder;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageable;
import com.laptrinhjavaweb.service.ICustomerService;
import com.laptrinhjavaweb.service.impl.CustomerService;
import com.laptrinhjavaweb.utils.FormUtil;

@WebServlet(urlPatterns = { "/api-customer" })
public class CustomerAPI extends HttpServlet {

	private static final long serialVersionUID = 6117447583327902371L;

	private ICustomerService customerService = new CustomerService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		CustomerDTO dto = FormUtil.toModel(CustomerDTO.class, request);
		CustomerSearchBuilder builder = new CustomerSearchBuilder.Customer()
				.setName(dto.getName())
				.setEmail(dto.getEmail())
				.setPhonenumber(dto.getPhoneNumber())
				.setStaffId(dto.getStaffId())
				.build();
		Pageable pageable = new PageRequest(dto.getPage(), dto.getLimit());
		List<CustomerDTO> customer = customerService.findAll(builder, pageable);
		mapper.writeValue(response.getOutputStream(), customer);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
}
