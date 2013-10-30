package com.example.seansfartbox;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SeansFartBox extends Activity {
	
	private AudioManager audioManager = null;
	int currentVolume;
	int maxVolume;
	
	Button fart1;
	Button fart2;
	Button fart3;
	Button fart4;
	Button fart5;
	Button fart6;
	Button fart7;
	
	MediaPlayer player1;
	MediaPlayer player2;
	MediaPlayer player3;
	MediaPlayer player4;
	MediaPlayer player5;
	MediaPlayer player6;
	MediaPlayer player7;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seans_fart_box);
    
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        currentVolume = audioManager.getStreamVolume(audioManager.STREAM_MUSIC);
        maxVolume = audioManager.getStreamMaxVolume(audioManager.STREAM_MUSIC);
        audioManager.setStreamVolume(audioManager.STREAM_MUSIC, maxVolume, 0);
        
        fart1 = (Button) findViewById(R.id.beanButton);
        fart2 = (Button) findViewById(R.id.MotorButton);
        fart3 = (Button) findViewById(R.id.QuickButton);
        fart4 = (Button) findViewById(R.id.windyButton);
        fart5 = (Button) findViewById(R.id.squeakyButton);
        fart6 = (Button) findViewById(R.id.rigidButton);
        fart7 = (Button) findViewById(R.id.wetButton);
        
        player1 = MediaPlayer.create(this, R.raw.beanfartsound);
    	player2 = MediaPlayer.create(this, R.raw.motorbikefartsound);
    	player3 = MediaPlayer.create(this, R.raw.quickfartsound);
    	player4 = MediaPlayer.create(this, R.raw.windyfartsound);
    	player5 = MediaPlayer.create(this, R.raw.squeaker);
    	player6 = MediaPlayer.create(this, R.raw.rigid);
    	player7 = MediaPlayer.create(this, R.raw.wet);
        
        player1.setLooping(false);
        player2.setLooping(false);
        player3.setLooping(false);
        player4.setLooping(false);
        player5.setLooping(false);
        player6.setLooping(false);
        player7.setLooping(false);
        
        setButtonOnClickListeners();
    }

	private void setButtonOnClickListeners(){
		
		
		fart1.setOnClickListener(new OnClickListener(){

			
			
			@Override
			public void onClick(View arg0) {
				
				if(!player1.isPlaying())
				{
					player1.start();
				}
			}
		});
		
		fart2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				if(!player2.isPlaying())
				{
					player2.start();
				}
			}
		});
		
		fart3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				if(!player3.isPlaying())
				{
					player3.start();
				}
			}
		});
		
		fart4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				if(!player4.isPlaying())
				{
					player4.start();
				}
			}
		});
		
		fart5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				if(!player5.isPlaying())
				{
					player5.start();
				}
			}
		});
		
		fart6.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				if(!player6.isPlaying())
				{
					player6.start();
				}
			}
		});
		
		fart7.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				if(!player7.isPlaying())
				{
					player7.start();
				}
			}
		});
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.seans_fart_box, menu);
        return true;
    }

    
	@Override
	protected void onDestroy() {
		
		super.onDestroy();
		player1.release();
		player2.release();
		player3.release();
		player4.release();
		player5.release();
		player6.release();
		player7.release();
		
		audioManager.setStreamVolume(audioManager.STREAM_MUSIC, currentVolume, 0);
		
	}
    
    
}
