package Services;

import java.time.LocalDate;
import java.util.Date;
import Product.ProductStock;
import Daos.DAO;
import Services.ProductServiceInterface;

public class ProductServiceImp implements ProductServiceInterface 
{
	public String trackProductOrder(ProductStock productStock) 
	{

		return null;
	}
    public boolean doesProductOrderIdExist(String id) 
    {
		
		return false;
	}
    public boolean exitDateCheck(ProductStock productStock)
    {
		if (productStock.getExitDate().compareTo(LocalDate.now())<0)
			return true;
		return false;
	}
    public boolean updateExitDateinStock(ProductStock productStock) 
    {
	
		return false;
	}
    public boolean validateManufacturingDate(LocalDate date)
    {
		if(date.compareTo(LocalDate.of(2020,02,01))<0) return true;
		return false;
	}
    public boolean validateExpiryDate(LocalDate date) 
    {
		
		return true;
	}
    public String updateProductStock(ProductStock productStock) 
    {
		ProductStock p = DAO.findById(productStock.getOrderId());
		if (p!=null && this.validateManufacturingDate(productStock.getManufacturingDate()) == true
				&& this.validateExpiryDate(productStock.getExpiryDate()) == true) 
		{
			p.setManufacturingDate(productStock.getManufacturingDate());
			p.setExpiryDate(productStock.getExpiryDate());
			p.setQuantityValue(productStock.getQuantityValue());
			return "Data Inserted";
		}
		return "ERROR : Data was not inserted";
	}
    public boolean doesProductIdEXistInStock(String id) 
    {
	
		return false;
	}
}
