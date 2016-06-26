package lanSimulation.internals;

public class WorkStation extends Node{

	public WorkStation(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
	}
	
	public WorkStation(byte type, String name) {
		super(type, name);
	}	
	
	@Override
	public void printOn(StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}
	
	@Override
	public void printXMLOn(StringBuffer buf) {
		buf.append("<workstation>");
		buf.append(name_);
		buf.append("</workstation>");
	}
}