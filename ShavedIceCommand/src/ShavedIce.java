
public class ShavedIce implements IceMachineDevice{

	@Override
	public void start() {
		 System.out.println("ShavedIce making process started ");
		
	}

	@Override
	public void stop() {
		 System.out.println("ShavedIce making process stopped ");
		
	}

	@Override
	public void add(String item) {
		 
		 System.out.println("Adding "+item+" while making ShavedIce");
	}

}
