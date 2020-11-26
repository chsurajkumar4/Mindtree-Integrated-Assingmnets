package IntegratedAssingmentNumber47;

public class BankUser {
	private long accNo;
	private String name = "";
	private String add = "";
	private String DOB = "";
	private String accType = "";
	private float balance;
	private int valid = 0;
	
	void setAccNo(long accNo)
	{
		this.accNo=accNo;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	void setAddress(String add)
	{
		this.add=add;
	}
	
	void setDOB(String dob)
	{
		this.DOB=dob;
	}
	
	void setAccType(String accType)
	{
		this.accType=accType;
	}
	
	void setBalance(float balance)
	{
		this.balance=balance;
	}
	
	void setValid(int valid)
	{
		this.valid=valid;
	}
	
	long getAccNo()
	{
		return this.accNo;
	}
	
	String getName()
	{
		return this.name;
	}
	
	String getAddress()
	{
		return this.add;
	}
	
	String getDOB()
	{
		return this.DOB;
	}
	
	String getAccType()
	{
		return this.accType;
	}
	
	float getBalance()
	{
		return this.balance;
	}
	
	int getValid()
	{
		return this.valid;
	}
}
