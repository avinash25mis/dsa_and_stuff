package com.versions.java8;

import com.versions.java8.common.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
* this place is to see the question and try writing
*  the code without looking at the solution
*
* */

public class Practice {

    static List<Employee> employeeList = new ArrayList<>();


    public static void main(String[] args) {
        employeeList = Employee.getEmployeeList();
    }


}