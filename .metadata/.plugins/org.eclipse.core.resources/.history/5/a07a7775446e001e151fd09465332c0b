package com.demointerview.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.mapstruct.ap.shaded.freemarker.template.utility.DateUtil;

public class JsonUtil {

    private static final Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
            .create();

    public static Gson getGson() {
        return gson;
    }
}
