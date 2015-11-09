package gerard;

/**
 * @author Timothy Gerard
 *
 */
public class Label {
	private ContestantInformation ci;
	private String output;


	public Label(ContestantInformation ci){
		this.ci = ci;
		formatName();
		formatAdress();
		formatPhoneNum();
	}
	public void formatName(){
		this.output = ci.getFname() + ", " + ci.getLname();
		//return formatName();
		
	}
	public void formatAdress(){
		this.output = output + ci.getStNum() + ci.getStName();
		this.output = output + ci.getCity() + ci.getProvince();
		this.output = output + ci.getPostalCode();
		//return formatAdress();
	}
	public void formatPhoneNum(){
		this.output = output + ci.getPhoneNum();
		//return formatPhoneNum();
}
	public String toString(){
		return output;
	}
}