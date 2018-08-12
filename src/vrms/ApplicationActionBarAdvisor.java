package vrms;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

import vrms.ui.action.ActionTest;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IWorkbenchAction actionTest;
	
	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}
	
	@Override
	protected void makeActions(IWorkbenchWindow window) {
		super.makeActions(window);
		actionTest = new ActionTest(window);
		actionTest.setText("菜单项1");
		actionTest.setId("vrms.ui.action.actiontest");
		register(actionTest);
	}
	
	@Override
	protected void fillMenuBar(IMenuManager menuBar) {
		super.fillMenuBar(menuBar);
		MenuManager newMenu = new MenuManager("菜单1","vrms.ui.menu");
		menuBar.add(newMenu);
		newMenu.add(actionTest);
		
	}
	
	@Override
	protected void fillCoolBar(ICoolBarManager coolBar) {
		super.fillCoolBar(coolBar);
	}

}

