package test1;

public class Student {
private int serial; 
private String name; 
private String email; 
private String contact; 
private String gender; 
private String course; 
private String remark; 

    public Student() {
    }

    public Student(int serial, String name, String email, String contact, String gender, String course, String remark) {
        this.serial = serial;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.gender = gender;
        this.course = course;
        this.remark = remark;
    }

    public int getSerial() {
        return serial;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getRemark() {
        return remark;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Student{" + "serial=" + serial + ", name=" + name + ", email=" + email + ", contact=" + contact + ", gender=" + gender + ", course=" + course + ", remark=" + remark + '}';
    }

}
