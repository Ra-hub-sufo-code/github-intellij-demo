package com.cfs.JPA.controller;

import com.cfs.JPA.entity.Student;
import com.cfs.JPA.repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student)
    {
        return studentRepo.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents()
    {
        return studentRepo.findAll();
    }

    @PutMapping
    public Student updateStudent(@RequestParam Long id,@RequestBody Student student)
    {
        Student s = studentRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Student Not Found"));
        s.setName(student.getName());
        s.setEmail(student.getEmail());
        return studentRepo.save(s);
    }

    @PatchMapping
    public Student patchStudent(@RequestParam Long id,@RequestParam String name)
    {
        Student s = studentRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Student Not Found"));
        s.setName(name);
        return s;
    }
}
