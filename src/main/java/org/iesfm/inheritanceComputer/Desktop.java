package org.iesfm.inheritanceComputer;

import java.util.Objects;

public class Desktop extends Computer {
    private String boxType;

    public Desktop(int procVelocity, int memoryInMb, int motherboardModel, String boxType) {
        super(procVelocity, memoryInMb, motherboardModel);
        this.boxType = boxType;
    }

    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Desktop desktop = (Desktop) o;
        return Objects.equals(boxType, desktop.boxType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), boxType);
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "boxType='" + boxType + '\'' +
                '}';
    }
}
