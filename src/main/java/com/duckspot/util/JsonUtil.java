package com.duckspot.util;

import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * @author peter
 */
public class JsonUtil {

    /**
     * Read JSONObject from a URL.
     * 
     * @param url
     * @return
     * @throws IOException 
     */
    static JSONObject getJSON( URL url ) throws IOException {
        return new JSONObject(new JSONTokener(url.openStream()));
    }
}
