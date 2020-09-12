package VoterForm;
import java.sql.*;
class CandidateManager
{
     public Connection con = null;
    public PreparedStatement prepstat = null;
    public Statement stat = null;
    CandidateGUI cGUI = null;
    String query=null;
    ResultSet rs;
    public CandidateClass candi=new CandidateClass();
    public static final String Driver = "com.mysql.jdbc.Driver";//these are dirver for connectivity with MySQL
    public static final String URL = "jdbc:mysql://3306/localhost/voter";//destination of table
    public CandidateManager()//connstructor
    {
        try
        {

            Class.forName(Driver);//loading drivers
            con = DriverManager.getConnection(URL, "root", "12345");//establishing the connectivity
        } catch (SQLException e)
        {
            System.out.println("manager class contructor" + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println("class not found" + e);
        }
    }
    
    
    
    
     public CandidateClass[] searchfunc(int j,String s){
               CandidateClass [] cdc=new CandidateClass[j];
               int i=0;
               query="SELECT * FROM `votescast` WHERE Halka=?";
               try{ 
                    prepstat=con.prepareStatement(query); prepstat.setString(1,s);
                    rs=prepstat.executeQuery();
                    while(rs.next() && i<j){
                        cdc[i]=new CandidateClass();
                        cdc[i].setParty(rs.getString("Party"));
                        cdc[i].setName(rs.getString("Name"));
                        cdc[i].setHalka(rs.getString("Halka"));
                        cdc[i].setCid(rs.getInt("CID"));
                        System.out.println(rs.getString("Party"));
                        System.out.println(rs.getString("Name"));
                        System.out.println(rs.getString("Halka"));
                        System.out.println(rs.getInt("CID"));
                        i++;
                    }
               }catch(SQLException ex){System.out.println(ex);}
               return cdc;
           }
     
   public int lastRecord(String s)
    {
        int count=0;
        try{
             query="SELECT * FROM `votescast` WHERE Halka=?";
             prepstat=con.prepareStatement(query);
             prepstat.setString(1,s);
            rs=prepstat.executeQuery();
             rs.last();
             count=rs.getRow();
             System.out.println("i am row"+rs.getRow());
             candi.setParty(rs.getString("Party"));
             candi.setName(rs.getString("Name"));
             candi.setHalka(rs.getString("Halka"));
             candi.setCid(rs.getInt("CID"));
             System.out.println(candi.getParty());
             System.out.println(candi.getName());
             System.out.println(candi.getHalka());
             System.out.println(candi.getCid());
        }catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return count;
    }
   
   
   
public void updateResult(String halka,String name,String party)
{
    double result=0;
        query = "SELECT `Result` FROM `votescast` WHERE `Name`=? and `Party`=? and `Halka`=?";
        try
        {
            prepstat = con.prepareStatement(query);
            prepstat.setString(1, name);
            prepstat.setString(2, party);
            prepstat.setString(3, halka);
            rs = prepstat.executeQuery();
            rs.next();
            result=rs.getDouble("Result");
            result+=1;
        }catch(SQLException e)
        {
            System.out.println(e.toString());
        }
            try{
            query = "UPDATE `votescast` SET`Result`=? WHERE `Name`=? and `Party`=? and `Halka`=?";
            prepstat = con.prepareStatement(query);
            prepstat.setDouble(1, result);
            prepstat.setString(2, name);
            prepstat.setString(3, party);
            prepstat.setString(4, halka);
            int x = prepstat.executeUpdate();
            if(x==1)
            {
                System.out.println("Resulted Updated");
                candi.setResult(rs.getDouble("Result"));
            }
            else
            {
                System.out.println("not updated");
            }

        } catch (SQLException ex)
        {
            System.out.println(ex);
        }
    }   






public String cparty(String name)
{
        String prty = null;
        query = "SELECT `Party` FROM `votescast` WHERE `Name`=?";
        try
        {
            prepstat = con.prepareStatement(query);
            prepstat.setString(1, name);
            rs = prepstat.executeQuery();
            rs.next();
            prty = rs.getString("Party");
        } catch (SQLException e)
        {
            System.out.println(e);
        }
        return prty;
    }
   
}