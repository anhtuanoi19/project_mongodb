package vn.nodo.c09.tangthu_app_be.service;

import vn.nodo.c09.tangthu_app_be.domain.User;
import vn.nodo.c09.tangthu_app_be.repo.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
