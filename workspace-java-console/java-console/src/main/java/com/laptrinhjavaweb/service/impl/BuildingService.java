package com.laptrinhjavaweb.service.impl;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.DTO.BuildingDTO;
import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.coverter.BuildingConverter;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.paging.Pageable;
import com.laptrinhjavaweb.repository.IBuildingRepository;
import com.laptrinhjavaweb.repository.impl.BuildingRepository;
import com.laptrinhjavaweb.service.IBuildingService;

public class BuildingService implements IBuildingService {

	private IBuildingRepository buildingRepository = new BuildingRepository();
	private BuildingConverter buildingConverter = new BuildingConverter();

	@Override
	public List<BuildingDTO> findAll(BuildingSearchBuilder fieldSearch, Pageable pageable) {
		Map<String, Object> properties = convertToMapProperties(fieldSearch);
		List<BuildingEntity> buildingEntities = buildingRepository.findAll(properties,pageable , fieldSearch);
		return buildingEntities.stream().map(item -> buildingConverter.covertToDTO(item)).collect(Collectors.toList());
	}

	private Map<String, Object> convertToMapProperties(BuildingSearchBuilder fieldSearch) {
		Map<String, Object> properties = new HashMap<>();
		try {
			Field[] fields = BuildingSearchBuilder.class.getDeclaredFields();
			for (Field field : fields) {
				if (!field.getName().equals("buildingTypes") && !field.getName().startsWith("costRent") 
						&& !field.getName().startsWith("areaRent") && !field.getName().equals("staffId") ) {
					field.setAccessible(true);
					if (field.get(fieldSearch) instanceof String) {
						if (field.getName().equals("buildingarea") || (field.getName().equals("numberOfBasement"))) {
							if (field.get(fieldSearch) != null
									&& StringUtils.isNotEmpty((String) field.get(fieldSearch))) {
								properties.put(field.getName().toLowerCase(),
										Integer.parseInt((String) field.get(fieldSearch)));
							}
						} else {
							properties.put(field.getName().toLowerCase(), field.get(fieldSearch));
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return properties;
	}
}
