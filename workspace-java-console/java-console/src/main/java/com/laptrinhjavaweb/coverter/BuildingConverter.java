package com.laptrinhjavaweb.coverter;

import org.modelmapper.ModelMapper;

import com.laptrinhjavaweb.DTO.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;

public class BuildingConverter {
	public BuildingDTO covertToDTO(BuildingEntity entity) {
		ModelMapper modelMapper = new ModelMapper();
		BuildingDTO dto = modelMapper.map(entity, BuildingDTO.class);
		return dto;
	}
}
