
public class AddItemInIce implements IceCommand {
	
	private IceMachineDevice iceDevice ;
	
	private String item ;

	public AddItemInIce(IceMachineDevice addDevice, String addItem) {
		iceDevice = addDevice;
		item = addItem;
	}

	public AddItemInIce(IceMachineDevice device) {
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
		 
		
	}

	 
	public IceMachineDevice getIceDevice() {
		return iceDevice;
	}

	public void setIceDevice(IceMachineDevice iceDevice) {
		this.iceDevice = iceDevice;
	}

	@Override
	public void addItem(String item) {
		iceDevice.add(item);
		
	}
	
	 

	 
}
