public class User {

    private int id;
    private int age;
    private String user;
    private String email;

    public User() {

    }

    public User(String user, String email) {
        this.user = user;
        this.email = email;
    }

    public User(int id, String user, String email) {
        this.id = id;
        this.user = user;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{Id: " + id
                + ", username: " + user
                + ", age: " + age
                + ", email: " + email
                + "}";
    }
}
