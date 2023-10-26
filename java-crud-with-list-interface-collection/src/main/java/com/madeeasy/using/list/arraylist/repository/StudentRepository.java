package com.madeeasy.using.list.arraylist.repository;

import com.madeeasy.using.list.arraylist.model.Student;

import java.util.List;

public interface StudentRepository {
    public Student createStudent(Student student) throws Exception;

    public List<Student> findAll();

    public List<Student> findById(String id);
    public List<Student> findByName(String name);
    public List<Student> findByBranch(String branch);
    public List<Student> findByPhoneNo(String phoneNo);

    public Student updateStudent(String id, Student student);

    public Student partialUpdate(String id, Student student);

    public String deleteById(String id);
}
