package com.cfs.SecurityP05.service;

import com.cfs.SecurityP05.entity.AppUser;
import com.cfs.SecurityP05.entity.Role;
import com.cfs.SecurityP05.entity.UserRequest;
import com.cfs.SecurityP05.repo.RoleRepository;
import com.cfs.SecurityP05.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder encoder;

    public UserService() {}

    public void saveUsers(List<UserRequest> userRequests){
        for (UserRequest request:userRequests){
            AppUser user=new AppUser();
            user.setUsername(request.getUsername());
            user.setPassword(encoder.encode(request.getPassword()));
            user.setEnabled(true);

            Set<Role> roleSet=new HashSet<>();
            for (String roleName:request.getRoles()){
                Role role=roleRepository.findByName(roleName)
                        .orElseGet(()->{
                            Role newRole=new Role();
                            newRole.setName(roleName);
                            return roleRepository.save(newRole);
                        });
                roleSet.add(role);
            }

            user.setRoles(roleSet);
            userRepository.save(user);
        }
    }
}
