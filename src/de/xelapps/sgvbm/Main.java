package de.xelapps.sgvbm;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class Main extends Base_activity {
	
	public Activity activity = this;	
	Fragment frag;
			
	public void onCreate (Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		FragmentManager frgman = getSupportFragmentManager();
		FragmentTransaction frgtrans = frgman.beginTransaction();
	
        frag  = new News_Fragment(); 
		
		frgtrans.replace(R.id.frag_view, frag, "NEWS");
		frgtrans.commit();
				
	}
		
}
