import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;

public class Clap implements Behavior{
	
	public static boolean isCircle = true;
	
	@Override
	public boolean takeControl()
	{
		if(WatcherThread.clapped)
		{
			return true;
		}
		return false;
	}

	@Override
	public void action()
	{
		if(isCircle)
		{
			Driver.straight();	
			Delay.msDelay(100);
			isCircle = !isCircle;
		}
		else
		{
			Driver.circle();
			Delay.msDelay(100);
			isCircle = !isCircle;
		}
	}

	@Override
	public void suppress(){}

	
}
