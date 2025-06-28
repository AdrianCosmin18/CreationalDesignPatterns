package org.example.prototype.firstExemple;

public abstract class Shape implements Prototype {
    protected String type;
    private int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed!", e);
        }
    }

    public String getType() {
        return type;
    }
}
