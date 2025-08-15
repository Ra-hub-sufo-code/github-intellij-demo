package com.cfs.JPA_P02.repo;

import com.cfs.JPA_P02.entity.Laptop;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop,Long> {
}
