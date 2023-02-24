package com.johnbosco.myapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private val webView: WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Giving a tittle
        title = "intellectsoft"
        val webView = findViewById<WebView>(R.id.Web)
        webView.webViewClient = WebViewClient()
        //webViewclient is the object responsible for most the actions inside
        val webSettings = webView.settings
        webSettings.javaScriptEnabled
        webView.loadUrl("https://www.intellectsoft.net")
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()) {
            webView.goBack()
            //conGoBack()
            //this method specifies the WebView has a back history item.
        } else {
            super.onBackPressed()
        }
    }

    }