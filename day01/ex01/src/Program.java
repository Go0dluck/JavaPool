public class Program {
    public static void main(String[] args) {
        User test = new User("Dima");
        System.out.println(test.getIdentifier());
        User test1 = new User("Oleg");
        System.out.println(test1.getIdentifier());
        User test2 = new User("Misha");
        System.out.println(test2.getIdentifier());
    }
}
