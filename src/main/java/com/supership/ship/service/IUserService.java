package com.supership.ship.service;

import com.supership.ship.model.dto.RoleDTO;
import com.supership.ship.model.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    UserDTO saveUser(UserDTO userDTO);
    RoleDTO saveRole(RoleDTO roleDTO);
    void addToUser(String username, String rolename);
}
