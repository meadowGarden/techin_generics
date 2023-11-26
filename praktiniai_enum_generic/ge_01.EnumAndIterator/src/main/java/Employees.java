import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employeeList;

    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        if (personToAdd != null) {
            employeeList.add(personToAdd);
        }
    }

    public void add(List<Person> peopleToAdd) {
        if (peopleToAdd != null) {
            employeeList.addAll(peopleToAdd);
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }

    public void print() {
        for (Person p : employeeList) {
            System.out.println(p);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }


}
