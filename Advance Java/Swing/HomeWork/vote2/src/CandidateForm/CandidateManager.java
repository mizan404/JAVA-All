package CandidateForm;


import java.sql.*;
/**
 * @author Mystery 92
 * @version 1.0
 * @created 14-Jun-2014 4:09:28 PM
 */
public class CandidateManager {

	private Connection connection;
	private PreparedStatement pstatement;
        /**
         * Connectivity with MySQL
         */
        public static final String Driver="com.mysql.jdbc.Driver";
        public static final String URL="jdbc:mysql://localhost/voter";

	public CandidateManager(){
         try{
            Class.forName(Driver);            
            //For xampp
            connection=DriverManager.getConnection(URL,"root","12345");
            
            }catch(ClassNotFoundException exc ){System.out.println(exc);}
            catch(SQLException sq){System.out.println(sq);}
	}

	public void finalize() throws Throwable {

	}

	public Candidates viewResult(String constituency1){
            Candidates cand=new Candidates();
                String query="SELECT * FROM votescast WHERE Halka=? ORDER BY Result DESC";
                try{
                pstatement=connection.prepareStatement(query);
                pstatement.setString(1, constituency1);
                ResultSet r=pstatement.executeQuery();
                if(r.next()){
                    /*cand.setCandidateID(r.getInt("canid"));
                    cand.setCandidateName(r.getString("candidatename"));
                    cand.setVotes(r.getInt("votes"));*/
                    cand.setCandidateID(r.getInt("CID"));
                    cand.setCandidateName(r.getString("Name"));
                    cand.setVotes(r.getInt("Result"));
                    cand.setParty(r.getString("Party"));
                }
                else{
                    
                }
                connection.close();
                }catch(SQLException ex){System.out.println(ex);}
                return cand;
	}
        public Candidates nextVal(int i,String constituency1){
            Candidates cand=new Candidates();
            String query="SELECT * FROM votescast WHERE Halka=? ORDER BY Result DESC";
                try{
                pstatement=connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                pstatement.setString(1,constituency1);
                ResultSet r=pstatement.executeQuery();
                r.absolute(i);
                if(r.next()){
                    /*cand.setCandidateID(r.getInt("canid"));
                    cand.setCandidateName(r.getString("candidatename"));
                    cand.setVotes(r.getInt("votes"));*/
                    cand.setCandidateID(r.getInt("CID"));
                    cand.setCandidateName(r.getString("Name"));
                    cand.setVotes(r.getInt("Result"));
                    cand.setParty(r.getString("Party"));
                }
                connection.close();
                }catch(SQLException ex){System.out.println(ex);}
                return cand;
        }
        
        public Candidates prevVal(int i,String constituency1){
            Candidates cand=new Candidates();
            String query="SELECT * FROM votescast WHERE Halka=? ORDER BY Result DESC";
                try{
                pstatement=connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                pstatement.setString(1, constituency1);
                ResultSet r=pstatement.executeQuery();
                r.absolute(i);
                if(r.previous()){
                    /*cand.setCandidateID(r.getInt("canid"));
                    cand.setCandidateName(r.getString("candidatename"));
                    cand.setVotes(r.getInt("votes"));*/
                    cand.setCandidateID(r.getInt("CID"));
                    cand.setCandidateName(r.getString("Name"));
                    cand.setVotes(r.getInt("Result"));
                    cand.setParty(r.getString("Party"));
                }
                connection.close();
                }catch(SQLException ex){System.out.println(ex);}
                return cand;
        }
		

}