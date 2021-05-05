package com.example.appBack.Student.controller;

import com.example.appBack.Student.Entity.StudentDTO;
import com.example.appBack.Student.repositorio.ServicioStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class StudentController {

    @Autowired
    ServicioStudent servicioStudent;

    @PostMapping("/addStudent")
    public ResponseEntity addStudent(@RequestBody StudentDTO studentDTO){
        servicioStudent.addStudent(studentDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getStudent/{id}")
    public StudentDTO getStudentById(@PathVariable int id){
        return servicioStudent.getStudent(id);
    }

    @GetMapping("/getStudents")
    public List<StudentDTO> getAllStudents(){
        return servicioStudent.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteStudentById(@PathVariable int id){
        servicioStudent.deleteStudent(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateStudent(@PathVariable int id,@RequestBody StudentDTO studentDTO){
        servicioStudent.updateStudent(id,studentDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getStudent")
    public List<StudentDTO> getStudentConsulta(@RequestBody StudentDTO buscar)
    {
        return servicioStudent.getConsulaCampo(buscar);
    }

}
