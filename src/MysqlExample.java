// ALL YOU HAVE TO DO IS REPLACE THE SELECT CLAUSE AND REPLACE THE printf STATEMENT

// YOU WILL HAVE TO LOOK AT THE MysqlCreateDB JAVA PROGRAM TO GET THE NEEDED;
// FIELD NAMES FOR THE SELECT AND FIELD TYPES AND FIELD SIZES FOR THE printf 

// LEAVE THIS BLOCK OF CODE ALONE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.Scanner;
import java.sql.*;
public class MysqlExample
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      final String DB_URL = "jdbc:derby:MysqlDB";
      try
      {
         // Create a connection to the database.
         Connection conn = DriverManager.getConnection(DB_URL);
         // Create a Statement object.
         Statement stmt = conn.createStatement();
// LEAVE THE ABOVE CODE ALONE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


         //**********************************************************************************
         // REPLACE THE FOLLOWING SELECT WITH THE QUERY YOU WRITE FROM THE FORTA TEXT
         String sqlStatement =
            "SELECT ProdId, ProdPrice FROM Products " ;
         //**********************************************************************************   
            
          
// LEAVE THE NEXT 2 LINES OF CODE ALONE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
         ResultSet result = stmt.executeQuery(sqlStatement);
          while (result.next())
         {
         //***********************************************************************************
         // REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%10s %8.2f\n",
                              result.getString("ProdId"),
                              result.getDouble("ProdPrice"));
         //***********************************************************************************                    
          }

         
         
         
// LEAVE THE REST OF THE CODE ALONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
         conn.close();
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
}
