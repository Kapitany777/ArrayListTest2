package eu.braincluster;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void example1()
    {
        System.out.println("ArrayList Example 1");

        List<Person> persons = new ArrayList<>();

        System.out.println("The list is empty: " + persons.isEmpty());

        System.out.println("Adding new elements...");

        persons.add(new Person("John", "Smith"));
        persons.add(new Person("James", "Smith"));

        System.out.println("The list is empty: " + persons.isEmpty());

        System.out.println("Number of elements: " + persons.size());

        System.out.println("The elements of the list:");

        for (Person person : persons)
        {
            System.out.println(person);
        }

        System.out.println("Deleting elements...");
        persons.clear();
        System.out.println("The list is empty: " + persons.isEmpty());
    }

    private static void example2()
    {
        System.out.println("ArrayList Example 2");

        List<Person> persons1 = new ArrayList<>();

        persons1.add(new Person("John", "Smith"));
        persons1.add(new Person("James", "Smith"));

        List<Person> persons2 = new ArrayList<>(persons1);

        System.out.println("The elements of the second list:");

        for (Person person : persons2)
        {
            System.out.println(person);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("ArrayList test program");

        example1();
        System.out.println();

        example2();
        System.out.println();
    }
}
