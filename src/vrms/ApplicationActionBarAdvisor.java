package vrms;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

import vrms.ui.action.OpenViewAction;
import vrms.ui.views.CreateOrderView;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private OpenViewAction openViewAction;
	
	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}
	
	@Override
	protected void makeActions(IWorkbenchWindow window) {
		
		openViewAction = new OpenViewAction(window,"开单",CreateOrderView.ID, vrms_rcp.Activator.getImageDescriptor(CreateOrderView.IMG_DES_48));
		register(openViewAction);
	}
	
	@Override
	protected void fillMenuBar(IMenuManager menuBar) {
		MenuManager newMenu = new MenuManager("订单管理","vrms.ui.menu.ordermgt");
		menuBar.add(newMenu);
		newMenu.add(openViewAction);
		
	}
	
	@Override
	protected void fillCoolBar(ICoolBarManager coolBar) {
        IToolBarManager toolbar = new ToolBarManager(SWT.FLAT | SWT.RIGHT);
        coolBar.add(new ToolBarContributionItem(toolbar, "main"));   
        toolbar.add(openViewAction);
        
	}

}

