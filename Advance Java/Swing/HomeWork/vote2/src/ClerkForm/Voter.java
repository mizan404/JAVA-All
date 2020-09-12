package ClerkForm;


import java.sql.*;
/**
 * @author Mystery 92
 * @version 1.0
 * @created 13-May-2014 8:28:55 PM
 */
public class Voter {
        
        private int voter_id;
	private String voter_email;
	private String voter_fathername;
	private String voter_fullname;
        private long voter_cnic;
	private long voter_mobileno;
	private long voter_phoneno;
        private Blob voter_picture;

	public Voter(){
                
	}

	public void finalize() throws Throwable {

	}

    /**
     * @return the voter_email
     */
    public String getVoter_email() {
        return voter_email;
    }

    /**
     * @param voter_email the voter_email to set
     */
    public void setVoter_email(String voter_email) {
        this.voter_email = voter_email;
    }

    /**
     * @return the voter_fathername
     */
    public String getVoter_fathername() {
        return voter_fathername;
    }

    /**
     * @param voter_fathername the voter_fathername to set
     */
    public void setVoter_fathername(String voter_fathername) {
        this.voter_fathername = voter_fathername;
    }

    /**
     * @return the voter_fullname
     */
    public String getVoter_fullname() {
        return voter_fullname;
    }

    /**
     * @param voter_fullname the voter_fullname to set
     */
    public void setVoter_fullname(String voter_fullname) {
        this.voter_fullname = voter_fullname;
    }

    /**
     * @return the voter_mobileno
     */
    public long getVoter_mobileno() {
        return voter_mobileno;
    }

    /**
     * @param voter_mobileno the voter_mobileno to set
     */
    public void setVoter_mobileno(long voter_mobileno) {
        this.voter_mobileno = voter_mobileno;
    }

    /**
     * @return the voter_phoneno
     */
    public long getVoter_phoneno() {
        return voter_phoneno;
    }

    /**
     * @param voter_phoneno the voter_phoneno to set
     */
    public void setVoter_phoneno(long voter_phoneno) {
        this.voter_phoneno = voter_phoneno;
    }

    /**
     * @return the voter_cnic
     */
    public long getVoter_cnic() {
        return voter_cnic;
    }

    /**
     * @param voter_cnic the voter_cnic to set
     */
    public void setVoter_cnic(long voter_cnic) {
        this.voter_cnic = voter_cnic;
    }

    /**
     * @return the voter_id
     */
    public int getVoter_id() {
        return voter_id;
    }

    /**
     * @param voter_id the voter_id to set
     */
    public void setVoter_id(int voter_id) {
        this.voter_id = voter_id;
    }

    /**
     * @return the voter_picture
     */
    public Blob getVoter_picture() {
        return voter_picture;
    }

    /**
     * @param voter_picture the voter_picture to set
     */
    public void setVoter_picture(Blob voter_picture) {
        this.voter_picture = voter_picture;
    }


}