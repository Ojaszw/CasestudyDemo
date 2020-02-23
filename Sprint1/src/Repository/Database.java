package Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import Product.ProductStock;

public class Database 
{
	public static List<ProductStock> list = new ArrayList<ProductStock>
	(
			Arrays.asList(new ProductStock("87","Rum",10.0),new ProductStock("89","Whiskey",20.0),
					new ProductStock("99","beer",10.0),new ProductStock("67","vodka",10.0),
					new ProductStock("48","santra",10.0))
	); 

 }