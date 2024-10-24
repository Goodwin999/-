public class StringExample {

    public void printString() {
        String street = "Манежная";
        street = street + " площадь";
        System.out.println("Адрес магазина – " + street);
    }


    public void printStringName() {
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = "Иванов Иван Иванович";
        System.out.println("Ф. И. О. сотрудника - " + lastName + " " + firstName + " " + middleName);
        System.out.println("Ф. И. О. сотрудника - " + fullName);
    }

    public void printStringNameUpperCase() {
        String fullName = "Иванов Иван Иванович";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public void printStringReplaceSymbol() {
        String fullName = "Иванов Семён Семёновчи";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }


}
