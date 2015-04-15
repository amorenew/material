package com.rey.material.util;

import android.content.Context;
import android.content.res.Configuration;

import java.util.Locale;

/**
 * Created by mkhalifa on 4/15/2015.
 */
public class LocaleUtil {
    private static Locale locale = Locale.getDefault();

    public static Locale getLocale() {
        return locale;
    }

    public static void setLocale(Locale locale, Context context) {
        LocaleUtil.locale = locale;

        Configuration config = new Configuration();
        config.locale = locale;

        context.getResources().updateConfiguration(config,
                context.getResources().getDisplayMetrics());
        Locale.setDefault(locale);


    }
}
