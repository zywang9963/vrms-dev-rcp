package vrms;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	@Override	
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		System.out.println("i am here, perspective");
		layout.addView("vrms.ui.views.TestView", IPageLayout.RIGHT, 0.2f, editorArea);
	}
}
