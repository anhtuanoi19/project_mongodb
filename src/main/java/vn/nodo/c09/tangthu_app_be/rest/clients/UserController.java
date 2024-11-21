package vn.nodo.c09.tangthu_app_be.rest.clients;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.nodo.c09.tangthu_app_be.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String home(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "view/index"; // Tên file Thymeleaf (index.html)
    }
}
