package CandidateForm;



/**
 * @author Mystery 92
 * @version 1.0
 * @created 14-Jun-2014 4:06:00 PM
 */
public class Candidates {

	private String CandidateName;
	private String Constituency;
        private String Party;
	private int Votes;
        private int CandidateID;

	public Candidates(){

	}

	public void finalize() throws Throwable {

	}

    /**
     * @return the CandidateName
     */
    public String getCandidateName() {
        return CandidateName;
    }

    /**
     * @param CandidateName the CandidateName to set
     */
    public void setCandidateName(String CandidateName) {
        this.CandidateName = CandidateName;
    }

    /**
     * @return the Constituency
     */
    public String getConstituency() {
        return Constituency;
    }

    /**
     * @param Constituency the Constituency to set
     */
    public void setConstituency(String Constituency) {
        this.Constituency = Constituency;
    }

    /**
     * @return the Votes
     */
    public int getVotes() {
        return Votes;
    }

    /**
     * @param Votes the Votes to set
     */
    public void setVotes(int Votes) {
        this.Votes = Votes;
    }

    /**
     * @return the CandidateID
     */
    public int getCandidateID() {
        return CandidateID;
    }

    /**
     * @param CandidateID the CandidateID to set
     */
    public void setCandidateID(int CandidateID) {
        this.CandidateID = CandidateID;
    }

    /**
     * @return the Party
     */
    public String getParty() {
        return Party;
    }

    /**
     * @param Party the Party to set
     */
    public void setParty(String Party) {
        this.Party = Party;
    }

}