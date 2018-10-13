package com.example.annikadiekmann.studentportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class WebPage extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        //Initialize
        mWebView = (android.webkit.WebView) findViewById(R.id.webview);
        mWebView.loadUrl(getIntent().getStringExtra("URL"));
    }
}