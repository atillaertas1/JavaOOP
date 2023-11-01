package WEEK_6;

public class Customer {
    private String name;
    private String surname;
    private String mail;
    private String phoneNumber;

    //Getters
    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getMail(){
        return mail;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setMail(String mail){
        this.mail = mail;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
