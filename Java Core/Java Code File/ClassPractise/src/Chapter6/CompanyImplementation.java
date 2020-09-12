package Chapter6;

class Company {

    String domainName;

    // object is created in another class
    public Company() {
        domainName = "programiz.com";

    }
}
/// if the object was created outside of the class, you have to declare the constructor public to access it.

public class CompanyImplementation {

    public static void main(String[] args) {
        Company companyObj = new Company();
        System.out.println("Domain name = " + companyObj.domainName);
    }
}
