package com.BeandBe.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.BeandBe.ui.DetailA;
import com.BeandBe.ui.R;


public class Maps extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView =inflater.inflate(R.layout.frag_maps,container,false);
	
		GridView gridView = (GridView) rootView.findViewById(R.id.gridview);
		    gridView.setAdapter(new ImageAdapter(getActivity()));

		    gridView.setOnItemClickListener(new OnItemClickListener() {
		        public void onItemClick(AdapterView<?> parent, View v,
		                int position, long id) {
		          Intent intent = new Intent (getActivity(),DetailA.class);
		          intent.putExtra("data", id);
		         // Log.e("map", ""+id);
		          //startActivity(intent);
		        }
		    });
		
		return rootView;
	}

}
