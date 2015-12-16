package fr.iutvalence.info.dut.m3105.pattern.state;


public class TrafficSignal extends Thread implements TrafficSignalContext, TrafficSignalUserInterface
{
	private TrafficSignalState state;
	private TrafficSignalObserver tsObserver;

	public TrafficSignal(TrafficSignalObserver tsObserver)
	{
		this.tsObserver=tsObserver;
	}

	@Override
	public void setTrafficSignalState(TrafficSignalState state)
	{
		this.tsObserver.notifyTrafficSignalColorChanged(state.getColor());
		this.state = state;		
	}

	@Override
	public void pressButton()
	{
		this.state.buttonPressed();
		
	}
	
	public void run()
	{
		this.setTrafficSignalState(new TrafficSignalGreenState(this));
		while (true)
		{
			try
			{
				Thread.sleep(1000);
				this.state.secondEllapsed();
			}
			catch (InterruptedException e)
			{
				break;
			}
		}
	}
	
}
