package mysql.labs;


import java.sql.*;


/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
 */

public class Exercise_04 {

    public static void main(String[] args) throws Exception {
        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...);
        queryFlight(...);
        updateFlight(...);
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);

        ...


         */

        String url = "jdbc:mysql://localhost:3306/flights?autoReconnect=true&useSSL=false";
        String uName = "root";
        String pass = "Kingsauduni14";
        String query = "SELECT * FROM flights.Passenger";
        String query2 = "INSERT INTO flights.Airport VALUES(?,?,?)";

        String code = "MSP";
        String city = "Minneapolis";
        String state = "MI";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uName,pass);
        PreparedStatement st = con.prepareStatement(query2);



        st.setString(1,code);
        st.setString(2,city);
        st.setString(3,state);

        int ch = st.executeUpdate();

        System.out.println(ch);

        //ResultSet rs = st.executeQuery();

       // while(rs.next()){

           // int id = rs.getInt("ID");
           // String name = rs.getString("Name");
           // String phone = rs.getString("Phone");

           // System.out.println(id + " " + name + " "+ phone);
        //}




        st.close();
        con.close();





    }

}
