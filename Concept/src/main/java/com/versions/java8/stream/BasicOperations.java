package com.versions.java8.stream;

import com.versions.java8.common.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BasicOperations {

    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        employeeList = Employee.getEmployeeList();
        System.out.println("Total Employee count:"+ employeeList.size());
        switch (3) {

            case 1: {

                getStringStream();
                break;
            }

            case 2: {
                getNumberStreamUtil_10();
                break;
            }

            case 3: {
                getNumberStreamUtil_10_AsString();
                break;
            }
        }
    }





    public static Stream<String> getStringStream(){
        return Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
    }

    public static Stream<Integer> getNumberStreamUtil_10(){
        return Stream.iterate(0, n -> n + 1)
                .limit(10);
    }

    public static Stream<String> getNumberStreamUtil_10_AsString(){
        return Stream.iterate(0, n -> n + 1)
                .limit(10).map(String::valueOf);
    }


    public static void printNumbersLessThan5() {
        Stream<Integer> numStream = Stream.iterate(0, n -> n + 1)
                .limit(10);
        numStream.filter(e -> e < 5).forEach(e -> System.out.println(e));
    }


}
