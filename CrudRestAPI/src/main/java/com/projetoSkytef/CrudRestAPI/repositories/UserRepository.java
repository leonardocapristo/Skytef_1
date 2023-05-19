package com.projetoSkytef.CrudRestAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSkytef.CrudRestAPI.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
