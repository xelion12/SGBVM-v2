package de.xelapps.sgvbm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class News_Fragment extends Fragment 
{
	View view;
	private WebView webview;
	private WebViewClient webview_client = new WebViewClient() {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}		
	};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		
		view = inflater.inflate(R.layout.news, container, false);
		
		webview = (WebView) view.findViewById(R.id.wv_news);
		
		webview.getSettings().setJavaScriptEnabled(true);
		webview.getSettings().setDomStorageEnabled(true);
		
		webview.loadUrl("http://www.sgbvm.de/app/news/news.php");
		
		webview.setWebViewClient(webview_client);

		return view;
	
	}
}
