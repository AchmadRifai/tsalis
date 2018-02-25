package project.skripsi.tsalis.database.query;

import project.skripsi.tsalis.database.dao.CategoryDAO;
import project.skripsi.tsalis.database.data.Data;
import project.skripsi.tsalis.database.model.CategoryModel;

import java.sql.SQLException;


public class CategoryReadQuery extends Query
{
	private long mId;


	public CategoryReadQuery(long id)
	{
		mId = id;
	}


	@Override
	public Data<CategoryModel> processData() throws SQLException
	{
		Data<CategoryModel> data = new Data<>();
		data.setDataObject(CategoryDAO.read(mId));
		return data;
	}
}
