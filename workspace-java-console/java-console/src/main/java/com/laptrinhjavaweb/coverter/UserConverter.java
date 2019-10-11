package com.laptrinhjavaweb.coverter;

import org.modelmapper.ModelMapper;

import com.laptrinhjavaweb.DTO.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;

public class UserConverter {
	public UserDTO ConvertToDTO(UserEntity entity) {
		ModelMapper modelmapper = new ModelMapper();
		return modelmapper.map(entity, UserDTO.class);
		
	}
}
