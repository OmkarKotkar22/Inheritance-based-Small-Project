package Bill;

public class Product {
	private int id;
	private String productName;
	private int quantity;
	private int rate;
	private int total;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public String getProductName()
	{
		return productName;
	}
	
	public void setQuatity(int quantity)
	{
		this.quantity = quantity;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setRate(int rate)
	{
		this.rate = rate;
	}
	public int getRate()
	{
		return rate;
	}
	
	public void setTotal(int total)
	{
		this.total = total;
	}
	public int getTotal()
	{
		return total;
	}
}
