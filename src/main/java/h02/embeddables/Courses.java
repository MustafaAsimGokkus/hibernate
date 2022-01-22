package h02.embeddables;

import javax.persistence.Embeddable;

@Embeddable
public class Courses {

	private String selective;
	private String mandatory;
	
	
	public Courses() {
		super();
	}


	public Courses(String selective, String mandatory) {
		super();
		this.selective = selective;
		this.mandatory = mandatory;
	}


	/**
	 * @return the selective
	 */
	public String getSelective() {
		return selective;
	}


	/**
	 * @param selective the selective to set
	 */
	public void setSelective(String selective) {
		this.selective = selective;
	}


	/**
	 * @return the mandatory
	 */
	public String getMandatory() {
		return mandatory;
	}


	/**
	 * @param mandatory the mandatory to set
	 */
	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}


	@Override
	public String toString() {
		return "Courses [selective=" + selective + ", mandatory=" + mandatory + "]";
	}
	
	
}
