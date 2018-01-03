package project.skripsi.enggyheroedi.database.query;

import project.skripsi.enggyheroedi.database.dao.PoiDAO;
import project.skripsi.enggyheroedi.database.data.Data;
import project.skripsi.enggyheroedi.database.model.PoiModel;

import java.sql.SQLException;
import java.util.List;


public class PoiSearchQuery extends Query
{
	private String mQuery;
	private long mSkip = -1l;
	private long mTake = -1l;


	public PoiSearchQuery(String query)
	{
		mQuery = query;
	}


	public PoiSearchQuery(String query, long skip, long take)
	{
		mQuery = query;
		mSkip = skip;
		mTake = take;
	}


	@Override
	public Data<List<PoiModel>> processData() throws SQLException
	{
		Data<List<PoiModel>> data = new Data<>();
		data.setDataObject(PoiDAO.search(mQuery, mSkip, mTake));
		return data;
	}
}
