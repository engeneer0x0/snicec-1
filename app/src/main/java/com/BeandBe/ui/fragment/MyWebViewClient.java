package com.BeandBe.ui.fragment;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {

	
	@Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
		return false;
		
	}
}
