public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobbo", "Bulldog", "Amarillo");
        Dog dog2 = new Dog("Señor Chispas", "Poodle", "Blanco");
        Cat cat1 = new Cat("Homero");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(cat1);
        dog1.greets();
        dog1.greets(dog2);
        cat1.greets();

    }
}
