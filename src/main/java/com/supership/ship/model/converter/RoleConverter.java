package com.supership.ship.model.converter;

import com.supership.ship.entity.RoleEntity;
import com.supership.ship.entity.UserEntity;
import com.supership.ship.model.dto.RoleDTO;
import com.supership.ship.model.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter {
    public RoleEntity toEntity(RoleDTO dto){
        RoleEntity entity = new RoleEntity();
        entity.setCode(dto.getCode());
        entity.setName(dto.getName());
        return entity;
    }

    public RoleDTO toDTO(RoleEntity entity){
        RoleDTO dto = new RoleDTO();
        if (entity.getId() != null){
            dto.setId(entity.getId());
        }
        dto.setCode(entity.getCode());
        dto.setName(entity.getName());
        return dto;
    }

    public RoleEntity toEntity(RoleDTO dto, RoleEntity entity){
        entity.setCode(dto.getCode());
        entity.setName(dto.getName());
        return entity;
    }
}
