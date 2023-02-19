package com.example.crudboot.dao;

import com.example.crudboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User save(User user);

    void deleteById(Long id);

    List<User> findAll();

    User getById(Long id);
}