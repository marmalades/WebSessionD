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

         String sqlStatement5 =
                 "SELECT ProdId, ProdPrice, ProdName FROM Products ORDER BY ProdPrice, ProdName" ;

         // name the results from the query result5
         ResultSet result5 = stmt.executeQuery(sqlStatement5);
         System.out.println("                                    ");
         System.out.println("following is the output from result5");
         while (result5.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s %25s\n",
                    result5.getString("ProdId"),
                    result5.getString("ProdPrice"),
                    result5.getString("ProdName"));
         }


         String sqlStatement6 =
                 "SELECT ProdId, ProdPrice, ProdName FROM Products ORDER BY ProdPrice DESC";

         // name the results from the query result6
         ResultSet result6 = stmt.executeQuery(sqlStatement6);
         System.out.println("                                    ");
         System.out.println("following is the output from result6");
         while (result6.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s %25s\n",
                    result6.getString("ProdId"),
                    result6.getString("ProdPrice"),
                    result6.getString("ProdName"));
         }



         String sqlStatement7 =
                 "SELECT ProdId, ProdPrice, ProdName FROM Products ORDER BY ProdPrice DESC, ProdName";

         // name the results from the query result6
         ResultSet result7 = stmt.executeQuery(sqlStatement7);
         System.out.println("                                    ");
         System.out.println("following is the output from result7");
         while (result7.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s %25s\n",
                    result7.getString("ProdId"),
                    result7.getString("ProdPrice"),
                    result7.getString("ProdName"));
         }


         //C H A P T E R  6

         String sqlStatement8 =
                 "SELECT ProdName FROM Products WHERE ProdName = 'fuses'";

         // name the results from the query result8
         ResultSet result8 = stmt.executeQuery(sqlStatement8);
         System.out.println("                                    ");
         System.out.println("following is the output from result88");
         while (result8.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result8.getString("ProdName"),
                    result8.getString("ProdPrice"));
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
