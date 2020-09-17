package com.gnevanov.dao;

import com.gnevanov.entity.User;
import com.gnevanov.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UsedDaoImpl implements UserDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserMapper());
    }
}
