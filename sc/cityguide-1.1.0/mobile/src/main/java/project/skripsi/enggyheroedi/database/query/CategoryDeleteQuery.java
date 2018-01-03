package project.skripsi.enggyheroedi.database.query;

import project.skripsi.enggyheroedi.database.dao.CategoryDAO;
import project.skripsi.enggyheroedi.database.data.Data;

import java.sql.SQLException;


public class CategoryDeleteQuery extends Query
{
	private long mId;


	public CategoryDeleteQuery(long id)
	{
		mId = id;
	}


	@Override
	public Data<Integer> processData() throws SQLException
	{
		Data<Integer> data = new Data<>();
		data.setDataObject(CategoryDAO.delete(mId));
		return data;
	}
}
