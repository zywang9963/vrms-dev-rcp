package vrms.ui.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

import vrms.ui.dialog.MyDialog;

public class ActionTest extends Action implements IWorkbenchAction    {
	
	private  IWorkbenchWindow window;

	public ActionTest(IWorkbenchWindow window) {
		if(window == null) {
			throw new IllegalArgumentException();
		}
		this.window = window;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (window != null) {
			MyDialog md = new MyDialog(window.getShell());
			md.open();
		}

	}


	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		window = null;
	}

}
