package com.vlu.bokkit.service;

import com.vlu.bokkit.dto.DetailedUserDTO;
import com.vlu.bokkit.dto.UserDTO;

import java.util.List;

public interface UserService {
    
    DetailedUserDTO createUser(UserDTO userDTO);

    List<UserDTO> getAllUser();
}
