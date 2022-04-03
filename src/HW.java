import java.util.Random;

public class HW {

    private static final int EMPLOYEES_COUNT = 5;
    private static final int MIN_AGE = 40;

    private static final Random ageRandomise = new Random();

    public static void main(String[] args) {

        Employees[] persons = new Employees[EMPLOYEES_COUNT];
        for (int i = 0; i < persons.length; i++) {
            persons [i] = createEmployees(i);
        }
        for (Employees person : persons) {
            if (person.getAge() > MIN_AGE) {
               System.out.println(person.printInfo());
            }
        }
    }


    private static Employees createEmployees (int i) {
        return new Employees(
                "name",
                "surname",
                "Programmer",
                "test" + "@test.com",
                "+79242522776" + i,
                3000 + i * 100,
                ageRandomise.nextInt(30) + 30);
    }
}
