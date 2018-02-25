package project.skripsi.tsalis.database.query;

import project.skripsi.tsalis.database.dao.PoiDAO;
import project.skripsi.tsalis.database.data.Data;

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
