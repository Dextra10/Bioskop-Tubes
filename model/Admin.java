package model;

public class Admin extends Account {
    private String phoneNumber;

    public Admin(String name, String email, String password, String phoneNumber) {
        super(name, email, password);
        this.phoneNumber = phoneNumber;
    }

    // Getter dan Setter
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
