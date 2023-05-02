package paulina.so.faces;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.ToolBar;

public class TelaInicial extends Composite {
	private Label lblVisualizaoDeThreads;
	private Label lblThread2;
	private Label lblThread1;

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(1, false));
		TelaInicial tela = new TelaInicial(shell, SWT.NONE); 
				
		

		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TelaInicial(Composite parent, int style) {
		super(parent, style);
		setForeground(SWTResourceManager.getColor(255, 255, 255));
		setLayout(new GridLayout(2, false));
		
		lblVisualizaoDeThreads = new Label(this, SWT.NONE);
		lblVisualizaoDeThreads.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		lblVisualizaoDeThreads.setAlignment(SWT.CENTER);
		lblVisualizaoDeThreads.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		lblVisualizaoDeThreads.setText("Visualização de Threads");
		
		lblThread2 = new Label(this, SWT.NONE);
		lblThread2.setText("Thread 2");
		
		ProgressBar progressThread1 = new ProgressBar(this, SWT.NONE);
		GridData gd_progressThread1 = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_progressThread1.widthHint = 253;
		progressThread1.setLayoutData(gd_progressThread1);
		
		lblThread1 = new Label(this, SWT.NONE);
		lblThread1.setText("Thread 1");
		
		ProgressBar progressThread2 = new ProgressBar(this, SWT.NONE);
		GridData gd_progressThread2 = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_progressThread2.widthHint = 256;
		progressThread2.setLayoutData(gd_progressThread2);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
