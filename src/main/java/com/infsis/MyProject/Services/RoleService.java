package com.infsis.MyProject.Services;

import com.infsis.MyProject.DTOs.RoleDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    List<RoleDTO> getRoles();
    RoleDTO getRoleById(Integer roleId);
    RoleDTO saveRole(RoleDTO roleDTO);
    RoleDTO updateRole(Integer roleId, RoleDTO roleDTO);
    void delete(Integer roleId);
}
