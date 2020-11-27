package IntegratedAssingmentNumber46;

public class Passenger {

	private int id=0;
	private int age=0;
	private String name="";
	private String address ="";
	private String phoneNumber ="";
	
	Passenger(int id,int age,String name,String add,String phoneNumber)
	{
		this.id=id;
		this.age=age;
		this.name=name;
		this.address=add;
		this.phoneNumber=phoneNumber;
	}
	
	void setId(int id)
	{
		this.id=id;
	}
	
	void setAge(int age)
	{
		this.age=age;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	void setAddress(String add)
	{
		this.address=add;
	}
	
	void setPhNum(String phno)
	{
		this.phoneNumber=phno;
	}
	
	int getId()
	{
		return this.id;
	}
	

	int getAge()
	{
		return this.age;
	}
	
	String getName()
	{
		return this.name;
	}
	
	String getAddress()
	{
		return this.address;
	}
	
	String getPhNum()
	{
		return this.phoneNumber;
	}
	
	
}
