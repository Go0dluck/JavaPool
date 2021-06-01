public class Program {
    public static void main(String[] args) {
        UsersArrayList UserArr = new UsersArrayList();

        UserArr.AddUser("User1");
        UserArr.AddUser("User2");
        UserArr.AddUser("User3");
        UserArr.AddUser("User4");
        UserArr.AddUser("User5");
        UserArr.AddUser("User6");
        UserArr.AddUser("User7");
        UserArr.AddUser("User8");
        UserArr.AddUser("User9");
        UserArr.AddUser("User10");
        UserArr.AddUser("User11");
        System.out.println(UserArr.RetrieveNumberUsers());
        try {
            System.out.println(UserArr.RetrieveUserId(123).getName());
        } catch (UserNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(UserArr.RetrieveUserId(4).getName());
        } catch (UserNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println(UserArr.RetrieveUserIndex(2).getName());
    }
}
