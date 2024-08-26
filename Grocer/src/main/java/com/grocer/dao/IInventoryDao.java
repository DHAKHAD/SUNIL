package com.grocer.dao;

import java.util.Map;
import com.grocer.model.Grocery;

public interface IInventoryDao extends AutoCloseable {
	public int insertGrocery(Grocery grocery);
	public int updateGrocery(int groceryId, Grocery grocery);
	public int deleteGrocery(int groceryId);
	public int updateStock(int groceryId, int stock);
	public Map<Integer, Grocery> fetchAll();
	public Grocery fetchByID(int groceryId);
	@Override
	void close();
}
