package com.vlu.bokkit.service.impl;

import com.vlu.bokkit.dto.UserDTO;
import com.vlu.bokkit.entity.User;
import com.vlu.bokkit.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public DetailedUserDTO createUser(UserDTO userDTO) {
        validateUserExists(userDTO);
        User currentUser = new User();
        return convertEntityToDTO(userRepo.save(currentUser));
    }
}
