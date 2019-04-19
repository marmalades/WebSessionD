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



         //PAGE 30

         // replace the following SELECT with the 1ST QUERY and name it sqlStatement1
         String sqlStatement1 =
            "SELECT ProdId, ProdName, ProdPrice FROM Products" ;
                   
         // name the results from the query result1
         ResultSet result1 = stmt.executeQuery(sqlStatement1);
         System.out.println("                                    ");
         System.out.println("following is the output from result1");
         while (result1.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s %25s\n",
                    result1.getString("ProdId"),
                    result1.getString("ProdName"),
                    result1.getString("ProdPrice"));
         }




          // replace the following SELECT with the 2ND QUERY and name it sqlStatement2
         String sqlStatement2 =
            "SELECT VendId FROM Products " ;
                   
         // name the results from the query result2
         ResultSet result2 = stmt.executeQuery(sqlStatement2);
         System.out.println("                                    ");
         System.out.println("following is the output from result2");
         while (result2.next())
         {
         // REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%10s\n",
                              result2.getString("VendId"));
          }

         // replace the following SELECT with the 3rd QUERY and name it sqlStatement3
         String sqlStatement3 =
                 "SELECT Products.ProdName FROM Products " ;

         // name the results from the query result3
         ResultSet result3 = stmt.executeQuery(sqlStatement3);
         System.out.println("                                    ");
         System.out.println("following is the output from result3");
         while (result3.next())
         {
            // REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%10s\n",
                    result3.getString("ProdName"));
         }




         String sqlStatement4 =
                 "SELECT ProdName FROM Products order by ProdName" ;

         // name the results from the query result4
         ResultSet result4 = stmt.executeQuery(sqlStatement4);
         System.out.println("                                    ");
         System.out.println("following is the output from result4");
         while (result4.next())
         {
            // REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%10s\n",
                    result4.getString("ProdName"));
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
