

import java.sql.*;
import java.util.Enumeration;


public class DriverTester {
    public static void main(String[] args){
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        try{
            Driver driver = (Driver) Class.forName("org.apache.derby.jdbc.ClientDriver40").newInstance();
            DriverManager.registerDriver(driver);

        }
        catch (ClassNotFoundException e1){
            e1.printStackTrace();
        }
        catch (InstantiationException e){
            e.printStackTrace();
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        Driver d = null;
        while (drivers.hasMoreElements()){
            d = drivers.nextElement();
            System.out.println(d.getClass().getName());
        }

        Driver derbyDriver;
        try{
            derbyDriver = DriverManager.getDriver("jdbc:derby://localhost:1527/vtcDb");
            System.out.println();
            System.out.println("Derby Driver = " + derbyDriver.getClass().getName());
            System.out.println("Version : " + derbyDriver.getMajorVersion() + "."  + derbyDriver.getMinorVersion());
            System.out.println("JDBC Compliant : " + derbyDriver.jdbcCompliant());
            System.out.println("Understand URL : " + derbyDriver.acceptsURL("jdbc:derby://localhost:1527/myDb"));
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/vtcDb", "vtc", "vtcpassword");



        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

}
