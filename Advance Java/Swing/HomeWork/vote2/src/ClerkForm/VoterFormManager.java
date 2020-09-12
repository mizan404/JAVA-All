package ClerkForm;



/**
 * @author Mystery 92
 * @version 1.0
 * @created 13-May-2014 8:29:12 PM
 */
import ExceptionHandling.InfoDialog;
import java.sql.*;
import java.io.*;
public class VoterFormManager {

	public Connection connection;
	public PreparedStatement pstatement;
        public FileInputStream fis;
        /**
         * Connectivity with MSAccess
         */
        //public static final String Driver="sun.jdbc.odbc.JdbcOdbcDriver";
        //public static final String URL="jdbc:odbc:Driver";//={Microsoft Access Driver (*.mdb,*.accdb)};DBQ=Voter.accdb;DriverID=22;READONLY=true, , ";

        /**
         * Connectivity with MySQL
         */
        public static final String Driver="com.mysql.jdbc.Driver";
        public static final String URL="jdbc:mysql://3306/localhost/voter";
        
        /**
         * Connectivity with Oracle
         */
        //public static final String Driver="oracle.jdbc.driver.OracleDriver";
        //public static final String URL="jdbc:oracle:thin:@localhost:Airport Schema2";
        

	public VoterFormManager(){
            Voter voter;
            try{
            Class.forName(Driver);
            //For MS Access
            //connection=DriverManager.getConnection(URL,"system","1234");
            
            //For xampp
            connection=DriverManager.getConnection(URL,"root","12345");
            
            }catch(ClassNotFoundException exc ){System.out.println(exc);}
            catch(SQLException sq){System.out.println(sq);}
            
            

	}

	public void finalize() throws Throwable {

	}

	public boolean deleteVoter(String fullname, int cnic){
            try{
                //A record is Deleted on the basis of Fullname and CNIC
                    String query="DELETE FROM voter WHERE fullname=? and cnic=?";
                    pstatement=connection.prepareStatement(query);
                    pstatement.setString(1, fullname);
                    pstatement.setInt(2, cnic);
                int x=pstatement.executeUpdate();
                connection.close();
                if(x==1){
                    System.out.println("Entry Deleted");
                    return true;
                    }
                else{
                    System.out.println("Entry NOT Deleted");
                    return false;
                    }
                    
                }catch(SQLException ex){System.out.println(ex);}
                
		return false;
	}

	public boolean insertVoter(String fullname,int cnic,String fathername,int phone,int mobile,String email,File image){
            
                try{
                    
                    String query="INSERT INTO voter(ID, fullname, cnic, fathername, phoneno, mobileno, email, picture) VALUES (?,?,?,?,?,?,?,?)";
                    pstatement=connection.prepareStatement(query);
                    pstatement.setString(1,null);
                    pstatement.setString(2,fullname);
                    pstatement.setInt(3, cnic);
                    System.out.println("CNIC"+cnic);
                    pstatement.setString(4,fathername);
                    pstatement.setInt(5,phone);
                    pstatement.setInt(6,mobile);
                    pstatement.setString(7,email);
                    fis=new FileInputStream(image);
                    pstatement.setBinaryStream(8,(InputStream)fis,(int)(image.length()));
                int x=pstatement.executeUpdate();
                connection.close();
                if(x==1){
                    System.out.println("Entered");
                    return true;
                    }
                else{
                    System.out.println("Not Entered");
                    return false;
                    }
                    
                }catch(SQLException ex){System.out.println(ex);
                }catch(FileNotFoundException ex){System.out.println(ex);}
                
                return false;
	}

	public Voter searchVoter(String fullname1, int cnic1)throws SQLException{
            
            //Searching is done on the basis of the Full Name and CNIC
                    Voter voter=new Voter();         
                    String query="SELECT * FROM voter WHERE fullname=? AND cnic=?";

                    pstatement=connection.prepareStatement(query);
                    pstatement.setString(1,fullname1);
                    pstatement.setInt(2,cnic1);
                   
                    
                ResultSet rs=pstatement.executeQuery();
                
                
                while(rs.next()){
                    int ID=rs.getInt("ID");
                    String fullname=rs.getString("fullname");
                    int cnic=rs.getInt("cnic");
                    String fathername=rs.getString("fathername");
                    int phoneno=rs.getInt("phoneno");
                    int mobileno=rs.getInt("mobileno");
                    String email=rs.getString("email");
                    Blob picture=rs.getBlob("picture");
                    voter.setVoter_id(ID);
                    voter.setVoter_fullname(fullname);
                    voter.setVoter_fathername(fathername);
                    voter.setVoter_phoneno(phoneno);
                    voter.setVoter_mobileno(mobileno);
                    voter.setVoter_email(email);
                    voter.setVoter_picture(picture);
                }
                connection.close();
		return voter;
	}

	public boolean updateVoter(String fullname,int cnic,String fathername,int phone,int mobile,String email,File image){
            try{
                
                String ID=null;
                //Update is done on the basis of Full Name and CNIC 
                    String query="UPDATE voter SET ID=?,fullname=?,cnic=?,fathername=?,phoneno=?,mobileno=?,email=?,picture=? WHERE fullname=? AND cnic=?";
                    String query1="SELECT * FROM voter WHERE fullname=? AND cnic=?";
                    pstatement=connection.prepareStatement(query1);
                    pstatement.setString(1,fullname);
                    pstatement.setInt(2,cnic);
                    ResultSet rs=pstatement.executeQuery();
                    while(rs.next()){
                        ID=rs.getString("ID");
                    }
                    pstatement=connection.prepareStatement(query);
                    pstatement.setString(1,ID);
                    pstatement.setString(2,fullname);
                    pstatement.setInt(3,cnic);
                    pstatement.setString(4,fathername);
                    pstatement.setInt(5,phone);
                    pstatement.setInt(6,mobile);
                    pstatement.setString(7,email);
                    fis=new FileInputStream(image);
                    pstatement.setBinaryStream(8,(InputStream)fis,(int)(image.length()));
                    pstatement.setString(9,fullname);
                    pstatement.setInt(10,cnic);
                int x=pstatement.executeUpdate();
                connection.close();
                if(x==1){
                    System.out.println("Entered");
                    return true;
                    }
                else{
                    System.out.println("Not Entered");
                    return false;
                    }
                }catch(SQLException ex){System.out.println(ex);
                }catch(FileNotFoundException ex){System.out.println(ex);}

		return false;
	}
        
        /**
         * startup Method shows the first record at the start of the Program
         * @return 
         */
        public Voter startup()
        {
            Voter voter=new Voter();
                try{
                        String query="SELECT * FROM voter WHERE ID=?";
                        pstatement=connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
                        pstatement.setInt(1,1);
                        ResultSet rs = pstatement.executeQuery();
                        if(rs.first()){
                            int ID=rs.getInt("ID");
                            voter.setVoter_id(ID);
                            
                            String fullname1=rs.getString("fullname");
                            voter.setVoter_fullname(fullname1);
                            
                            int cnic=rs.getInt("cnic");
                            voter.setVoter_cnic(cnic);
                            
                            String fathername=rs.getString("fathername");
                            voter.setVoter_fathername(fathername);
                   
                            int phoneno=rs.getInt("phoneno");
                            voter.setVoter_phoneno(phoneno);
                                       
                            int mobileno=rs.getInt("mobileno");
                            voter.setVoter_mobileno(mobileno);
                    
                            String email=rs.getString("email");
                            voter.setVoter_email(email);
                            
                            Blob blob = rs.getBlob("picture");
                            voter.setVoter_picture(blob);
                            
                                }
                        rs.close();
                        connection.close();
                    }catch(SQLException ex){System.out.println(ex);}
                    return voter;
        }
        
        /**
         * Method nextVal displays the next record in the database
         * @param i
         * @return 
         */
        public Voter nextVal(int i){
            Voter voter=new Voter();
            try{
                String query="SELECT * FROM voter";
                pstatement=connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
                i++;
                //pstatement.setInt(1,i);
                ResultSet rs=pstatement.executeQuery();
                rs.absolute(i);
                if(rs.next()){
                    voter.setVoter_fullname(rs.getString("fullname"));
                    voter.setVoter_cnic(rs.getInt("cnic"));
                    voter.setVoter_fathername(rs.getString("fathername"));
                    voter.setVoter_phoneno(rs.getInt("phoneno"));
                    voter.setVoter_mobileno(rs.getInt("mobileno"));
                    voter.setVoter_email(rs.getString("email"));
                    voter.setVoter_picture(rs.getBlob("picture"));
                    voter.setVoter_id(i);
                }
                else{
                    new InfoDialog("No Next Record Exist",2).setVisible(true);
                    i--;
                    if(rs.isLast()){
                    voter.setVoter_fullname(rs.getString("fullname"));
                    voter.setVoter_cnic(rs.getInt("cnic"));
                    voter.setVoter_fathername(rs.getString("fathername"));
                    voter.setVoter_phoneno(rs.getInt("phoneno"));
                    voter.setVoter_mobileno(rs.getInt("mobileno"));
                    voter.setVoter_email(rs.getString("email"));
                    voter.setVoter_picture(rs.getBlob("picture"));
                    voter.setVoter_id(i);
                    }
                }
                rs.close();
                connection.close();
            }catch(SQLException ex){System.out.println(ex);}
            return voter;
        }
        
        /**
         * prevVal displays the previous record from the database
         * @param i
         * @return 
         */
        public Voter prevVal(int i){
            Voter voter=new Voter();
            try{
            String query="SELECT * FROM voter";
            pstatement=connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            //i--;
            //pstatement.setString(1,Integer.toString(i));
            ResultSet rs=pstatement.executeQuery();
            rs.absolute(i);
            if(rs.previous()){
                    voter.setVoter_id(rs.getInt("ID"));
                    voter.setVoter_fullname(rs.getString("fullname"));
                    voter.setVoter_cnic(rs.getInt("cnic"));
                    voter.setVoter_fathername(rs.getString("fathername"));
                    voter.setVoter_phoneno(rs.getInt("phoneno"));
                    voter.setVoter_mobileno(rs.getInt("mobileno"));
                    voter.setVoter_email(rs.getString("email"));
                    voter.setVoter_picture(rs.getBlob("picture"));
                }
                else{
                    
                    new InfoDialog("No Record Exist",2).setVisible(true);
                    rs.first();
                    voter.setVoter_id(rs.getInt("ID"));
                    voter.setVoter_fullname(rs.getString("fullname"));
                    voter.setVoter_cnic(rs.getInt("cnic"));
                    voter.setVoter_fathername(rs.getString("fathername"));
                    voter.setVoter_phoneno(rs.getInt("phoneno"));
                    voter.setVoter_mobileno(rs.getInt("mobileno"));
                    voter.setVoter_email(rs.getString("email"));
                    voter.setVoter_picture(rs.getBlob("picture"));
                    
                }
            rs.close();
            connection.close();
            }catch(SQLException ex){System.out.println(ex);}
            return voter;
        }
        
        /**
         * lastRecord displays the last record stored in the Database
         * @return 
         */
        public Voter lastRecord(){
            Voter voter=new Voter();
            try{
                String query="SELECT * FROM Voter";
                pstatement=connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
                ResultSet rs=pstatement.executeQuery();
                if(rs.last()){
                    voter.setVoter_id(rs.getInt("ID"));
                    voter.setVoter_fullname(rs.getString("fullname"));
                    voter.setVoter_cnic(rs.getInt("cnic"));
                    voter.setVoter_fathername(rs.getString("fathername"));
                    voter.setVoter_phoneno(rs.getInt("phoneno"));
                    voter.setVoter_mobileno(rs.getInt("mobileno"));
                    voter.setVoter_email(rs.getString("email"));
                    voter.setVoter_picture(rs.getBlob("picture"));
                }
                else if(!rs.next()){
                    //System.out.println("No Entries");
                    new InfoDialog("No Record Exist",2).setVisible(true);
                }
                rs.close();
                connection.close();
            }catch(SQLException ex){System.out.println(ex);}
            return voter;

        }
        
        /**
         * firstRecord displays the First Record present in the database
         * @return 
         */
           public Voter firstRecord(){
            Voter voter=new Voter();
            try{
                String query="SELECT * FROM Voter";
                pstatement=connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
                ResultSet rs=pstatement.executeQuery();
                if(rs.first()){
                    voter.setVoter_id(rs.getInt("ID"));
                    voter.setVoter_fullname(rs.getString("fullname"));
                    voter.setVoter_cnic(rs.getInt("cnic"));
                    voter.setVoter_fathername(rs.getString("fathername"));
                    voter.setVoter_phoneno(rs.getInt("phoneno"));
                    voter.setVoter_mobileno(rs.getInt("mobileno"));
                    voter.setVoter_email(rs.getString("email"));
                    voter.setVoter_picture(rs.getBlob("picture"));
                }
                else if(!rs.previous()){
                    System.out.println("You are at the first Record");
                }
                rs.close();
                connection.close();
            }catch(SQLException ex){System.out.println(ex);}
            return voter;

        }
           /**
            * searchfunc displays populates the JComboBox
            * @param j
            * @return 
            */
           public Voter[] searchfunc(int j){
               Voter [] v=new Voter[j];
               int i=0;
               String query="SELECT * FROM voter";
               try{
                    pstatement=connection.prepareStatement(query);
                    ResultSet rs=pstatement.executeQuery();
                    while(rs.next() && i<j){
                        v[i]=new Voter();
                        v[i].setVoter_id(rs.getInt("ID"));
                        v[i].setVoter_fullname(rs.getString("fullname"));
                        v[i].setVoter_cnic(rs.getLong("cnic"));
                        v[i].setVoter_fathername(rs.getString("fathername"));
                        v[i].setVoter_phoneno(rs.getLong("phoneno"));
                        v[i].setVoter_mobileno(rs.getLong("mobileno"));
                        v[i].setVoter_email(rs.getString("email"));
                        v[i].setVoter_picture(rs.getBlob("picture"));
                        i++;
                    }
                    connection.close();
               }catch(SQLException ex){System.out.println(ex);}
               return v;
           }
           /**
            * displayCombo takes fullname and displays records against that fullname using the JComboBox
            * @param fullname1
            * @return
            * @throws SQLException 
            */
           public Voter displayCombo(String fullname1)throws SQLException{
            
            //Searching is done on the basis of the Full Name and Father Name
                    Voter voter=new Voter();         
                    String query="SELECT * FROM voter WHERE fullname=?";
                   //Searching is done on the basis of Full Name

                    pstatement=connection.prepareStatement(query);
                    pstatement.setString(1,fullname1);
                    //pstatement.setInt(2,cnic1);
                   
                    
                ResultSet rs=pstatement.executeQuery();
                
                
                while(rs.next()){
                    int ID=rs.getInt("ID");
                    String fullname=rs.getString("fullname");
                    long cnic=rs.getInt("cnic");
                    String fathername=rs.getString("fathername");
                    int phoneno=rs.getInt("phoneno");
                    int mobileno=rs.getInt("mobileno");
                    String email=rs.getString("email");
                    Blob image=rs.getBlob("picture");
                    voter.setVoter_id(ID);
                    voter.setVoter_cnic(cnic);
                    voter.setVoter_fullname(fullname);
                    voter.setVoter_fathername(fathername);
                    voter.setVoter_phoneno(phoneno);
                    voter.setVoter_mobileno(mobileno);
                    voter.setVoter_email(email);
                    voter.setVoter_picture(image);
                }
                connection.close();
		return voter;
	}

}