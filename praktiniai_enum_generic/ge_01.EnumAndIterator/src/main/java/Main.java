public class Main {

    public static void main(String[] args) {

        Employees employees = new Employees();
        Person person01 = new Person("Arto", Education.PHD);
        employees.add(person01);
        employees.print(Education.PHD);




    }

}
