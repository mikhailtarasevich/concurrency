package com.mt.Chapter6.ch06_recipe05;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons=PersonGenerator.generatePersonList(10);

        // Distinct with objects
        System.out.printf("********************************************************\n");
        System.out.printf("Original List\n");
        persons.parallelStream().forEach(p-> {
            System.out.printf("%s, %s\n", p.getLastName(), p.getFirstName());
        });
        System.out.printf("********************************************************\n");
        System.out.printf("\n");

        System.out.printf("********************************************************\n");
        System.out.printf("List Without duplicates\n");
        persons.parallelStream().distinct().forEach(p-> {
            System.out.printf("%s, %s\n", p.getLastName(), p.getFirstName());
        });
        System.out.printf("********************************************************\n");
        System.out.printf("\n");

        // Distinct with numbers
        System.out.printf("********************************************************\n");
        System.out.printf("Array of numbers without duplicates\n");
        Integer[] numbers={1,3,2,1,2,2,1,3,3,1,1,3,2,1};
        Arrays.asList(numbers).parallelStream().mapToInt( n -> n).distinct().forEach( n -> {
            System.out.printf("Number: %d\n", n);
        });
        System.out.printf("********************************************************\n");
        System.out.printf("\n");

        // Filter with objects
        System.out.printf("********************************************************\n");
        System.out.printf("Filter with persons\n");
        persons.parallelStream().filter(p -> p.getSalary() < 30000).forEach( p -> {
            System.out.printf("%s, %s\n", p.getLastName(), p.getFirstName());
        });
        System.out.printf("********************************************************\n");
        System.out.printf("\n");

        // Filter with numbers
        System.out.printf("********************************************************\n");
        System.out.printf("Filter with numbers\n");
        Arrays.asList(numbers).parallelStream().mapToInt(n -> n).filter( n -> n<2).forEach(  n-> {
            System.out.printf("%d\n", n);
        });
        System.out.printf("********************************************************\n");
        System.out.printf("\n");

        //Limit and skip with numbers
        System.out.printf("********************************************************\n");
        System.out.printf("Limit with numbers\n");
        persons.parallelStream().mapToDouble(Person::getSalary).sorted().limit(5).forEach(s-> {
            System.out.printf("Limit: %f\n",s);
        });
        System.out.printf("********************************************************\n");
        System.out.printf("\n");

        System.out.printf("********************************************************\n");
        System.out.printf("Skip with numbers\n");
        persons.parallelStream().mapToDouble(Person::getSalary).sorted().skip(5).forEach(s-> {
            System.out.printf("Skip: %f\n",s);
        });
        System.out.printf("********************************************************\n");
        System.out.printf("\n");

    }

}
