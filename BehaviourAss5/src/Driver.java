import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.navigation.*;
import lejos.robotics.chassis.*;

public class Driver
{
		
	final static float WHEEL_DIAMETER = 51;
	final static float AXLE_LENGTH = 44;
	final static float ANGULAR_SPEED = 100;
	final static float LINEAR_SPEED = 70;
	
	static RegulatedMotor mL = new EV3LargeRegulatedMotor(MotorPort.A);
	static RegulatedMotor mR = new EV3LargeRegulatedMotor(MotorPort.B);
	static Wheel wheelLeft = WheeledChassis.modelWheel(mL, WHEEL_DIAMETER).offset(-AXLE_LENGTH / 2);
	static Wheel wheelRight = WheeledChassis.modelWheel(mR, WHEEL_DIAMETER).offset(AXLE_LENGTH / 2);
	static Chassis chassis = new WheeledChassis((new Wheel[] {wheelRight, wheelLeft}), WheeledChassis.TYPE_DIFFERENTIAL);
	static MovePilot plt = new MovePilot(chassis);
		
	public static void main(String[] args)
	{	
		plt.setLinearSpeed(LINEAR_SPEED);
		plt.setAngularSpeed(ANGULAR_SPEED);
		
	}
	
	public static void straight() 
	{
		plt.forward();
	}
	
	public static void circle()
	{
		plt.rotate(7200, true);
	}
}
