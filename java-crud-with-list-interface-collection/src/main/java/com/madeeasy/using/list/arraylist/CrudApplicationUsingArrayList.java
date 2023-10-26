package com.madeeasy.using.list.arraylist;

import com.madeeasy.using.list.arraylist.model.Address;
import com.madeeasy.using.list.arraylist.model.Student;
import com.madeeasy.using.list.arraylist.service.impl.StudentServiceImpl;

import java.util.List;

public class CrudApplicationUsingArrayList {

    public static void main(String[] args) throws Exception {
        Address address = new Address();
        address.setPinCode("6545");
        address.setVillageName("brindabanchak");
        Student student = new Student();
        student.setId("2");
        student.setAddress(address);
        student.setName("soumitra");
        student.setPhoneNo("33656536535365");
        StudentServiceImpl service = new StudentServiceImpl();
        Student savedStudent = service.createStudent(student);
        System.out.println("savedStudent = " + savedStudent);

        Address address1 = new Address();
        address1.setPinCode("6545");
        address1.setVillageName("brindabanchak");
        Student student1 = new Student();
        student1.setId("1");
        student1.setAddress(address1);
        student1.setName("pabitra");
        student1.setPhoneNo("33656536535365");
        Student savedStudent1 = service.createStudent(student1);
        System.out.println("savedStudent = " + savedStudent1);
        List<Student> all = service.findAll();
        System.out.println("all = " + all);
//        System.out.println("using findById : " + service.findById("1"));
//        System.out.println("using findById : " + service.findById("2"));
//        System.out.println("using findByName : " + service.findByName("pabitra"));
        // update student named "pabitra"
        List<Student> findByIdWhoseIdIs1 = service.findById("1");
        findByIdWhoseIdIs1.forEach(std -> {
            std.setName("pabitra bera");
            std.setId("1");
            std.setBranch("cse (java backend developer)");
            std.setPhoneNo("33656536535365");
            std.setAddress(new Address("6545", "brindabanchak"));
            service.updateStudent(std.getId(), std);
        });
        System.out.println("findById : " + service.findById("1"));
        String resultAfterDeletingOfId1 = service.deleteById("1");
        System.out.println("resultAfterDeletingOfId1 = " + resultAfterDeletingOfId1
                + " findById : " + service.findById("1"));
    }
}
