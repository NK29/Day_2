package Org.company;

public class Company extends Client{
	
	public void companyName() {
		System.out.println("Company Name: Wissen");
	}

	public static void main(String[] args) {
		
		Company company = new Company();
		company.companyName();
		company.clientName();
	}

}
