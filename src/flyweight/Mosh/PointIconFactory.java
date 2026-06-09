package flyweight.Mosh;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType,PointIcon>  pointIconMap= new HashMap<>();  //factory class on flyweight always need
                                                                      //a HashMap field!

    public PointIcon getPointIcon(PointType type){
        if (!pointIconMap.containsKey(type)){
            PointIcon pointIcon = new PointIcon(type, null);            //if we have not loaded the icon
            pointIconMap.put(type,pointIcon);                                //we load it here
        }                                                                    //in real app we load it from DB (we passed null)
        return pointIconMap.get(type);
    }
}
