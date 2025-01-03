package lesson_4.lesson_demo.aggregation;

import java.util.List;

public class Auto {
    private List<Person> persons;

    public Auto(List<Person> persons) {
        this.persons = persons;

        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
