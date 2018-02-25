package project.skripsi.tsalis.database.dao;

import project.skripsi.tsalis.database.DatabaseHelper;
import project.skripsi.tsalis.utility.Logcat;

import java.sql.SQLException;


public class DAO
{
	public static void printDatabaseInfo()
	{
		DatabaseHelper databaseHelper = DatabaseHelper.getInstance();
		try
		{
			Logcat.d("DAO.printDatabaseInfo(): categories " + databaseHelper.getCategoryDao().countOf());
			Logcat.d("DAO.printDatabaseInfo(): pois " + databaseHelper.getPoiDao().countOf());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
