package Access_Modifiesrs;

public class ACCESS_MODIFIERS {
	

	private void PrIvAte()
	{	
		System.out.println("THIS IS THE PRIVATE Access Modifier METHOD  ");	
	}
	void DeFaUlt()
	{	
		System.out.println("THIS IS THE DEFAULT Access Nodifier METHOD ");	
	}
	protected void pRoTeCTED()
	{
		System.out.println("THIS IS THE PROTECTED aCCESS Modifier Method ");		
	}
	public void PubLic()
	{
		System.out.println("THIS IS THE PUBLIC Access Modifier METHOD ");
	}
	
	// This all methods are accessible within the class 
	// accessibility is shown as follows :
	
	public static void main(String arg[])
	{
		ACCESS_MODIFIERS s=new ACCESS_MODIFIERS();
		
		s.PrIvAte();
		s.DeFaUlt();
		s.pRoTeCTED();
		s.PubLic();
	}

}
