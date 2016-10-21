package sg.edu.nus.iss.vmcs.util.uifactory;

public class AWTUIFactory extends VMCSComponentFactory {

	@Override
	public VMCSButton createButton(String text) {
		return new AWTButton(text);
	}

	@Override
	public VMCSDialog createDialog() {
		return new AWTDialog();
	}

	@Override
	public VMCSLabel createLabel(String text) {
		return new AWTLabel();
	}

	@Override
	public VMCSPanel createPanel() {
		return new AWTPanel();
	}

}
