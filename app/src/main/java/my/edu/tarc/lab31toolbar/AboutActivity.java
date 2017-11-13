package my.edu.tarc.lab31toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    private WebView webViewAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //webViewAbout = (WebView)findViewById(R.id.webViewAbout);

        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://google.com");



    }
}
