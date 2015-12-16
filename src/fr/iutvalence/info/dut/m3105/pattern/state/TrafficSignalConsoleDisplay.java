package fr.iutvalence.info.dut.m3105.pattern.state;

public class TrafficSignalConsoleDisplay implements TrafficSignalObserver
{

	@Override
	public void notifyTrafficSignalColorChanged(TrafficSignalColor color)
	{
		System.out.println("Traffic signal state is "+color);
		
	}

	@Override
	public void notifyButtonPressed()
	{
		System.out.println("button pressed!");
	}

}
