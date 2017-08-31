package com.jia.mddemo.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.jia.mddemo.R;

/**
 * 详情界面
 */
public class DetailActivity extends AppCompatActivity {

    private WebView webView;

    private ProgressBar progressbar;

    private Toolbar toolbar;

    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("");
        toolbar.setNavigationIcon(R.mipmap.ic_arrow_back);


        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        webView= (WebView) findViewById(R.id.webview);
        progressbar= (ProgressBar) findViewById(R.id.progressbar);

        configWebView();

        if(getIntent()!=null){
            url=getIntent().getStringExtra("url");
        }
        webView.loadUrl(url);
    }

    /**
     * 设置WebView
     */
    private void configWebView() {
        WebSettings wSet = webView.getSettings();
        //设置是否支持JS交互，不设置页面显示不出来
        wSet.setJavaScriptEnabled(true);
        //设置适应屏幕
        wSet.setUseWideViewPort(true);
        wSet.setLoadWithOverviewMode(true);
        //支持缩放
        wSet.setSupportZoom(true);
        //设置数据格式，这样能在一定程度上节省资源
        wSet.setDefaultTextEncodingName("UTF-8");
        wSet.setRenderPriority(WebSettings.RenderPriority.HIGH);
        //隐藏原生缩放控件
        wSet.setDisplayZoomControls(false);
        wSet.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);

        //设置 缓存模式
        wSet.setCacheMode(WebSettings.LOAD_DEFAULT);
        // 开启 DOM storage API 功能
        wSet.setDomStorageEnabled(true);
        //开启 database storage API 功能
        wSet.setDatabaseEnabled(true);
        String cacheDirPath = getFilesDir().getAbsolutePath();

        //设置数据库缓存路径
        wSet.setDatabasePath(cacheDirPath);
        //设置  Application Caches 缓存目录
        wSet.setAppCachePath(cacheDirPath);
        //开启 Application Caches 功能
        wSet.setAppCacheEnabled(true);

        wSet.setBuiltInZoomControls(false);


        wSet.setAllowContentAccess(true);

        webView.setWebChromeClient(new WebChromeClient() {

            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                return super.onJsAlert(view, url, message, result);
            }

            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                if (!TextUtils.isEmpty(title)) {
                    toolbar.setTitle(title);
                }
            }

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                progressbar.setProgress(newProgress);
                if (100 == newProgress) {
                    progressbar.setVisibility(View.GONE);
                }
            }
        });

        webView.setWebViewClient(new WebViewClient() {



            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressbar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressbar.setVisibility(View.GONE);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                webView.loadUrl(url);
                return true;
            }
        });
    }
}
