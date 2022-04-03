import java.util.Arrays;

public class Employees {
     public String firstName;
     public String surname;
     public String position;
     public String mail;
     public String phone;
     public int salary;
     public int age;

    public Employees(String firstName, String surname, String position, String mail, String phone, int salary, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employees(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String validate () {
        if (age < 18) {
            return "Работник должен быть совершеннолетним!";
        }
        return null;
    }

    public String printInfo () {
        return this.firstName + " " + this.surname + " " + this.position + " " + this.mail + " " + this.phone + " " + this.salary + " " + this.age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", mail='" + mail + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", mail='" + mail + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
