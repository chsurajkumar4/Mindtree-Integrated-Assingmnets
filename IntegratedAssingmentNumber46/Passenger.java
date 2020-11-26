package IntegratedAssingmentNumber46;

public class Passenger {

	private int id=0;
	private int age=0;
	private String name="";
	private String add ="";
	private String phno ="";
	
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
		this.add=add;
	}
	
	void setPhNum(String phno)
	{
		this.phno=phno;
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
		return this.add;
	}
	
	String getPhNum()
	{
		return this.phno;
	}
	
	
}
