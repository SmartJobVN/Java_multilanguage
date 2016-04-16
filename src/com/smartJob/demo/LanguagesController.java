package com.smartJob.demo;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

// Get multi-language string.
public class LanguagesController {

    private final Map supportedLanguages;
    private final ResourceBundle translation;

    public LanguagesController(String language) {
        supportedLanguages = new HashMap();
        supportedLanguages.put("English", Locale.ENGLISH);
        supportedLanguages.put("Vietnamese", new Locale("vi", "VN"));
        translation = ResourceBundle.getBundle("language", (Locale) supportedLanguages.get(language));
    }

    public String getWord(String keyword) {
        return translation.getString(keyword);
    }

    public static String getText(String key) {
        String result = "";
        if ("en".equals(System.getProperty("user.language"))) {
            LanguagesController langController_en = new LanguagesController("English");
            result = langController_en.getWord(key);
        }
        if ("vi".equals(System.getProperty("user.language"))) {
            LanguagesController langController_vi = new LanguagesController("Vietnamese");
            result = langController_vi.getWord(key);
        }
        return result;
    }

}
