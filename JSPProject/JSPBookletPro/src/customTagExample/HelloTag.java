package customTagExample;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class HelloTag implements Tag
{
	private PageContext pc = null;
	
	@Override
	public int doEndTag() throws JspException
	{
		System.out.println("doEndTag");
		return SKIP_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println("doStartTag");
		JspWriter out = pc.getOut();
		try
		{
			out.println("Hello to All");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public Tag getParent() {
		System.out.println("getParent");
		return null;
	}

	@Override
	public void release() 
	{
		System.out.println("release");	
	}

	@Override
	public void setPageContext(PageContext arg0) {
		System.out.println("setPageContext");
		pc=arg0;
		
	}

	@Override
	public void setParent(Tag arg0) {
		System.out.println("setParent");
		
	}

}
