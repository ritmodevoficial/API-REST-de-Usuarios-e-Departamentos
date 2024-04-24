package com.ritmodev.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ritmodev.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
