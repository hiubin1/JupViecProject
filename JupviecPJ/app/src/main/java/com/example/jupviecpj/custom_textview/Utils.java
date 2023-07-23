package com.example.jupviecpj.custom_textview;

import android.content.Context;
import android.graphics.Typeface;

public class Utils {

    private static Typeface OpenSansRegularTypeFace;

    public static Typeface getOpenSansRegularTypeFace(Context context) {
        if (OpenSansRegularTypeFace == null){
            OpenSansRegularTypeFace = Typeface.createFromAsset(context.getAssets(),"fonts/OpenSans-Regular.ttf");
        }
        return OpenSansRegularTypeFace;
    }
}
