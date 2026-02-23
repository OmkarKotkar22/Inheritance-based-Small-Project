package Bill;

public class Customer {
	private int id;
	private String CustomerName;
	private String Email;
	private int ContactNo;
	private String Address;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setCustomerName(String CustomerName)
	{
		this.CustomerName = CustomerName;
	}
	public String getCustomerName()
	{
		return CustomerName;
	}
	
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	public String getEmail()
	{
		return Email;
	}
	
	public void setContactNo(int ContactNo)
	{
		this.ContactNo = ContactNo;
	}
	public int getContactNo()
	{
		return ContactNo;
	}
	
	public void setAddress(String Address)
	{
		this.Address = Address;
	}
	public String getAddress()
	{
		return Address;
	}
}
