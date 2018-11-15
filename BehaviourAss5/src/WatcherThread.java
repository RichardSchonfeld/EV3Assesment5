import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.NXTSoundSensor;
import lejos.robotics.SampleProvider;


public class WatcherThread extends Thread
{
	
	public static boolean clapped;
	
	private NXTSoundSensor ts = new NXTSoundSensor(SensorPort.S4);
	private SampleProvider sp = ts.getDBAMode();
	private float[] samples = new float[1];
	public void run()
	{
		while(true)
		{
			sp.fetchSample(samples, 0);
			if(samples[0] > 0.8)
			{
				clapped = true;
			}
			else
			{
				clapped = false;
			}
			Thread.yield();
		}
	}
}
