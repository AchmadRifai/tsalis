package project.skripsi.tsalis.database.query;

import project.skripsi.tsalis.database.dao.PoiDAO;
import project.skripsi.tsalis.database.data.Data;
import project.skripsi.tsalis.database.model.PoiModel;

import java.sql.SQLException;
import java.util.List;


public class PoiReadFavoritesQuery extends Query
{
	private long mSkip = -1l;
	private long mTake = -1l;


	public PoiReadFavoritesQuery()
	{
	}


	public PoiReadFavoritesQuery(long skip, long take)
	{
		mSkip = skip;
		mTake = take;
	}


	@Override
	public Data<List<PoiModel>> processData() throws SQLException
	{
		Data<List<PoiModel>> data = new Data<>();
		data.setDataObject(PoiDAO.readFavorites(mSkip, mTake));
		return data;
	}
}
