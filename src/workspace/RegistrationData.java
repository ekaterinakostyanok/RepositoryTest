package workspace;
import java.lang.Integer;
import java.lang.String;

import static workspace.Utils.getRandomEmail;
import static workspace.Utils.getRandomPassword;

public class RegistrationData{
    private String firstName = "Ivan";
    private String lastName = "Ivanov";
    private int dayOfBirth = 2;
    private String monthOfBirth = "θώνό";
    private int yearOfBirth = 1990;
    private String email = getRandomEmail();
    private String password = getRandomPassword();
    private int country;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getDayOfBirth(){
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth){
        this.dayOfBirth = Integer.parseInt(dayOfBirth);
    }

    public String getMonthOfBirth(){
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth){
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public int setYearOfBirth(int yearOfBirth){
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth){
        this.yearOfBirth = Integer.valueOf(yearOfBirth);
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }
}
