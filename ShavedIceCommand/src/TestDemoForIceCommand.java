
public class TestDemoForIceCommand {

	public static void main(String args[]) {

		IceMachineDevice shavedIce = new ShavedIce();

		StartIceCreation startShavedIce = new StartIceCreation(shavedIce);
		RemoteControl startShavedIceControl = new RemoteControl(startShavedIce);
		startShavedIceControl.buttonPress();
		
		
		StopIceCreation stopShavedIce = new StopIceCreation(shavedIce);
		RemoteControl stopShavedIceControl = new RemoteControl(stopShavedIce);
		stopShavedIceControl.buttonPress();
		
		System.out.println("\n*****************************************************\n");
		
		IceMachineDevice blockIce = new BlockIce();
		
		StartIceCreation startBlockIce = new StartIceCreation(blockIce);
		RemoteControl  startBlockIceControl = new RemoteControl(startBlockIce);
		startBlockIceControl.buttonPress();
		
		AddItemInIce addItem = new AddItemInIce(blockIce);
		 RemoteControl blocksRemoteControl = new RemoteControl(addItem,"Cherries");
		 blocksRemoteControl.addItemButtonPress();
		 
		 StopIceCreation stopBlockIce = new StopIceCreation(blockIce);
			RemoteControl stopBlockIceControl = new RemoteControl(stopBlockIce);
			stopBlockIceControl.buttonPress();
		 
	}

}
