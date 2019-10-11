package com.laptrinhjavaweb.repository.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.paging.Pageable;
import com.laptrinhjavaweb.repository.IBuildingRepository;

public class BuildingRepository extends SimpleJpaRepository<BuildingEntity> implements IBuildingRepository {

	@Override
	public List<BuildingEntity> findAll(Map<String, Object> params, Pageable pageable, BuildingSearchBuilder fieldSearch) {
		StringBuilder sqlSearch = new StringBuilder("Select * FROM building A");
		if(StringUtils.isNotBlank(fieldSearch.getStaffId())) {
		sqlSearch.append(" INNER JOIN assignmentstaff assignstaff ON A.id = assignstaff.buildingid");
		}
		sqlSearch.append(" WHERE 1=1");
		sqlSearch = this.createSQLfindAll(sqlSearch, params);
		String sqlSpecial = buildSqlSpecial(fieldSearch);
		sqlSearch.append(sqlSpecial);
		return this.findAll(sqlSearch.toString(), pageable);
	}
	private String buildSqlSpecial(BuildingSearchBuilder fieldSearch) {
		StringBuilder result = new StringBuilder("");
		if(StringUtils.isNotBlank(fieldSearch.getCostRentFrom())) {
			result.append(" AND A.costrent >= "+fieldSearch.getCostRentFrom()+"");
		}
		if(StringUtils.isNotBlank(fieldSearch.getCostRentTo())) {
			result.append(" AND A.costrent <= "+fieldSearch.getCostRentTo()+"");
		}
		if(fieldSearch.getBuildingTypes().length > 0) {
			result.append(" AND (");
			//java 7
			/*int i = 0;
			for(String item : fieldSearch.getBuildingTypes()) {
				if(i == 0) {
					result.append("A.type LIKE '%"+item+"%'");
				}else {
					result.append(" OR A.type '%"+item+"%'");
				}
				i++;
			}*/
			//java 8
			result.append("A.type LIKE '%"+fieldSearch.getBuildingTypes()[0]+"%'");
			Arrays.stream(fieldSearch.getBuildingTypes()).filter(item -> item.equals(fieldSearch.getBuildingTypes()[0]))
			.forEach(item -> result.append(" OR A.type LIKE '%"+item+"%'"));
			result.append(")");
		}
		if(StringUtils.isNotBlank(fieldSearch.getAreaRentFrom()) || StringUtils.isNotBlank(fieldSearch.getAreaRentTo())) {
			result.append(" AND EXIST (SELECT * FROM rentarea ra WHERE (ra.building = A.id");
			if(fieldSearch.getAreaRentFrom() != null) {
				result.append(" AND ra.value >= "+fieldSearch.getAreaRentFrom()+"");
			}
			if(fieldSearch.getAreaRentTo() != null) {
				result.append(" AND ra.value <= "+fieldSearch.getAreaRentTo()+"");
			}
			result.append("))");
		}
		if(StringUtils.isNotBlank(fieldSearch.getStaffId())) {
			result.append(" AND assignstaff.id= "+fieldSearch.getStaffId()+"");
			}
		return result.toString();
	}
	@Override
	public BuildingEntity save(BuildingEntity BuildingEntity) {
		
		return null;
	}
	
}
