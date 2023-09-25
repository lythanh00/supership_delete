package com.supership.ship.service.impl;

import com.supership.ship.entity.RoleEntity;
import com.supership.ship.entity.UserEntity;
import com.supership.ship.model.converter.RoleConverter;
import com.supership.ship.model.converter.UserConverter;
import com.supership.ship.model.dto.RoleDTO;
import com.supership.ship.model.dto.UserDTO;
import com.supership.ship.repository.RoleRepository;
import com.supership.ship.repository.UserRepository;
import com.supership.ship.service.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private RoleConverter roleConverter;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        UserEntity userEntity = new UserEntity();
        if (userDTO.getId() != null){
            Optional<UserEntity> userEntityOptional = userRepository.findById(userDTO.getId());
            UserEntity oldUserEntity = userEntityOptional.orElse(null);
            userEntity = userConverter.toEntity(userDTO, oldUserEntity);
        } else {
            userEntity = userConverter.toEntity(userDTO);
        }
        userEntity = userRepository.save(userEntity);

        return userConverter.toDTO(userEntity);
    }

    @Override
    public RoleDTO saveRole(RoleDTO roleDTO) {
        RoleEntity roleEntity = new RoleEntity();
        if (roleDTO.getId() != null){
            Optional<RoleEntity> roleEntityOptional = roleRepository.findById(roleDTO.getId());
            RoleEntity oldRoleEntity = roleEntityOptional.orElse(null);
            roleEntity = roleConverter.toEntity(roleDTO, oldRoleEntity);
        } else {
            roleEntity = roleConverter.toEntity(roleDTO);
        }
        roleEntity = roleRepository.save(roleEntity);

        return roleConverter.toDTO(roleEntity);
    }
}
