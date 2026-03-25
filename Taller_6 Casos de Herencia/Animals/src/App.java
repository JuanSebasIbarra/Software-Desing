public class App {
    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog("Bobbo");
        Dog dog2 = new Dog("Señor Chispas");
        Cat cat1 = new Cat("Homero");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(cat1);

        dog1.greets();
        dog1.greets(dog2);
        cat1.greets();
    }
}