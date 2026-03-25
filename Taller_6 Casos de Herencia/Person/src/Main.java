public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("Sofia", "MZ 14 C 9 barrio sumatanbo");
        System.out.println(myPerson);

        Person myStaff = new Staff("Sebastian", "Por ahi", "UCC", 400000);
        System.out.println(myStaff);

        Person myStudent = new Student("Pepe", "Por alla", "Ingenieria", 2026, 500000);
        System.out.println(myStudent);
    }
}
