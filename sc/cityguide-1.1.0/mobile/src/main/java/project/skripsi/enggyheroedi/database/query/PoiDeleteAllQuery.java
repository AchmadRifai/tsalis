package project.skripsi.enggyheroedi.database.query;

import project.skripsi.enggyheroedi.database.dao.PoiDAO;
import project.skripsi.enggyheroedi.database.data.Data;

import java.sql.SQLException;


public class PoiDeleteAllQuery extends Query
{
	public PoiDeleteAllQuery()
	{
	}


	@Override
	public Data<Integer> processData() throws SQLException
	{
		Data<Integer> data = new Data<>();
		data.setDataObject(PoiDAO.deleteAll());
		return data;
	}
}
