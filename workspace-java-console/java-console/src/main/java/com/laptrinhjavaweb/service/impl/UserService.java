//package com.laptrinhjavaweb.service.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.laptrinhjavaweb.DTO.UserDTO;
//import com.laptrinhjavaweb.coverter.UserConverter;
//import com.laptrinhjavaweb.entity.UserEntity;
//import com.laptrinhjavaweb.paging.Pageable;
//import com.laptrinhjavaweb.repository.IUserRepository;
//import com.laptrinhjavaweb.repository.impl.UserRepository;
//import com.laptrinhjavaweb.service.IUserService;
//
//public class UserService implements IUserService {
//
//	private IUserRepository userrepository;
//	private UserConverter userConverter;
//
//	public UserService() {
//		userrepository = new UserRepository();
//		userConverter = new UserConverter();
//	}
//
//	@Override
//	public List<UserDTO> findAll(Pageable pageable) {
//		List<UserDTO> results = new ArrayList<>();
//		List<UserEntity> userEntities = userrepository.findAll(pageable);
//		for (UserEntity item : userEntities) {
//			UserDTO user = userConverter.ConvertToDTO(item);
//			results.add(user);
//		}
//		return results;
//	}
//
//}
