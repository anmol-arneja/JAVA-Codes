import java.sql.*;

public class StatementTester{
    public static void main(String [] args){
        try{
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/C:/Users/Admin/Documents/VTCJavaFiles/VTCDatabase/preet", "vtc", "vtcpassword" );
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stm.executeUpdate("DROP TABLE REGISTRATION");
            System.out.println("Existing Registration TABLE dropped");
            String create_table = "CREATE TABLE REGISTRATION" + "(id INTEGER not NULL," + "first_name varchar(20),"+ "last_name varchar(20),"+ "age INTEGER ," + "PRIMARY KEY(id))";
            stm.executeUpdate(create_table);
            System.out.println("CREATED the first SQL TABLE");
            conn.setAutoCommit(false);
            stm.executeUpdate("Insert into REGISTRATION values(1,'Timardeep','Arneja',25)");
            conn.commit();
            stm.executeUpdate("Insert into REGISTRATION values(2,'Roxin','Fernandes',27)");
            conn.commit();
            stm.executeUpdate("Insert into REGISTRATION values(3,'Nandita','Narohna',24)");
            conn.commit();
            stm.executeUpdate("Insert into REGISTRATION values(4,'Joy','Arneja',28)");
            conn.commit();
            ResultSet rs = stm.executeQuery("SELECT * FROM REGISTRATION");
            boolean hasResults = rs.first();
            int id,age;
            String f_name,l_name;
            while (hasResults){
                id = rs.getInt(1);
                age = rs.getInt(4);
                f_name = rs.getString(2);
                l_name = rs.getString(3);
                System.out.println("ID = " +id + "\tFirst Name = " +f_name + "\tLast Name = " +l_name + "\tAge = " +age);
                hasResults = rs.next();
            }
            conn.setAutoCommit(true);





            }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}