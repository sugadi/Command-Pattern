
public class StartIceCreation implements IceCommand{
	

	
	private IceMachineDevice iceDevice ;
	
	private String item ;

	public StartIceCreation(IceMachineDevice lotion) {
		iceDevice = lotion;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public void execute() {
		iceDevice.start();
		
	}

	 

	@Override
	public void addItem(String item) {
		 
		
	}
	
	 

	 


}
