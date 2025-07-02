public class User {
    private String userName;
    private String password;
    private String contact;
    private String fullName;

    public User(String userName, String password, String contact, String fullName) {
        this.userName = userName;
        this.password = password;
        this.contact = contact;
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return fullName+" ("+userName+")";
    }
}
