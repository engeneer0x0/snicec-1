package com.BeandBe.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.BeandBe.ui.R;

public class Forum extends Fragment{
	WebView webview;

	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView =inflater.inflate(R.layout.frag_forum,container,false);
		webview =(WebView) rootView.findViewById(R.id.webview);
		webview.loadUrl("http://fooddirectionsbelandben.xoo.it/");
		webview.setWebViewClient(new MyWebViewClient());
	 
		
		return rootView;
	}
}