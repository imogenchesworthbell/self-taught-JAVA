package ScooterApp.src;

public class User {
    private String username;
    private String password;
    private int age;
    private boolean loggedIn;

    public User(String username, String password, int age){
        this.username = username;
        this.password = password;
        this.age = age;
        this.loggedIn = false;
    }

    public String getUsername(){
        return username;
    }

    public boolean isLoggedIn(){
        return loggedIn;
    }

    public void login(String password){
        if(this.password.equals(password)){
            this.loggedIn = true;
            System.out.println("User " + username + " is logged in");
        } else{
            throw new IllegalArgumentException("Incorrect Password!");
        }
    }

    public void logout(){
        this.loggedIn = false;
        System.out.println("User " + username + " is logged out");
    }
}
