package com.cfs.SecurityP05.entity;

import java.util.List;

public class UserListRequest {

    private List<UserRequest> users;

    public List<UserRequest> getUsers(){
        return this.users;
    }

    public void setUsers(List<UserRequest> users){
        this.users=users;
    }
}
