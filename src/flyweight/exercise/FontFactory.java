package flyweight.exercise;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    Map<String,FontFamily> fontMaps = new HashMap<>();

    public FontFamily getFont(String name){
        if(!fontMaps.containsKey(name)){
            FontFamily fontFamily = new FontFamily(name);
            fontMaps.put(name,fontFamily);
        }

        return fontMaps.get(name);
    }

    public FontFamily getFont(){            //default font
        String name = "Times New Roman";
        if(!fontMaps.containsKey(name)){
            FontFamily fontFamily = new FontFamily(name);
            fontMaps.put(name,fontFamily);
        }

        return fontMaps.get(name);
    }
}
