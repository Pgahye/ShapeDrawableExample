package com.example.shapedrawableexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main );
    }

    public void onLogonActivityButtonClicked( View view ) {
        startActivity( new Intent( this, LoginActivity.class ) );
    }

    public void onLogonActivity2ButtonClicked( View view ) {
        startActivity( new Intent( this, LoginActivity2.class ) );
    }

    public void onRndomChatMainActivityButtonClicked( View view ) {
        startActivity( new Intent( this, RandomChatMainActivity.class ) );
    }

}
