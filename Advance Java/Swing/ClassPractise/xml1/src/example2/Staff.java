
package example2;


public class Staff {
    private int id; 
    private String firstname; 
    private String lastname; 
    private String nickname; 
    private double salary; 
    private String country;

    public Staff(int id, String firstname, String lastname, String quickname, double salary, String country) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = quickname;
        this.salary = salary;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public double getSalary() {
        return salary;
    }

    public String getCountry() {
        return country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setNickname(String quickname) {
        this.nickname = quickname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
