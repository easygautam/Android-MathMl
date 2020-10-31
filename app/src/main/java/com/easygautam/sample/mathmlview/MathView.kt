package com.easygautam.sample.mathmlview

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient


private const val ASSETS_MATH_ML = "file:///android_asset/math-ml"
private const val MATH_ML_HTML = "$ASSETS_MATH_ML/math-ml.html"

class MathView : WebView {

    private var onReady: (() -> Unit)? = null

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context)
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(context)
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return false
    }

    override fun setTouchscreenBlocksFocus(touchscreenBlocksFocus: Boolean) {
        super.setTouchscreenBlocksFocus(true)
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun init(context: Context) {

        settings.apply {
            javaScriptEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true
            builtInZoomControls = false
        }

        webViewClient = mWebViewClient
        loadUrl(MATH_ML_HTML)

    }

    //    @JavascriptInterface
    fun setHtmlMathText(text: String) {
        Log.d("MathView", "setMathText('$text')")
        loadUrl("javascript:setMathText('$text')");
    }

    private val mWebViewClient = object : WebViewClient() {
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            onReady?.invoke()
        }
    }

    fun ready(onReady: () -> Unit) {
        this.onReady = onReady
    }

}