package bug;

public class House 
{
	public int Caluclation(String Material_Standard, double Area, String Fully_Auto_Home)
	   {
		   if(Material_Standard.contentEquals("High Standard Materials")&& Fully_Auto_Home.contentEquals("Fully Automated Home"))
		           return(int)(2500*Area);
		   else if(Material_Standard.equals("Standard Materials"))
			   return(int)(Area*1200);
		   else if(Material_Standard.equals("Above Standard Materials"))
			   return(int)(Area*1500);
		   else if(Material_Standard.equals("High Standard Materials"))
			   return(int)(Area*1800);
		   return 0;
	   }
	   
	   public double Simple(double x, double y,double z)
	   {
		   return x * (y/100) * z;
	   }
	   public double Compound(double x, double y,double z)
	   {
		   return (x*(Math.pow((1+(z/100)),y)))-x;
	   }

}
