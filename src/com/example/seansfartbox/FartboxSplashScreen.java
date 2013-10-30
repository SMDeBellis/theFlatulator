package com.example.seansfartbox;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class FartboxSplashScreen extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fartbox_splash_screen);
		
		Thread timer = new Thread(){
			
			public void run(){
				
				try{
					sleep(5000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				
				Intent startFartBox = new Intent("com.SDRockstarStudios.SeansFartBox");
				startActivity(startFartBox);
			}
		};
		
		timer.start();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fartbox_splash_screen, menu);
		return true;
	}

}
