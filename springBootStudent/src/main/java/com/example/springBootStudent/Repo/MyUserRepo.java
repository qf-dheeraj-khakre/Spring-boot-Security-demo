package com.example.springBootStudent.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springBootStudent.Model.User;

@Repository
public interface  MyUserRepo extends   JpaRepository<User, Integer> {
    
    @Query("select s from User s where s.userName = ?1")
    Optional<User> findUserByUserName(String userName);
}
