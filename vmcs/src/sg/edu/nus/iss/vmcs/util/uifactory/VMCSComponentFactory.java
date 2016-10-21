package sg.edu.nus.iss.vmcs.util.uifactory;

public abstract class VMCSComponentFactory {
	public abstract VMCSButton createButton(String text);
	public abstract VMCSDialog createDialog();
	public abstract VMCSLabel createLabel(String text);
	public abstract VMCSPanel createPanel();
}
