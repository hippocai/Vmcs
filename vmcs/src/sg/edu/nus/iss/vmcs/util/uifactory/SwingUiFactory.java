package sg.edu.nus.iss.vmcs.util.uifactory;

public class SwingUiFactory extends VmcsAbsrtactUiFactory{

	@Override
	public VmcsButton createButton(String text) {
		// TODO Auto-generated method stub
		return new SwingButton(text);

	}

	@Override
	public VmcsLabel createLabel(String text) {
		// TODO Auto-generated method stub
		return new SwingLabel();
	}

	@Override
	public VmcsPanel createPanel() {
		// TODO Auto-generated method stub
		return new SwingPanel();
	}

}
