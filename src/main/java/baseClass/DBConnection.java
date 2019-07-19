package baseClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static Connection connection = null;
	public static Statement statement = null;
	public static ResultSet resultSet = null;

	// Step 1: Loading or
	// registering Oracle JDBC driver class

	public static void connectingDB()

	{

		try {

			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		} catch (ClassNotFoundException cnfex) {

			System.out.println("Problem in loading or " + "registering MS Access JDBC driver");
			cnfex.printStackTrace();
		}

		// Step 2: Opening database connection
		try {
			String msAccDB = "C:\\Users\\amaresh.rout\\Documents\\POCDB.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccDB;

			// Step 2.A: Create and
			// get connection using DriverManager class
			connection = DriverManager.getConnection(dbURL);

			// Step 2.B: Creating JDBC Statement
			statement = connection.createStatement();

			System.out.println("DB Connected");
			ResultSet resultSet = statement.executeQuery("SELECT * FROM InputTable");

			/*
			 * System.out.
			 * println("ID\tFirstName\t\t\tLastname\t\t\tCountry\t\t\tState\t\t\tEmail ID\t\t\tPassword\t\t\tRepeat_Password"
			 * ); System.out.println("==\t================\t===\t=======");
			 */

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t" + "\t" + resultSet.getString(2) + "\t" + "\t"
						+ resultSet.getString(3) + "\t" + "\t" + resultSet.getString(4) + "\t" + "\t"
						+ resultSet.getString(5) + "\t" + "\t" + resultSet.getString(6) + "\t" + "\t"
						+ resultSet.getString(7) + "\t" + "\t" + resultSet.getString(8));

			}

		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		} finally {
			// Step 3: Closing database connection
			try {
				if (null != connection) {
					// cleanup resources, once after processing
					resultSet.close();
					statement.close();

					// and then finally close connection
					connection.close();
				}
			} catch (SQLException sqlex) {
				sqlex.printStackTrace();
			}

		}

	}
}
