package com.user.service.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.service.userservice.pojo.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
