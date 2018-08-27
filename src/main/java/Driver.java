import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
    public static void main(String[] args) {
        String user = "tum";
        String pass = "password";
        String url = "jdbc:mysql://localhost/university";

        try{
            Connection conn = DriverManager.getConnection(url,user,pass);

            Statement myStmt = conn.createStatement();

            ResultSet myRs = myStmt.executeQuery("Select * from students");

            while (myRs.next()){
                System.out.println(myRs.getString("ID")+ " " + myRs.getString("Name")+" "
                                    +  myRs.getString("sirname"));
            }
        }
        catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
