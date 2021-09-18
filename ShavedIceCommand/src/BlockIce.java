
public class BlockIce implements IceMachineDevice {

	@Override
	public void start() {
		 System.out.println("BlockIce making process started ");
		
	}

	@Override
	public void stop() {
		 System.out.println("BlockIce making process stopped ");
	}

	@Override
	public void add(String item) {
		System.out.println("Adding "+item+" while making BlockIce");
		
	}

}
