package com.example.shapedrawableexample;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class PreferencesDialogActivity extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_preferences_dialog );
		
		findViewById( R.id.layout_btn_select_subject ).setOnClickListener( this );
		findViewById( R.id.dialog_layout_button_ok ).setOnClickListener( this );
		findViewById( R.id.dialog_layout_button_cancel ).setOnClickListener( this );		
	}

	@Override
	public void onClick( View view ) {
		switch( view.getId() ) {
			case R.id.dialog_layout_button_ok: {
				setResult( RESULT_OK );
				finish();
				break;
			}
			case R.id.dialog_layout_button_cancel: {
				setResult( RESULT_CANCELED );
				finish();
				break;
			}
			case R.id.layout_btn_select_subject: {
				new 
				AlertDialog.
				Builder(this).
				setIcon(android.R.drawable.ic_dialog_info).
				setTitle("Single Choice Dialog").
				setPositiveButton("확인", new DialogInterface.OnClickListener(){
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
					}
				}).
				setSingleChoiceItems(
					R.array.lists, 
					1, 
					new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							Resources resources = getResources();
							String[] lists = resources.getStringArray( R.array.lists );
							
							TextView textView = (TextView)findViewById( R.id.text_subject_selected );
							textView.setText( lists[which] );
						}
					}).
				show();
				break;
			}
			default:
				break;
		}		
	}
}