package test;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class Handler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if(MessageDialog.openConfirm(new Shell(),"si应用te view ","是否打开")){
			try{
				IWorkbenchPage page=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				page.openEditor(new DemoInput("测试的Demo"),DemoEditor.ID);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return null;
	}

}
