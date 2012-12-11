package de.xelapps.sgvbm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class Base_activity extends FragmentActivity {
	
	private final String TAG = "Base_activity";
	Fragment news = new News_Fragment();
	Fragment berichte = new Berichte_Fragment();
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.news:
				swapFrag();
				Log.i(TAG, "News Clicked");
			return true;
			
			case R.id.berichte:
				Log.i(TAG, "Berichte Clicked");
			return true;
			
			default:
				return super.onOptionsItemSelected(item);
		}
	}
	
	public void swapFrag()
	{
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		
		Fragment current = fragmentManager.findFragmentByTag("NEWS");
		
		if (current.isVisible())
		{
			fragmentTransaction.replace(R.id.frag_view, berichte, "BERICHTE");
		} else {
			fragmentTransaction.replace(R.id.frag_view, news, "NEWS");
		}
		fragmentTransaction.addToBackStack(null);
		fragmentTransaction.commit();
		
	}
	
}
