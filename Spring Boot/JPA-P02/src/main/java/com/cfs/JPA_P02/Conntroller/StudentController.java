package com.cfs.JPA_P02.Conntroller;

import com.cfs.JPA_P02.entity.Student;
import com.cfs.JPA_P02.repo.StudentRepo;
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
    public Student addStudent( @RequestBody Student student){
        return studentRepo.save(student);
    }

    @GetMapping
    public List<Student> fetchAllStudent(){
        return studentRepo.findAll();
    }

    @PutMapping
    public Student updateStudent(@RequestParam Long id,@RequestBody Student student){
        Student st=studentRepo.findById(id).
                orElseThrow(()->new RuntimeException("Student Not Found"));

        st.setName(student.getName());
        st.setRollNum(student.getRollNum());
        return studentRepo.save(st);
    }



}
