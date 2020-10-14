public class AdressBook {
    public static void main(String[] args) {

        User[] users = new User[2];
        users[0] = new User("Jan", 33);
        users[1] = new User("Daniel", 47);

        for (int i = 0; i < users.length; i++){
            System.out.println(users[i].toString());
        }


    }
}
