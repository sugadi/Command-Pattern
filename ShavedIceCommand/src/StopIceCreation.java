
public class StopIceCreation implements IceCommand {
	

	
	private IceMachineDevice iceDevice ;
	
	private String item ;

	public StopIceCreation(IceMachineDevice device) {
		iceDevice = device;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public void execute() {
		iceDevice.stop();
		
	}

	 
	@Override
	public void addItem(String item) {
		// TODO Auto-generated method stub
		
	}
	
	 

	 


}
