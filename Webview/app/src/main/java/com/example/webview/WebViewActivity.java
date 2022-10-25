package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        wv1 = (WebView)findViewById(R.id.webView);

        String URL = getIntent().getStringExtra("web");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://" +URL);
    }

    public void cerrar(View view){
        finish();
    }
}