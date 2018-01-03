package project.skripsi.enggyheroedi.database.query;

import project.skripsi.enggyheroedi.database.dao.PoiDAO;
import project.skripsi.enggyheroedi.database.data.Data;
import project.skripsi.enggyheroedi.database.model.PoiModel;

import java.sql.SQLException;
import java.util.List;


public class PoiReadByCategoryQuery extends Query
{
	private long mCategoryId;
	private long mSkip = -1l;
	private long mTake = -1l;


	public PoiReadByCategoryQuery(long categoryId)
	{
		mCategoryId = categoryId;
	}


	public PoiReadByCategoryQuery(long categoryId, long skip, long take)
	{
		mCategoryId = categoryId;
		mSkip = skip;
		mTake = take;
	}


	@Override
	public Data<List<PoiModel>> processData() throws SQLException
	{
		Data<List<PoiModel>> data = new Data<>();
		data.setDataObject(PoiDAO.readByCategory(mCategoryId, mSkip, mTake));
		return data;
	}
}
