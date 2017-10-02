
public class BuddyInfo {

	private String name;
	private String adress;
	private String number;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public BuddyInfo(String name, String adress, String number) {
		this.name = name;
		this.adress = adress;
		this.number = number;
	}

	public String toString() {
		String all;
		all = name +" "+adress+" "+number;
		return all;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
