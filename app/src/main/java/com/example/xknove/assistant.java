package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class assistant extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        webView = (WebView) findViewById(R.id.WebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://google.com");

    }

}



