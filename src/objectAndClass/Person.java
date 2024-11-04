package objectAndClass;
public class Person {
    private String name;
    private String surname;
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
public static void changePerson (Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    System.out.println("Значение внутри метода changePerson: " + person);
}
    @Override
    public String toString() {
        return "Имя " + name + " Фамилия " + surname;
    }

}
