package project.skripsi.enggyheroedi.database.query;

import project.skripsi.enggyheroedi.database.dao.PoiDAO;
import project.skripsi.enggyheroedi.database.data.Data;
import project.skripsi.enggyheroedi.database.model.PoiModel;

import java.sql.SQLException;
import java.util.List;


public class PoiReadAllQuery extends Query
{
	private long mSkip = -1l;
	private long mTake = -1l;


	public PoiReadAllQuery()
	{
	}


	public PoiReadAllQuery(long skip, long take)
	{
		mSkip = skip;
		mTake = take;
	}


	@Override
	public Data<List<PoiModel>> processData() throws SQLException
	{
		Data<List<PoiModel>> data = new Data<>();
		data.setDataObject(PoiDAO.readAll(mSkip, mTake));
		return data;
	}
}
