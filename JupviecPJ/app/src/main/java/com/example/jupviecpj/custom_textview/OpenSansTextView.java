package com.example.jupviecpj.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class OpenSansTextView extends AppCompatTextView {
    public OpenSansTextView(@NonNull Context context) {
        super(context);
        setFontTextView();
    }

    public OpenSansTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontTextView();
    }

    public OpenSansTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontTextView();
    }

    private void setFontTextView(){
        Typeface typeface = Utils.getOpenSansRegularTypeFace(getContext());
        setTypeface(typeface);
    }
}
