package eshop_rest_api.demo.service;

import eshop_rest_api.demo.entity.Role;
import eshop_rest_api.demo.payload.LoginDto;
import eshop_rest_api.demo.payload.RegisterDto;

import java.util.List;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    String createRole(Role role);
    String deleteRole(String name);
    List<Role> getAllRoles();
    String getRoleByName(String name);

}
