package jmini3d.gwt.demo;

import jmini3d.demo.DemoSceneController;
import jmini3d.gwt.EntryPoint3d;
import jmini3d.gwt.input.InputController;
import jmini3d.input.TouchListener;

public class DemoEntryPoint extends EntryPoint3d {

	InputController touchController;

	@Override
	public void onModuleLoad() {
		super.onModuleLoad();
		DemoSceneController sceneController = new DemoSceneController();
		canvas3d.setSceneController(sceneController);
		canvas3d.getRenderer3d().setLogFps(true);
		setTouchListener(sceneController);
	}


	public void setTouchListener(TouchListener listener) {
		if (touchController == null) {
			touchController = new InputController(canvas3d.getElement());
		}
		touchController.setTouchListener(listener);
	}

}