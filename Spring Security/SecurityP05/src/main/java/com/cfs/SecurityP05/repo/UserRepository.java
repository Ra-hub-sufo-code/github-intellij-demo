package com.cfs.SecurityP05.repo;

import com.cfs.SecurityP05.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser,String>{


    Optional<AppUser> findByUsername(String name);
}
