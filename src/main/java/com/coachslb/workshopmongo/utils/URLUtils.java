package com.coachslb.workshopmongo.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class URLUtils {
    public static String decodeParam(String text) {
            return URLDecoder.decode(text, StandardCharsets.UTF_8);
    }
}
