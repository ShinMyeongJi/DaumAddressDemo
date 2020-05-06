package com.techtown.daumaddressdemo

import android.net.http.SslError
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient

class SslWebViewConnect : WebViewClient() {

    override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
        handler?.proceed()
    }

    override fun shouldOverrideUrlLoading(view : WebView, url : String): Boolean {
        view.loadUrl(url)
        return false
    }

}
