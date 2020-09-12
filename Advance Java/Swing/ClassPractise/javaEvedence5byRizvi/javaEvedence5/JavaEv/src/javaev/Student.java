package javaev;

public class Student {

    
    private String name;
    private String email;
    private String gender;
    private String hobby;
    private String round;

    public Student() {
    }

    public Student(String name, String email, String gender, String hobby, String round) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return round;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setRound(String round) {
        this.round = round;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", gender=" + gender + ", hobby=" + hobby + ", round=" + round + '}';
    }

    
}
