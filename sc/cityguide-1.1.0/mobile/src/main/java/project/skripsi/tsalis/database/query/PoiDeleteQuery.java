package project.skripsi.tsalis.database.query;

import project.skripsi.tsalis.database.dao.PoiDAO;
import project.skripsi.tsalis.database.data.Data;

import java.sql.SQLException;


public class PoiDeleteQuery extends Query
{
	private long mId;


	public PoiDeleteQuery(long id)
	{
		mId = id;
	}


	@Override
	public Data<Integer> processData() throws SQLException
	{
		Data<Integer> data = new Data<>();
		data.setDataObject(PoiDAO.delete(mId));
		return data;
	}
}
