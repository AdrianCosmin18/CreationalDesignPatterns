package org.example.prototype.firstExemple;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static void loadCache() {
        shapeMap.put("Circle1", new Circle(10, 10, 5));
        shapeMap.put("Circle2", new Circle(20, 20, 12));
    }

    public static Shape getShape(String shapeType) {
        Shape cachedShape = shapeMap.get(shapeType);
        return (Shape) cachedShape.clone();
    }
}
