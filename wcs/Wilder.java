package wcs;

public class Wilder extends Classroom {

	private String firstname;
	private Boolean aware;
	
	public Wilder(String firstname, Boolean aware) {
		super();
		this.firstname = firstname;
		this.aware = aware;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Boolean getAware() {
		return aware;
	}

	public void setAware(Boolean aware) {
		this.aware = aware;
	}
	
	public void whoAmI() {
		if(aware) {			
			System.out.println("Je m'appelle " + firstname + " et je suis aware");
		}else {
			System.out.println("Je m'appelle " + firstname + " et je ne suis pas aware");
		}
	}
	
	
	
}
