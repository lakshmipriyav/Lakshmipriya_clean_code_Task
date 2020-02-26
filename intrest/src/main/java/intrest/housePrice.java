package intrest;

public class housePrice {
	public double totalCost(String s,double area)
	{
		double price=0;
		if(s.equals("standard"))
		{
			price=1200*area;
			
		}
		else if(s.equals("above standard"))
		{
			price= 1500*area;
			
		}
		else if(s.equals("high standard"))
		{
			price= 1800*area;
			
		}
		else if(s.equals("high standard and fully automated"))
		{
			price= 2500*area;
			
		}
		
		
			return price;

	}
}
