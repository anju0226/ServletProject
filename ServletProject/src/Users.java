/**
 * Created by Anju on 22/06/2016.
 */
public class Users {

    String fname;
    String lname;
    String username;
    String pass;
    String address;
    String contact;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }


    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Users(){

    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
