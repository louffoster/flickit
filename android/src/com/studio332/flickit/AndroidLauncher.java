package com.studio332.flickit;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		 AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
       
       PlayStoreLinker psl = new PlayStoreLinkerImpl(this);
       initialize(new FlickIt(psl), cfg);
	}
}
