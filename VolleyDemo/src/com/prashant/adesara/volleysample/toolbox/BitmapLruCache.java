package com.prashant.adesara.volleysample.toolbox;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

import com.android.volley.toolbox.ImageLoader.ImageCache;
public class BitmapLruCache extends LruCache<String,Bitmap> implements ImageCache {
    public BitmapLruCache(int maxSize) {
        super(maxSize);
        //or setLimit(Runtime.getRuntime().maxMemory()/4);
    }
    
    /*@Override
    protected int sizeOf(String key, Bitmap value) {
        return value.getRowBytes() * value.getHeight();
    }*/
 
    @Override
    public Bitmap getBitmap(String url) {
    	System.out.println("######## BitmapLruCache GET ######## "+url);
        return (Bitmap)get(url);
    }
 
    @Override
    public void putBitmap(String url, Bitmap bitmap) {
    	System.out.println("######## BitmapLruCache PUT ######## "+url);
        put(url, bitmap);
    }
}
