package fr.iutvalence.info.dut.m3105.pattern.state;


public abstract class TrafficSignalState
{
	protected final TrafficSignalContext context;
	protected int durationInSeconds;
	private final TrafficSignalColor color;
	
	public TrafficSignalState(TrafficSignalContext context, int durationInSeconds, TrafficSignalColor name)
	{
		super();
		this.context = context;
		this.durationInSeconds = durationInSeconds;
		this.color = name;
	}

	public void buttonPressed() 
	{		

	}

	public void secondEllapsed() 
	{
		this.durationInSeconds--;
		System.out.println(this.durationInSeconds);
	}

	public TrafficSignalColor getColor()
	{
		return this.color;
	}
}
