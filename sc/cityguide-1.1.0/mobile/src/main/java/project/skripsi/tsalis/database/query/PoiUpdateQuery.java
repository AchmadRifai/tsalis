package project.skripsi.tsalis.database.query;

import project.skripsi.tsalis.database.dao.PoiDAO;
import project.skripsi.tsalis.database.data.Data;
import project.skripsi.tsalis.database.model.PoiModel;

import java.sql.SQLException;


public class PoiUpdateQuery extends Query
{
	private PoiModel mPoi;


	public PoiUpdateQuery(PoiModel poi)
	{
		mPoi = poi;
	}


	@Override
	public Data<Integer> processData() throws SQLException
	{
		Data<Integer> data = new Data<>();
		data.setDataObject(PoiDAO.update(mPoi));
		return data;
	}
}
