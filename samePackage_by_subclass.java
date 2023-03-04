package Access_Modifiesrs;

public class samePackage_by_subclass  extends ACCESS_MODIFIERS{

	public static void main(String arg[])
	{
		ACCESS_MODIFIERS d=new ACCESS_MODIFIERS();
		
	/*	 d.PrIvAte();              */ // this is the private access modifier and it is unable to use in other class 
		d.DeFaUlt();
		d.pRoTeCTED();
		d.PubLic();
	}
	
}
