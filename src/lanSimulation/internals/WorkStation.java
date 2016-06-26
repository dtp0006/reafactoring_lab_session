package lanSimulation.internals;

public class WorkStation extends Node{

	public WorkStation(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
	}
	
	public WorkStation(byte type, String name) {
		super(type, name);
	}	
}