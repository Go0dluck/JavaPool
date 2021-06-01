public interface UsersList {
    void AddUser(String name);
    User RetrieveUserId(int id) throws UserNotFoundException, UserNotFoundException;
    User RetrieveUserIndex(int index);
    int RetrieveNumberUsers();
}
