package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestApplication extends JFrame {

	public TestApplication() {
		super("Test Application");
		this.setSize(800,600);		
		JPanel jp = new JPanel();
		jp.add(new JLabel("Hello"));
		this.setContentPane(jp);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		System.setProperty("sun.java2d.uiScale", "2.5");
		new TestApplication();
	}

}
