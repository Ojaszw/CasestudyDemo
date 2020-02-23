package Main;
import java.time.LocalDate;
import Controller.ProductController;
import Services.ProductServiceImp;
import java.util.*;;

public class Main 
{

	public static void main(String[] args)
	{
		
	}
	
	String setExitDate(String id,LocalDate d) 
	{
		ProductController pc=new ProductController();
		return pc.exitDateCheck(id, d);
	}
	String updateProductStock(String oderid,LocalDate manufacturing,LocalDate expiry,double qa )
	{
		ProductController pc=new ProductController();
		return pc.updateProductStock(oderid, manufacturing, expiry, qa);
	}
}


