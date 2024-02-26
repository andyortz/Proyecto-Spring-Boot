package com.infsis.MyProject.Services.implement;

import com.infsis.MyProject.DTOs.RoleDTO;
import com.infsis.MyProject.Models.Role;
import com.infsis.MyProject.Services.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public List<RoleDTO> getRoles(){
        return null;
    }
    @Override
    public RoleDTO getRoleById(Integer roleId){
        return null;
    }

    @Override
    public  RoleDTO saveRole(RoleDTO roleDTO){
        return roleDTO;
    }
    @Override
    public RoleDTO updateRole(Integer roleId, RoleDTO roleDTO){
        return roleDTO;
    }
    @Override
    public void delete(Integer roleId){

    }
    private RoleDTO RoletoDto(Role role){
        RoleDTO roleDTO = new RoleDTO(
                role.getId(),
                role.getName()
        );
        return  roleDTO;
    }
    private Role DtoToUser(RoleDTO roleDTO){
        Role role = new Role();
        role.setName(roleDTO.getName());
        return role;
    }

}
