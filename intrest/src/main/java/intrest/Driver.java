package intrest;

public class Driver {
	double sintrest,cintrest;
	public double simpleIntrest(double p,int t,double r)
	{
		
		sintrest= ((p*t*r)/100);
		 
		return sintrest;
	}
	public double compoundIntrest(double p,int t,double r)
	{
		
		double v=p*(Math.pow(((100+r)/100),(double)t));
		cintrest= v-p;
		
		return cintrest;
	}

}
