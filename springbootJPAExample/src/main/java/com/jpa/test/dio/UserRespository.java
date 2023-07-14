package com.jpa.test.dio;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entityes.User;


public interface UserRespository extends CrudRepository<User,Integer>
{

}
