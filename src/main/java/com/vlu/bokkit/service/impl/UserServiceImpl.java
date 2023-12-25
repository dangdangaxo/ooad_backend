package com.vlu.bokkit.service.impl;

import com.vlu.bokkit.dto.DetailedUserDTO;
import com.vlu.bokkit.dto.UserDTO;
import com.vlu.bokkit.entity.User;
import com.vlu.bokkit.exception.UserAlreadyExistsException;
import com.vlu.bokkit.repository.UserRepository;
import com.vlu.bokkit.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private static final String USER_ALREADY_EXISTS = "User already exists";

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepository = userRepo;
    }

    @Override
    public DetailedUserDTO createUser(UserDTO userDTO) {
        validateUserExists(userDTO.getIdentityNumber());
        User currentUser = new User();
        return convertEntityToDTO(userRepository.save(currentUser));
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(this::convertUserToUserDTO)
                .collect(Collectors.toList());
    }

    private UserDTO convertUserToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

    private DetailedUserDTO convertEntityToDTO(User user) {
        DetailedUserDTO detailedUserDTO = new DetailedUserDTO();
        BeanUtils.copyProperties(user, detailedUserDTO);
        return detailedUserDTO;
    }

    private User validateUserExists(String identityNumber) {
        User existsUser = userRepository.findUserByIdentityNumber(identityNumber);
        if (Objects.nonNull(existsUser)) {
            throw new UserAlreadyExistsException(USER_ALREADY_EXISTS, new Object[]{identityNumber});
        }
        return existsUser;
    }
}
