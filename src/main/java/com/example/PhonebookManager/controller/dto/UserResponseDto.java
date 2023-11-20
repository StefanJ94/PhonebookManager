package com.example.PhonebookManager.controller.dto;

import com.example.PhonebookManager.domain.entity.RoleType;

public class UserResponseDto {

    private String email;
    private RoleType roleType;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}
