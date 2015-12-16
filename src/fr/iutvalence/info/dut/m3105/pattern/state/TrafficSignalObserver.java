package fr.iutvalence.info.dut.m3105.pattern.state;

public interface TrafficSignalObserver
{
	public void notifyTrafficSignalColorChanged(TrafficSignalColor color);
	public void notifyButtonPressed();
}
