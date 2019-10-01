package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private static Map<String,String> dictionary =new HashMap<>();
    static {
        dictionary.put("dog","con cho");
        dictionary.put("cat","con meo");
        dictionary.put("dragon","con rong");
        dictionary.put("chicken","con ga");
    }

    public String getVietnamese(String english){
        return dictionary.get(english);
    }
}
