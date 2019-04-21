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

         //TODO: NOT WORKING - no output: while loop not working?
         String sqlStatement8 =
                 "SELECT ProdName,ProdPrice FROM Products WHERE ProdName = 'fuses'";

         // name the results from the query result8
         // *** This one never produced an output for me. The while loops seems to not run. ***
         ResultSet result8 = stmt.executeQuery(sqlStatement8);

         System.out.println(result8.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result8");

         while (result8.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result8.getString("ProdName"),
                    result8.getString("ProdPrice"));
         }

         String sqlStatement9 =
                 "SELECT ProdName,ProdPrice FROM Products WHERE ProdPrice < 10";

         // name the results from the query result8
         ResultSet result9 = stmt.executeQuery(sqlStatement9);

         System.out.println(result9.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result9");

         while (result9.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result9.getString("ProdName"),
                    result9.getString("ProdPrice"));
         }



         String sqlStatement10 =
                 "SELECT ProdName,ProdPrice FROM Products WHERE ProdPrice <= 10";

         // name the results from the query result8
         ResultSet result10 = stmt.executeQuery(sqlStatement10);

         System.out.println(result10.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result10");

         while (result10.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result10.getString("ProdName"),
                    result10.getString("ProdPrice"));
         }



         String sqlStatement11 =
                 "SELECT VendID, ProdName FROM Products WHERE VendID <> 1003";

         // name the results from the query result8
         ResultSet result11 = stmt.executeQuery(sqlStatement11);

         System.out.println(result11.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result11");

         while (result11.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result11.getString("VendID"),
                    result11.getString("ProdName"));
         }



         String sqlStatement12 =
                 "SELECT ProdName, ProdPrice FROM Products WHERE ProdPrice BETWEEN 5 AND 10";

         // name the results from the query result8
         ResultSet result12 = stmt.executeQuery(sqlStatement12);

         System.out.println(result12.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result12");

         while (result12.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result12.getString("ProdName"),
                    result12.getString("ProdPrice"));
         }


         String sqlStatement13 =
                 "SELECT ProdID, ProdPrice, ProdName FROM Products WHERE VendID = 1003 AND ProdPrice <= 10";

         // name the results from the query result8
         ResultSet result13 = stmt.executeQuery(sqlStatement13);

         System.out.println(result13.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result13");

         while (result13.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s %25s\n",
                    result13.getString("ProdID"),
                    result13.getString("ProdPrice"),
                    result13.getString("ProdName"));
         }


         String sqlStatement14 =
                 "SELECT ProdName, ProdPrice FROM Products WHERE VendID =1002 OR VendID = 1003";

         // name the results from the query result8
         ResultSet result14 = stmt.executeQuery(sqlStatement14);

         System.out.println(result14.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result14");

         while (result14.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result14.getString("ProdName"),
                    result14.getString("ProdPrice"));
         }



         String sqlStatement15 =
                 "SELECT ProdName, ProdPrice FROM Products WHERE (VendID = 1002 OR VendID = 1003) AND ProdPrice >= 10";

         // name the results from the query result8
         ResultSet result15 = stmt.executeQuery(sqlStatement15);

         System.out.println(result15.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result15");

         while (result15.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result15.getString("ProdName"),
                    result15.getString("ProdPrice"));
         }




         String sqlStatement16 =
                 "SELECT ProdName, ProdPrice FROM Products WHERE VendID IN (1002, 1003) ORDER BY ProdName";

         // name the results from the query result8
         ResultSet result16 = stmt.executeQuery(sqlStatement16);

         System.out.println(result16.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result16");

         while (result16.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result16.getString("ProdName"),
                    result16.getString("ProdPrice"));
         }





         String sqlStatement17 =
                 "SELECT ProdName, ProdPrice FROM Products WHERE VendID = 1002 OR VendID = 1003 ORDER BY ProdName";

         // name the results from the query result8
         ResultSet result17 = stmt.executeQuery(sqlStatement17);

         System.out.println(result17.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result17");

         while (result17.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result17.getString("ProdName"),
                    result17.getString("ProdPrice"));
         }





         String sqlStatement18 =
                 "SELECT ProdName, ProdPrice FROM Products WHERE VendID NOT IN (1002, 1003) ORDER BY ProdName";

         // name the results from the query result8
         ResultSet result18 = stmt.executeQuery(sqlStatement18);

         System.out.println(result18.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result18");

         while (result18.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result18.getString("ProdName"),
                    result18.getString("ProdPrice"));
         }



         String sqlStatement19 =
                 "SELECT ProdID, ProdName FROM Products WHERE ProdName LIKE 'jet%'";

         // name the results from the query result8
         ResultSet result19 = stmt.executeQuery(sqlStatement19);

         System.out.println(result19.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result19");

         while (result19.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result19.getString("ProdID"),
                    result19.getString("ProdName"));
         }



         String sqlStatement20 =
                 "SELECT ProdID, ProdName FROM Products WHERE ProdName LIKE '%anvil%'";

         // name the results from the query result8
         ResultSet result20 = stmt.executeQuery(sqlStatement20);

         System.out.println(result20.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result20");

         while (result20.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s %25s\n",
                    result20.getString("ProdID"),
                    result20.getString("ProdName"));
         }


         String sqlStatement21 =
                 "SELECT AVG(ProdPrice) AS AvgPrice FROM Products";

         // name the results from the query result8
         ResultSet result21 = stmt.executeQuery(sqlStatement21);

         System.out.println(result21.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result21");

         while (result21.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s\n",
                    result21.getString("AvgPrice"));
         }



         String sqlStatement22 =
                 "SELECT COUNT(*) AS NumCust FROM Customers";

         // name the results from the query result8
         ResultSet result22 = stmt.executeQuery(sqlStatement22);

         System.out.println(result22.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result22");

         while (result22.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s\n",
                    result22.getString("NumCust"));
         }




         String sqlStatement23 =
                 "SELECT COUNT(CustEmail) AS NumCust FROM Customers";

         // name the results from the query result8
         ResultSet result23 = stmt.executeQuery(sqlStatement23);

         System.out.println(result23.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result23");

         while (result23.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s\n",
                    result23.getString("NumCust"));
         }
//TODO: Something is fucky.

         String sqlStatement24 =
                 "SELECT MAX(ProdPrice) AS MaxPrice FROM Products";

         // name the results from the query result8
         ResultSet result24 = stmt.executeQuery(sqlStatement24);

         System.out.println(result24.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result24");

         while (result24.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s\n",
                    result24.getString("MaxPrice"));
         }



         String sqlStatement25 =
                 "SELECT MIN(ProdPrice) AS MinPrice FROM Products";

         // name the results from the query result8
         ResultSet result25 = stmt.executeQuery(sqlStatement25);

         System.out.println(result25.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result25");

         while (result25.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s\n",
                    result25.getString("MinPrice"));
         }

         String sqlStatement26 =
                 "SELECT MIN(ProdPrice) AS MinPrice FROM Products";

         // name the results from the query result8
         ResultSet result26 = stmt.executeQuery(sqlStatement26);

         System.out.println(result26.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result26");

         while (result26.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s\n",
                    result26.getString("MinPrice"));
         }



         String sqlStatement27 =
                 "SELECT SUM(quantity) AS ItemsOrdered FROM OrderItems WHERE OrderNum = 20005";

         // name the results from the query result8
         ResultSet result27 = stmt.executeQuery(sqlStatement27);

         System.out.println(result27.next());
         System.out.println("                                    ");
         System.out.println("following is the output from result27");

         while (result27.next())
         {
            //REPLACE THE FOLLOWING CODE WITH THE CORRECT FORMATS AND DATA NAMES FROM YOUR QUERY
            System.out.printf("%25s\n",
                    result27.getString("IT"));
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
