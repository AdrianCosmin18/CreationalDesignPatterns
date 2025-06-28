package org.example.prototype.firstExemple;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        // Inițializăm cache-ul cu prototipuri
        ShapeCache.loadCache();

        // Creăm copii ale prototipurilor
        Shape clonedShape1 = ShapeCache.getShape("Circle1");
        System.out.println("Shape: " + clonedShape1.getType());
        clonedShape1.draw();

        Shape clonedShape2 = ShapeCache.getShape("Circle2");
        System.out.println("Shape: " + clonedShape2.getType());
        clonedShape2.draw();
    }
}
