package sg.edu.nus.iss.vmcs.util.uifactory;

public class AWTUIFactory extends VmcsAbsrtactUiFactory{
	@Override
	public VmcsButton createButton(String text){
		return new AWTButton(text);
	}

	@Override
	public VmcsLabel createLabel(String text) {
		// TODO Auto-generated method stub
		return new AWTLabel(text);
	}

	@Override
	public VmcsPanel createPanel() {
		// TODO Auto-generated method stub
		return new AWTPanel();
	}
}
