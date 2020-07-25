package bug;

public class HouseEstimationCost 
{
		public float fullyAutomatedHome(float total_area_of_house)
		{
			float amount;
			amount=2500*total_area_of_house;
			return amount;
		}
			
		public float Home(float total_area_of_house,int cost_per_square_feet)
		{
			float amount;
			amount=cost_per_square_feet*total_area_of_house;
			return amount;
		}
}
