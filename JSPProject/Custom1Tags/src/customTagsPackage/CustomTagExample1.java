package customTagsPackage;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class CustomTagExample1 implements Tag
{
	private PageContext pc = null;
	private int num1;
	private int num2;
	@Override
	public int doEndTag() throws JspException
	{
		System.out.println("doEndTag method");
		return EVAL_PAGE;
	}
	@Override
	public int doStartTag() throws JspException 
	{

		System.out.println("doStartTag method");
		JspWriter out = pc.getOut();
		int result=0;
		try
		{
			result=num1+num2;
			out.println("Addition of"+num1+"and"+num2+"="+result);
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
		return EVAL_BODY_INCLUDE;
		
	}
	@Override
	public Tag getParent() 
	{
		System.out.println("getParent method");
		return null;
	}
	@Override
	public void release() 
	{
		System.out.println("release method");
		
	}
	
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public void setNum2(int num2) 
	{
		this.num2 = num2;
	}
	@Override
	public void setPageContext(PageContext arg0)
	{
		System.out.println("setPageContext method");
		pc=arg0;
	}
	@Override
	public void setParent(Tag arg0) 
	{
		System.out.println("SetParent method");
		
	}
	
}
