public class User {
    private String userName;
    private int userAge;

    public User(String userName, int userAge){
        this.userName = userName;
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User {" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }

}
