package com.studio332.flickit.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.studio332.flickit.FlickIt;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "FlickIt";
      cfg.width = 512;//800;
      cfg.height = 800;//512
      new LwjglApplication(new FlickIt( new PlayStoreLinkerStub()), cfg);
	}
}
