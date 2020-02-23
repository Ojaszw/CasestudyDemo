package Controller;

import java.time.LocalDate;
import java.util.Date;
import Product.ProductStock;
import Daos.DAO;
import Services.ProductServiceImp;

public class ProductController extends ProductServiceImp 
{

	public String exitDateCheck(String orderid, LocalDate date) 
	{
		ProductStock p = DAO.findById(orderid);
		if(p!=null) 
		{
			p.setExitDate(date);
			if (super.exitDateCheck(p))
				return "Exit date updated";
		}
		return "Error : exit method not updated";
	}
   public String updateProductStock(String orderid, LocalDate manufacturingDate, LocalDate expiryDate, double quantityValue) 
	{
		ProductStock p = new ProductStock();
		p.setOrderId(orderid);
		p.setManufacturingDate(manufacturingDate);
		p.setExpiryDate(expiryDate);
		p.setQuantityValue(quantityValue);
		return super.updateProductStock(p);
	}

}