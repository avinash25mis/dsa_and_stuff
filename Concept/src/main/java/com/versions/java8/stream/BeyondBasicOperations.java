package com.versions.java8.stream;

import com.versions.java8.common.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BeyondBasicOperations {
/*;
String name;
int age;
String gender;
String department;
int yearOfJoining;
double salary;

*/



    private static List<Employee> employeeList = new ArrayList<>();


    public static void main(String[] args) {
        employeeList = Employee.getEmployeeList();
        printFemaleMaleEmployeesCount();
    }

    private static void printFemaleMaleEmployeesCount() {
     //simplest way
      long male = employeeList.stream().filter(e -> e.getGender().equals("Male")).count();
      //only grouping by gives the map
      Map<String, List<Employee>> genderWiseList = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
      //grouping by with followed by Collector.counting() gives count
      Map<String, Long>        genderAndItsCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

     // similarly grouping by department and followed by sum of salary of each department
      Map<String, Double> deptAndTotalSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

      //grouping by department and followed by sum of salary of each department
      Map<String, Double> deptAndItsAvgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
      System.out.println();

      //how to group by a simple array then ?
      List<String> items = Arrays.asList("apple", "apple", "banana","apple", "orange", "banana", "papaya");
      // this gives the count of each fruit
      Map<String, Long> occuranceOfFruits =  items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      Map<String, Long> occuranceOfFruits2 = items.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));






 }/*
 When to use map
 Use map() when you want to transform each element of a Stream from type T to type R (e.g., Employee -> String, Employee -> Integer, Employee -> DTO)

 */


    private static void printAllDepartmentNames() {

        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).keySet().forEach(System.out::println);
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

    }



}
