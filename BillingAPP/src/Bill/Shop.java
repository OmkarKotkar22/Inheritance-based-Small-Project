package Bill;

public class Shop {
	private Product[] product;
	
	void addProduct(Product... product)
	{
		if(product.length < 5)
		{
			System.out.println("Atleast 5 Products Required: ");
			return;
		}
		this.product = product;
	}
	
	
}
