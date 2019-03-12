package javaBeanExamples;

import java.io.Serializable;

public class JavaBeanEx1 implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int rollno;
	private String name;
	
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
