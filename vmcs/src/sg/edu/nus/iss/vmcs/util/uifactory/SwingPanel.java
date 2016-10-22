package sg.edu.nus.iss.vmcs.util.uifactory;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingPanel extends JPanel implements VmcsPanel {

	@Override
	public void add(VmcsButton button) {
		add((JButton)button);
		
	}

	@Override
	public void add(VmcsLabel label) {
		add((JLabel) label);
		
	}

	@Override
	public void add(VmcsTextField textfield) {
		add((JTextField) textfield);

		
	}

}
