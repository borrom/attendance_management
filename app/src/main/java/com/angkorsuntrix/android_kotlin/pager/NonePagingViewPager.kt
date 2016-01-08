package com.angkorsuntrix.android_kotlin.pager

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

/**
 * Created by borrom on 1/8/16.
 */
class NonePagingViewPager : ViewPager {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    override fun onInterceptTouchEvent(ev: MotionEvent) = false;

    override fun onTouchEvent(ev: MotionEvent) = false;
}
