package com.example.mkmk_otohime;

import java.io.IOException;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.app.Activity;
import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnClickListener{

	MediaPlayer mp ;
	Button button ;
	ToggleButton tButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mp = MediaPlayer.create(this, R.raw.toilet);
		
		tButton = (ToggleButton)findViewById(R.id.toggleButton_otohime);
		tButton.setOnClickListener(this);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		StringBuilder sb = new StringBuilder();
		if(R.id.toggleButton_otohime == v.getId()){
			if(mp.isPlaying()){
				mp.stop();
				mp.prepareAsync(); //
				mp.seekTo(0); // 
				sb.append("START");
			}
			else{
				mp.start();
				sb.append("STOP ");
			}
		}

//		sb.append("isPlaying af : ").append(mp.isPlaying()).append("\n");
//		TextView tv = (TextView)findViewById(R.id.mp_param);
//		tv.setText(sb.toString());
		
	}

	
    /**
     * トースト表示
     * @param text
     */
    private void showToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    /**
     * リソースIDからトースト表示
     * 本当は以下のURLを参考にして_(int resId)メソッドを作ると便利です
     * http://d.hatena.ne.jp/language_and_engineering//p
     * @param resId
     */
    private void showToast(int resId) {
        showToast(getText(resId).toString());
    }

    /**
     * デフォルトのSharedPreferencesを返す
     * 案外便利
     * @return　PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
     */
    private SharedPreferences getSP() {
        return PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    }

	
}
