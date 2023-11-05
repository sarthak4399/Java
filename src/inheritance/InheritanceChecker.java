package inheritance;

public class InheritanceChecker {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("sarthak");
        person.setAge(21);
        person.setGender("Male");
        System.out.println(person.getName());

        Employee employee = new Employee();
        employee.setEmployeeId(" @505cs");
        employee.setName("Hindavi ");

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getName());




    }
}
