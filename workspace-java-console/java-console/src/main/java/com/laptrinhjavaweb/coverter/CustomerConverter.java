package com.laptrinhjavaweb.coverter;

import org.modelmapper.ModelMapper;

import com.laptrinhjavaweb.DTO.CustomerDTO;
import com.laptrinhjavaweb.entity.CustomerEntity;

public class CustomerConverter {
	public CustomerDTO convertToDTO(CustomerEntity entity) {
		ModelMapper modelMapper = new ModelMapper();
		CustomerDTO csdto = modelMapper.map(entity,CustomerDTO.class);
		return csdto;
		
	}
}
