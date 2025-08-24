package com.ashforge.panel;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  @SuppressLint("SetJavaScriptEnabled")
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    WebView w = new WebView(this);
    w.getSettings().setJavaScriptEnabled(true);
    w.setWebViewClient(new WebViewClient(){
      @Override public void onReceivedError(WebView v, int code, String desc, String url){
        v.loadData("""
          <html><body style='font-family:sans-serif;padding:16px'>
          <h2>AshJr is sleeping 😴</h2>
          <p>Couldn’t reach <code>http://127.0.0.1:8765</code>.</p>
          <ol>
            <li>Open Termux</li>
            <li>Run: <code>afctl start</code></li>
            <li>Try again</li>
          </ol>
          </body></html>
        """, "text/html", "utf-8");
      }
    });
    w.loadUrl("http://127.0.0.1:8765/");
    setContentView(w);
  }
}
