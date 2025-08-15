package com.cfs.JPA_P03.repo;

import com.cfs.JPA_P03.entity.Course;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
}
