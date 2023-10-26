package com.madeeasy.using.list.arraylist.service.impl;

import com.madeeasy.using.list.arraylist.model.Student;
import com.madeeasy.using.list.arraylist.repository.StudentRepository;
import com.madeeasy.using.list.arraylist.repository.impl.StudentRepositoryImpl;
import com.madeeasy.using.list.arraylist.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository = new StudentRepositoryImpl();

    @Override
    public Student createStudent(Student student) throws Exception {
        return studentRepository.createStudent(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findById(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public List<Student> findByBranch(String branch) {
        return null;
    }

    @Override
    public List<Student> findByPhoneNo(String phoneNo) {
        return null;
    }

    @Override
    public Student updateStudent(String id, Student student) {
        return null;
    }

    @Override
    public Student partialUpdate(String id, Student student) {
        return null;
    }

    @Override
    public String deleteById(String id) {
        return studentRepository.deleteById(id);
    }
}
