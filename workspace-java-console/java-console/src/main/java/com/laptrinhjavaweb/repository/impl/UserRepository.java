package com.laptrinhjavaweb.repository.impl;

import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.IUserRepository;

public class UserRepository extends SimpleJpaRepository<UserEntity> implements IUserRepository {

	@Override
	public UserEntity save(UserEntity userEntity) {
		
		return null;
	}

}
