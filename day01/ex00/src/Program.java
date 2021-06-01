public class Program {
    public static void main(String[] args) {
        User test = new User("Dima");
        User test2 = new User("Oleg");
        Transaction transaction = new Transaction(test, test2, Transfer.DEBITS, 100);
        System.out.println(transaction.toString());
    }
}
