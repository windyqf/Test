package test;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

public class DemoEditor extends EditorPart {
	
	public final static String ID="test.DemoEditor";
	
	private String message="";

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		this.setSite(site);//设置site
		this.setInput(input);//设置输入的IEditorInput对象
		this.setPartName(input.getName());//设置编辑器上方显示的名称
		if(input instanceof DemoInput){
			DemoInput demoInput=(DemoInput)input;
			message=demoInput.getMessage();
		}
		this.setTitleToolTip("123");
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());
		Button btn=new Button(parent,SWT.NONE);
		btn.setText(message);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
