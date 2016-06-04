package com.example.xyzreader.util;

import android.graphics.Typeface;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by snehaanandyeluguri on 6/3/16.
 */
public class SupportUtils {
    public static final String ROBOTO_MEDIUM="Roboto-Medium";
    public static final String ROBOTO_REGULAR="Roboto-Regular";
    public static final String ROBOTO_BOLD="Roboto-Bold";

    public static void setTypeFace(TextView textView,String font){
        Typeface typeface = Typeface.createFromAsset(textView.getContext().getAssets(), font+".ttf");
        textView.setTypeface(typeface);
    }
}
