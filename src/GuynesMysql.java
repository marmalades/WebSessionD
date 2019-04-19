// all you have to do is add SELECT CLAUSES and replace the printf STATEMENTS

// YOU WILL HAVE TO LOOK AT THE "MysqlCreateDB"  JAVA PROGRAM TO GET THE NEEDED
// FIELD NAMES FOR THE SELECTS AND FIELD TYPES AND FIELD SIZES FOR THE printf statements

// you must name the class your LAST NAME with Mysql - for example -  GuynesMysql
// and the name of the java program to match - for example GuynesMysql.java

//Scanner?
import java.util.Scanner;
import java.sql.*;
public class GuynesMysql
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
// leave the above code alone except for renaming the public class statement



 
         // replace the following SELECT with the 1ST QUERY and name it sqlStatement1 
         String sqlStatement1 =
            "SELECT COUNT(*) AS num_item, MIN(prodprice) AS price_min, MAX(prodprice) AS price_max, AVG(prodprice) AS price_avg FROM products" ;
                   
         // name the results from the query result1
         ResultSet result1 = stmt.executeQuery(sqlStatement1);
         System.out.println("                                    ");
         System.out.println("following is the output from result1");
         while (result1.next())
         {
         // REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s %25s %25s\n",
                              result1.getString("num_item"),
                              result1.getString("price_min"),
                              result1.getString("price_max"),
                              result1.getString("price_avg"));                      
          }




          // replace the following SELECT with the 2ND QUERY and name it sqlStatement2
         String sqlStatement2 =
            "SELECT ProdId, ProdPrice FROM Products " ;
                   
         // name the results from the query result2
         ResultSet result2 = stmt.executeQuery(sqlStatement2);
         System.out.println("                                    ");
         System.out.println("following is the output from result2");
         while (result2.next())
         {
         // REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%10s %8.2f\n",
                              result2.getString("ProdId"),
                              result2.getDouble("ProdPrice"));                          
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
