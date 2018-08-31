package io.mkulima.mkulima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class RiskProtectionDetailsActivity extends AppCompatActivity {
   WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risk_protection_details);
        mWebView=findViewById(R.id.webView);
        int position = getIntent().getIntExtra("pos",0);
        if (position==0)
            mWebView.loadUrl("file:///android_asset/disease_1.html");
        else if (position==1)
            mWebView.loadUrl("file:///android_asset/disease_2.html");
        else if (position==2)
            mWebView.loadUrl("file:///android_asset/disease_3.html");
        else if (position==3)
            mWebView.loadUrl("file:///android_asset/disease_4.html");
    }
}
