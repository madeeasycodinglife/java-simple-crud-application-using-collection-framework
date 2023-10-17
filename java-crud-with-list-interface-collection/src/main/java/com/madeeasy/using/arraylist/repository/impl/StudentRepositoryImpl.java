package com.madeeasy.using.arraylist.repository.impl;

import com.madeeasy.using.arraylist.model.Student;
import com.madeeasy.using.arraylist.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentRepositoryImpl implements StudentRepository {

    private List<Student> studentList = new ArrayList<>();

    @Override
    public Student createStudent(Student student) throws Exception {
        boolean added = studentList.add(student);
        if (!added)
            throw new Exception("not added");
        return student;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public List<Student> findById(String id) {
        return studentList.stream()
                .filter(student -> student.getId().equals(id))
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> findByName(String name) {
        return studentList.stream()
                .filter(student -> student.getName().equals(name))
                .collect(Collectors.toList());
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
        Student updatedStudent = studentList.stream()
                .filter(student1 -> student1.getId().equals(id))
                .findFirst()
                .map(student1 -> {
                            student1.setName(student.getName());
                            student1.setPhoneNo(student.getPhoneNo());
                            student1.setAddress(student.getAddress());
                            return student1;
                        }
                )
                .get();
        return updatedStudent;
    }

    @Override
    public Student partialUpdate(String id, Student student) {
        return null;
    }

    @Override
    public String deleteById(String id) {
        boolean flag = studentList.removeIf(student -> student.getId().equals(id));
        if (!flag)
            return "not deleted";
        return "deleted successfully";
    }
}
