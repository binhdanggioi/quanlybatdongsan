package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.DTO.BuildingDTO;
import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.paging.Pageable;

public interface IBuildingService {
	List<BuildingDTO> findAll(BuildingSearchBuilder fieldSearch, Pageable pageable);
}
