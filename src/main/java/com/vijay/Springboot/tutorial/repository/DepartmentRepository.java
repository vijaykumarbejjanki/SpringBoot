package com.vijay.Springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.Springboot.tutorial.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
