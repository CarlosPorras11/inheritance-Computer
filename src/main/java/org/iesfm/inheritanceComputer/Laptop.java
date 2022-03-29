package org.iesfm.inheritanceComputer;

import java.util.Objects;

public class Laptop extends Computer{
    private String chargerModel;

    public Laptop(int procVelocity, int memoryInMb, int motherboardModel, String chargerModel) {
        super(procVelocity, memoryInMb, motherboardModel);
        this.chargerModel = chargerModel;
    }

    public String getChargerModel() {
        return chargerModel;
    }

    public void setChargerModel(String chargerModel) {
        this.chargerModel = chargerModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(chargerModel, laptop.chargerModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), chargerModel);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "chargerModel='" + chargerModel + '\'' +
                '}';
    }
}