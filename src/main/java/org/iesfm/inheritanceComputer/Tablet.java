package org.iesfm.inheritanceComputer;

import java.util.Objects;

public class Tablet extends Computer {
    private int inches;

    public Tablet(int procVelocity, int memoryInMb, int motherboardModel, int inches) {
        super(procVelocity, memoryInMb, motherboardModel);
        this.inches = inches;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tablet tablet = (Tablet) o;
        return inches == tablet.inches;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), inches);
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "inches=" + inches +
                '}';
    }
}
