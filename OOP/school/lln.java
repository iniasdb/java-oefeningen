package school;

public class lln {
	public lln(String fname, String lname, String className) {
		this.fname = fname;
		this.lname = lname;
		this.className = className;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	private String fname;
	private String lname;
	private String className;
}
