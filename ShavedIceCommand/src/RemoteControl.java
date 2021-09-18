
public class RemoteControl {
	
	private IceCommand command ;
	
	private String item ;

	public RemoteControl(IceCommand  command) {
		 this.command=command;
	}

	public RemoteControl(IceCommand command, String item) {
		 this.command=command;
		 this.item = item;
		 
	}

	public IceCommand getCommand() {
		return command;
	}

	public void setCommand(IceCommand command) {
		this.command = command;
	}
	
	public void buttonPress() {
		command.execute();
	}
	
	public void addItemButtonPress() {
		command.addItem(item);
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
