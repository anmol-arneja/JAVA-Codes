import java.sql.*;

public class ConnectionTester{
    public static void main(String [] args){
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/C:/Users/Admin/Documents/VTCJavaFiles/VTCDatabase/vtcDB","sania","prince");
            System.out.println("Autocommit = " +conn.getAutoCommit());
            if(conn.getHoldability() == ResultSet.HOLD_CURSORS_OVER_COMMIT)
            {
                System.out.println("Cursor will hold over commit");
            }
            else{
                System.out.println("Cursor will close over commit");
            }
            DatabaseMetaData metaData = conn.getMetaData();
            System.out.println("=====METADATA=====");
            System.out.println("Product : " + metaData.getDatabaseProductName() + " " + metaData.getDatabaseProductVersion());
            System.out.println("Version : "+metaData.getDatabaseMajorVersion() + "." + metaData.getDatabaseMinorVersion());
            System.out.println("NON SQL2003 keywords : " + metaData.getSQLKeywords());
            System.out.println();
            int isolation = conn.getTransactionIsolation();
            if (isolation == Connection.TRANSACTION_NONE){
                System.out.println("Transaction currently not supported");
            }
            else if (isolation == Connection.TRANSACTION_READ_COMMITTED){
                System.out.println("Transactions currently READ COMMITTED");
            }
            else if (isolation == Connection.TRANSACTION_READ_UNCOMMITTED){
                System.out.println("Transactions currently READ UNCOMMITTED");

            }
            else if (isolation == Connection.TRANSACTION_REPEATABLE_READ){
                System.out.println("Transactions currently REPATABLE READ");
            }
            else if (isolation == Connection.TRANSACTION_SERIALIZABLE){
                System.out.println("Transaction currently Serializable");
            }
            else{
                System.out.println("Status of Transaction currently Unknown");
            }

            Statement stmt = conn.createStatement();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}