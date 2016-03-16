import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Admin on 2016-03-15.
 */
public class PreparedStatement {
    public static void main(String[] args){
        String sqlSelect = "select ID,firstname,lastname from People where firstname like ?";
        String sqlInsert = "insert into People values(?,?,?)";
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/C:/Users/Admin/Documents/VTCJavaFiles/VTCDatabase/vtcDb", "vtc", "vtcpassword");
            java.sql.PreparedStatement stm = conn.prepareStatement(sqlSelect, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stm.setString(1,"H%");
            ResultSet rs = stm.executeQuery();
            boolean hasResults = rs.first();
            String id,f_name,l_name;
            while (hasResults){
                id = rs.getString(1);
                f_name = rs.getString(2);
                l_name = rs.getString(3);
                System.out.println("ID = " +id + "\tFirstName = " +f_name + "\tLastname = " + l_name);
                hasResults = rs.next();
            }

            conn.setAutoCommit(false);
            stm = conn.prepareStatement(sqlInsert,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stm.setString(1,"7");
            stm.setString(2,"Timardeep");
            stm.setString(3,"Arneja");
            boolean result = stm.execute();
            System.out.println("Insert done successfully!!");
            conn.commit();
            stm.setString(1,"8");
            stm.setString(2,"Roxin");
            stm.setString(3,"Fernandes");
            result = stm.execute();
            //conn.rollback();
            conn.commit();

            System.out.println("Results after Insertion");

            stm = conn.prepareStatement(sqlSelect,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stm.setString(1,"%");
            rs = stm.executeQuery();
            hasResults = rs.first();
            while (hasResults){
                id = rs.getString(1);
                f_name = rs.getString(2);
                l_name = rs.getString(3);
                System.out.println("ID = " +id + "\tFirstName = " +f_name + "\tLastname = " + l_name);
                hasResults = rs.next();

            }

            conn.setAutoCommit(true);
            stm = conn.prepareStatement("Delete from people where ID = ?");
            stm.setString(1,"7");
            result = stm.execute();
            System.out.println("Successfully deleted the record");

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
