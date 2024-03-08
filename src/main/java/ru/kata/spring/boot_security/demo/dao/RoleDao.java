package ru.kata.spring.boot_security.demo.dao;

import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Set;


@Repository
public interface RoleDao {
    Set<Role> getRoles();
}
