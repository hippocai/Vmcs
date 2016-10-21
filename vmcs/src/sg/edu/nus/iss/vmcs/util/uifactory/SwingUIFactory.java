package sg.edu.nus.iss.vmcs.util.uifactory;

public class SwingUIFactory extends VMCSComponentFactory {

	@Override
	public VMCSButton createButton(String text) {
		return new SwingButton(text);
	}

	@Override
	public VMCSDialog createDialog() {
		return new SwingDialog();
	}

	@Override
	public VMCSLabel createLabel(String text) {
		return new SwingLabel();
	}

	@Override
	public VMCSPanel createPanel() {
		return new SwingPanel();
	}

}
