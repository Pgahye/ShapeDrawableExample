package com.example.shapedrawableexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RandomChatMainActivity extends Activity implements OnClickListener {
	
	private static final int RESULT_CODE_FOR_PREFERENCES_DIALOG_ACTIVITY = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_randomchat_main);
		
		( ( Button ) findViewById( R.id.button_settings ) ).setOnClickListener( this );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick( View v ) {
		switch( v.getId() ) {
			case R.id.button_settings : {
				Intent intent = new Intent( this, PreferencesDialogActivity.class );
				startActivityForResult( intent, RESULT_CODE_FOR_PREFERENCES_DIALOG_ACTIVITY );
				break;
			}
			default: {
				break;
			}		
		}
	}
}
