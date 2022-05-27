package com.example.moviebookingticket.converters;

import com.example.moviebookingticket.dto.UserDto;
import com.example.moviebookingticket.entity.UserEntity;

public class UserConverter implements BidirectionalConverter<UserDto, UserEntity> {
    @Override
    public UserDto toDto(UserEntity userEntity) {
        UserDto userDto=new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setName(userEntity.getName());
        userDto.setSurname(userEntity.getSurname());
        userDto.setBirthdate(userEntity.getBirthdate());
        userDto.setRole(userEntity.getRole());
        userDto.setEmail(userEntity.getEmail());
        userDto.setPassword(userEntity.getPassword());
        userDto.setTelephone(userEntity.getTelephone());
        return userDto;
    }

    @Override
    public UserEntity toEntity(UserDto userDto) {
        UserEntity userEntity=new UserEntity();
        userDto.setId(userEntity.getId());
        userDto.setName(userEntity.getName());
        userDto.setSurname(userEntity.getSurname());
        userDto.setBirthdate(userEntity.getBirthdate());
        userDto.setRole(userEntity.getRole());
        userDto.setEmail(userEntity.getEmail());
        userDto.setPassword(userEntity.getPassword());
        userDto.setTelephone(userEntity.getTelephone());
        return userDto;
        return null;
    }
}
