package Daos;
import Product.ProductStock;
import Repository.Database;

public class DAO 
{
	public static ProductStock findById(String id) 
	{
		for (ProductStock ps : Database.list) 
		{
			if (ps.getOrderId().equals(String.valueOf(id)))
				return ps;
		}
		return null;
	}

	public static boolean save(ProductStock productStock)
	{
		if(Database.list.add(productStock))
			return true;
		return false;
	}

}