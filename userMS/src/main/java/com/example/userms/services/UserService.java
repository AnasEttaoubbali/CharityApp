package com.example.userms.services;

import com.example.userms.dtos.UserDTORequest;
import com.example.userms.dtos.UserDTOResponse;

public interface UserService {
    UserDTOResponse addUser(UserDTORequest userDTORequest);
    UserDTOResponse updateUser(Long id, UserDTORequest userDTORequest);
    void deleteUser(Long id);
}
