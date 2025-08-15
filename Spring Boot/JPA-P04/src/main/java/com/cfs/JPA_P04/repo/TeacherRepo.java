package com.cfs.JPA_P04.repo;

import com.cfs.JPA_P04.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long>{
}
