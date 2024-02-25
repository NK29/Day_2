package Org.edu;

public class Education{
	
	public void ug() {
		System.out.println("UG: maths");
	}
	public void pg() {
		System.out.println("PG: science");
	}

	public static void main(String[] args) {
		
		Education education = new Education();
		education.ug();
		education.pg();
		
		Arts arts = new Arts();
		arts.bsc();
		arts.bed();
		arts.ba();
		arts.bba();
		
		Engineering engineering = new Engineering();
		engineering.be();
		engineering.btech();
		
		Medicine medicine = new Medicine();
		medicine.physiyo();
		medicine.dental();
		medicine.mbbs();
	}

}
