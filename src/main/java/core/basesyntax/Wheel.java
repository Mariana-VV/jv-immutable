package core.basesyntax;

import java.util.Objects;

public class Wheel implements Cloneable {
    private int radius;

    public Wheel(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Wheel)) {
            return false;
        }
        Wheel wheel = (Wheel) o;
        return getRadius() == wheel.getRadius();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }

    @Override
    public Wheel clone() {
        try {
            Wheel wheelCopy = (Wheel) super.clone();
            return wheelCopy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "Wheel{"
                + "radius=" + radius
                + '}';
    }
}
