package com.versions.java8.majorFunctions;

import com.versions.java8.common.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingJava8 {


    public static void main(String[] args) {

        switch (1){
            case 1 :
            {
                sortByEmployeeSalary();
                break;
            }
            case 2:
            {
                sortByEmployeeSalaryAndAge();
                break;
            }

        }
    }

    private static void sortByEmployeeSalaryAndAge() {
        List<Employee> list= new ArrayList<>();
        list = Employee.getEmployeeList();

        List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)).collect(Collectors.toList());
        System.out.println(collect);
        //same thing does not work with lambda
      //  list.stream().sorted(Comparator.comparing(e->e.getName()).thenComparing(e1->e1.getAge());

   }

    private static void sortByEmployeeSalary() {
        List<Employee> list= new ArrayList<>();
        list = Employee.getEmployeeList();

        list.stream().sorted(Comparator.comparing(Employee::getName));
        System.out.println(list);
        List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(collect); //to see the sorted result we need to collect
        //as we also know till the time we use any terminal opertion, streams are lazy
        List<Employee> collect1 = list.stream().sorted(Comparator.comparing(e -> e.getName(), Collections.reverseOrder())).collect(Collectors.toList());

        System.out.println(collect1);
    }

}
