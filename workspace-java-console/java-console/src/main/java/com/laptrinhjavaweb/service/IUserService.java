package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.DTO.UserDTO;
import com.laptrinhjavaweb.paging.Pageable;

public interface IUserService {
	List<UserDTO> findAll(Pageable pageable);
}
