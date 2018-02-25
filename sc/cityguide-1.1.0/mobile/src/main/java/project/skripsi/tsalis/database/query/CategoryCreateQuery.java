package project.skripsi.tsalis.database.query;

import project.skripsi.tsalis.database.dao.CategoryDAO;
import project.skripsi.tsalis.database.data.Data;
import project.skripsi.tsalis.database.model.CategoryModel;

import java.sql.SQLException;


public class CategoryCreateQuery extends Query
{
	private CategoryModel mCategory;


	public CategoryCreateQuery(CategoryModel category)
	{
		mCategory = category;
	}
	
	
	@Override
	public Data<Integer> processData() throws SQLException
	{
		Data<Integer> data = new Data<>();
		data.setDataObject(CategoryDAO.create(mCategory));
		return data;
	}
}
