package eu.braincluster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    private static void printPersons(List<Person> persons)
    {
        System.out.println("The elements of the list:");

        for (Person person : persons)
        {
            System.out.println(person);
        }
    }

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

        printPersons(persons);

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

        printPersons(persons2);
    }

    private static void example3()
    {
        System.out.println("ArrayList Example 3");

        List<Person> persons = new ArrayList<>()
        {{
            add(new Person("John", "Smith"));
            add(new Person("Alexander", "Rose"));
        }};

        printPersons(persons);
    }

    private static void example4()
    {
        System.out.println("ArrayList Example 4");

        List<Person> persons =
                List.of(
                        new Person("Mathias", "Jacob"),
                        new Person("Pat", "Garrett")
                );

        printPersons(persons);
    }

    private static void example5()
    {
        System.out.println("ArrayList Example 5");

        List<Person> persons =
                Arrays.asList(
                        new Person("Travis", "Daye"),
                        new Person("Nigel", "Levins"),
                        new Person("Tse", "Sakamoto")
                );

        printPersons(persons);
    }

    public static void main(String[] args)
    {
        System.out.println("ArrayList test program");

        example1();
        System.out.println();

        example2();
        System.out.println();

        example3();
        System.out.println();

        example4();
        System.out.println();

        example5();
        System.out.println();
    }
}
