package Corejava;

public class TestEncap {

	public static void main(String[] args) {
		EncapsulationDemo e = new EncapsulationDemo();
		e.setSsn(1);
		e.setEmpAge(30);
		e.setEmpName("Tahseen");
		System.out.println("Employe ssn: "+e.getSsn());
		System.out.println("Employe Age: "+e.getEmpAge());
		System.out.println("Employe Name: "+e.getEmpName());

	}

}
