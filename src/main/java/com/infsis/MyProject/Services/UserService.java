package com.infsis.MyProject.Services;

import com.infsis.MyProject.DTOs.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    Optional<UserDTO> getUserById(Integer userId);
    UserDTO saverUser(UserDTO userDTO);
    UserDTO updateUser(Integer userId, UserDTO userDTO);
    void delete(Integer userId);
}
