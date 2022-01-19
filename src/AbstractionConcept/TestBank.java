package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank ab = new HDFCBank(); 
		ab.loan(); 
		ab.Debit(); 
		ab.Credit(); 
		
		
		Bank b = new HDFCBank(); 
		b.loan(); 
		b.Debit(); 
		b.Credit(); 
		//b.funds();---> can't access ,because it is method of child class only 

		} 

		  
	}

