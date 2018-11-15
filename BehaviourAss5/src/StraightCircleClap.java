import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class StraightCircleClap
{
		
	public static void main(String[] args)
	{
		
		Behavior b1 = new Clap();
		
		Behavior [] behaviours = {b1};
		
		Arbitrator ab = new Arbitrator(behaviours);
		

		WatcherThread wtt = new WatcherThread();
		wtt.setDaemon(true);	
		wtt.start();
		
		Driver.circle();
		
		ab.go();
	}
}
