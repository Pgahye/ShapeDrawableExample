package com.example.shapedrawableexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_login );

        // URL Text 링크 걸기
        TextView textView = (TextView)findViewById( R.id.tv_signup );
        textView.setMovementMethod( LinkMovementMethod.getInstance() );
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            textView.setText( Html.fromHtml( "<a href=http://www.hellomyoffice.com>Hello My Office 가입하기</a>", Html.FROM_HTML_MODE_LEGACY) );
        } else {
            textView.setText( Html.fromHtml( "<a href=http://www.hellomyoffice.com>Hello My Office 가입하기</a>" ) );
        }
    }
}
