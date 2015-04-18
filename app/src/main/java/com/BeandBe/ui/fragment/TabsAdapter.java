package com.BeandBe.ui.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {
  
	public static
	String[] tabsnames ={
		"Forum",
		"MapS",
		"Data",
		"Dons"};
	
	public TabsAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		switch(arg0){
		case 0:
			return new Forum();
		case 1:
			return new Maps();
		case 2:
			return new Datas();
		case 3:
			return new Dons();
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	public String[] getTabnames() {
	      return tabsnames;
	}
	public static void setTabnames(String [] tabnames) {
		TabsAdapter.tabsnames = tabnames;
	}

}
