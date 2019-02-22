package beans;

public class Truck
{
   // one concrete class
	
	public Engine MyTrcukEngine(){
		
		Engine e= new Engine();
		e.setName("echier");
		
		return e;
		
		//finally we return e of Engine
		// but if we dont want this implemation we can override this implemetation by look-up mwthod DI
		
	}
}
