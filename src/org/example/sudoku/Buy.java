package org.example.sudoku;
import android.app.Activity;
import android.os.Bundle;

import android.webkit.WebView;
public class Buy extends Activity
{
	WebView mWebView;
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.buy);

	    mWebView = (WebView) findViewById(R.id.webview);
	    mWebView.getSettings().setJavaScriptEnabled(true);
	    mWebView.loadUrl("http://www.youtube.com/watch?v=oHg5SJYRHA0&feature=fvsr");
	}
	
}
