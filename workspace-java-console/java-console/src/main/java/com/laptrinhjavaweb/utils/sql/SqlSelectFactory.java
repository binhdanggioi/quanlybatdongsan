package com.laptrinhjavaweb.utils.sql;

import java.util.Map;

public interface SqlSelectFactory {
	static void off(Map<String, String> mapSql) {
		if(mapSql != null && mapSql.size() > 0) {
			
		}else {}
	}
	void buildSearchByStaff(String sql);
}
