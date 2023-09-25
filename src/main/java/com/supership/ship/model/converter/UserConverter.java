package com.supership.ship.model.converter;

import com.supership.ship.entity.User;
import com.supership.ship.entity.UserEntity;
import com.supership.ship.model.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserEntity toEntity(UserDTO dto){
        UserEntity entity = new UserEntity();
        entity.setUserName(dto.getUserName());
        entity.setPassword(dto.getPassword());
        entity.setFullName(dto.getFullName());
        entity.setEmail(dto.getEmail());
        entity.setIsActived(dto.getIsActived());
        return entity;
    }

    public UserDTO toDTO(UserEntity entity){
        UserDTO dto = new UserDTO();
        if (entity.getId() != null){
            dto.setId(entity.getId());
        }
        dto.setUserName(entity.getUserName());
        dto.setPassword(entity.getPassword());
        dto.setFullName(entity.getFullName());
        dto.setEmail(entity.getEmail());
        dto.setIsActived(entity.getIsActived());
        return dto;
    }

    public UserEntity toEntity(UserDTO dto, UserEntity entity){
        entity.setUserName(dto.getUserName());
        entity.setPassword(dto.getPassword());
        entity.setFullName(dto.getFullName());
        entity.setEmail(dto.getEmail());
        entity.setIsActived(dto.getIsActived());
        return entity;
    }
}
