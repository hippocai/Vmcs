package sg.edu.nus.iss.vmcs.util.uifactory;

public abstract class VmcsAbsrtactUiFactory {
	
	public abstract VmcsButton createButton(String text);
	public abstract VmcsLabel createLabel(String text);
	public abstract VmcsPanel createPanel();
}
