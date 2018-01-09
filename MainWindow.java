import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;

public class MainWindow {

	protected Shell shlLogin;
	private Text passwordField;
	private Text usernameField;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlLogin.open();
		shlLogin.layout();
		while (!shlLogin.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlLogin = new Shell();
		shlLogin.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shlLogin.setSize(450, 604);
		shlLogin.setText("Login");
		
		CLabel uncleTetsuImage = new CLabel(shlLogin, SWT.NONE);
		uncleTetsuImage.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		uncleTetsuImage.setRightMargin(6);
		uncleTetsuImage.setLeftMargin(6);
		uncleTetsuImage.setImage(SWTResourceManager.getImage(MainWindow.class, "/org/eclipse/wb/swt/aboutpic.png"));
		uncleTetsuImage.setBounds(115, 22, 217, 335);
		uncleTetsuImage.setText("");
		
		passwordField = new Text(shlLogin, SWT.BORDER);
		passwordField.setBounds(182, 428, 110, 19);
		
		Button loginButton = new Button(shlLogin, SWT.NONE);
		loginButton.setBounds(142, 474, 95, 28);
		loginButton.setText("Login");
		
		usernameField = new Text(shlLogin, SWT.BORDER);
		usernameField.setBounds(182, 386, 110, 19);
		
		Label usernameLabel = new Label(shlLogin, SWT.NONE);
		usernameLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		usernameLabel.setBounds(86, 389, 60, 14);
		usernameLabel.setText("Username");
		
		Label passwordLabel = new Label(shlLogin, SWT.NONE);
		passwordLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		passwordLabel.setBounds(85, 431, 60, 14);
		passwordLabel.setText("Password");
		
		Button newAccountButton = new Button(shlLogin, SWT.NONE);
		newAccountButton.setBounds(86, 508, 217, 28);
		newAccountButton.setText("Create New Account");

	}
}
