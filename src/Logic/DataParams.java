package Logic;

public class DataParams extends ParametersGrouping{
	private int national3GFreeMb;
	private int international3GFreeMb; 
	private int national4GFreeMb;
	private int international3GMB_Mbytes; 
	
	
	// base rates
	private float ratePerMega; 
	private float ratePerDayForUnlimited;
	
	public DataParams(int national3GFreeMb, int international3GFreeMb,
			int national4GFreeMb, int international3gmb_Mbytes,
			float ratePerMega, float ratePerDayForUnlimited) {
		super();
		this.national3GFreeMb = national3GFreeMb;
		this.international3GFreeMb = international3GFreeMb;
		this.national4GFreeMb = national4GFreeMb;
		this.international3GMB_Mbytes = international3gmb_Mbytes;
		this.ratePerMega = ratePerMega;
		this.ratePerDayForUnlimited = ratePerDayForUnlimited;
	} 
	
	
	
	
	
}
