package com.example.demo.springData.repository;

import com.example.demo.springData.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Long> {
}
