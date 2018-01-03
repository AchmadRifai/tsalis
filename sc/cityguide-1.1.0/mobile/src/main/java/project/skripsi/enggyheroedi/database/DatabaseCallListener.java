package project.skripsi.enggyheroedi.database;

import project.skripsi.enggyheroedi.database.data.Data;


public interface DatabaseCallListener
{
	public void onDatabaseCallRespond(DatabaseCallTask task, Data<?> data);
	public void onDatabaseCallFail(DatabaseCallTask task, Exception exception);
}
