package com.versions.java8.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Employee {
   private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;
    private List<String> skills;



    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary,List<String> skills) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.skills = skills;
    }





    public static Stream<Employee> getEmployeeStream() {
        return Stream.of(
                new Employee(2, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0, Arrays.asList("Java", "Spring", "SQL")),
                new Employee(1, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0, Arrays.asList("Python", "React", "MongoDB")),
                new Employee(101, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0,Arrays.asList("Java", "Spring", "SQL")),
                new Employee(4, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0, Arrays.asList("Python", "React", "MongoDB")),
                new Employee(3, "Nima Roy", 27, "Female", "HR", 2013, 22700.0,Arrays.asList("Java", "Spring", "SQL")),
                new Employee(201, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0, Arrays.asList("Python", "React", "MongoDB")),
                new Employee(8, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0,Arrays.asList("C++", "C", "C#"))
        );
    }

    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0, Arrays.asList("Java", "Spring", "SQL")));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0, Arrays.asList("Python", "React", "MongoDB")));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0,Arrays.asList("Java", "Spring", "SQL")));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0, Arrays.asList("Python", "React", "MongoDB")));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0,Arrays.asList("Java", "Spring", "SQL")));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0, Arrays.asList("C++", "C", "C#")));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0,Arrays.asList("Python", "React", "MongoDB")));
        return employeeList;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}
