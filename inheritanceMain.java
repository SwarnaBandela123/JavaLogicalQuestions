package inheritance;

public class inheritanceMain {

	public static void main(String[] args) {
		   Developers devEmp = new Developers("Veerababu", 30, 50000, "Development");
		   devEmp.Bonus= 25000;
		   devEmp.DeveloperDetails();
	        QA qaEmp = new QA("Vamsi", 25, 40000, "Quality Assurance");
	        qaEmp.Bonus=20000;
	        qaEmp.QADetails();
	}

}
