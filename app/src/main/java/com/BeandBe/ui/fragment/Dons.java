package com.BeandBe.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.BeandBe.ui.R;

public class Dons extends Fragment{
    WebView web;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView =inflater.inflate(R.layout.frag_dons,container,false);
	    web = (WebView)rootView.findViewById(R.id.WebDonation);
	    web.loadUrl("https://my.actionagainsthunger.org/checkout/donation?eid=24902");
	    web.setWebViewClient(new WebViewClient());
		return rootView;
	}

}
