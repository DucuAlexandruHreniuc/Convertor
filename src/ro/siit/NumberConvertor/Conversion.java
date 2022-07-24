package ro.siit.NumberConvertor;

import java.util.HashMap;
import java.util.Map;

public class Conversion {
    private static Map<String, Double> convertingMap = new HashMap<>();
    static{
        convertingMap.put("mm_cm", 0.1);
        convertingMap.put("mm_dm", 0.01);
        convertingMap.put("mm_m", 0.001);
        convertingMap.put("mm_km", 0.000001);

    }

    public static double convert(double value, String unitFrom, String unitTo){
        return value * convertingMap.get(unitFrom + "_" + unitTo);

    }

    public static void main(String[] args) {
        System.out.println(convert(1000.0, "mm", "km"));
    }
}
