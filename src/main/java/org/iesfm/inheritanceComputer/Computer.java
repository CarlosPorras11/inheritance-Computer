package org.iesfm.inheritanceComputer;

import java.util.Objects;

public abstract class Computer {
    private int procVelocity;
    private int memoryInMb;
    private int motherboardModel;

    public Computer(int procVelocity, int memoryInMb, int motherboardModel) {
        this.procVelocity = procVelocity;
        this.memoryInMb = memoryInMb;
        this.motherboardModel = motherboardModel;
    }

    public int getProcVelocity() {
        return procVelocity;
    }

    public void setProcVelocity(int procVelocity) {
        this.procVelocity = procVelocity;
    }

    public int getMemoryInMb() {
        return memoryInMb;
    }

    public void setMemoryInMb(int memoryInMb) {
        this.memoryInMb = memoryInMb;
    }

    public int getMotherboardModel() {
        return motherboardModel;
    }

    public void setMotherboardModel(int motherboardModel) {
        this.motherboardModel = motherboardModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return procVelocity == computer.procVelocity && memoryInMb == computer.memoryInMb && motherboardModel == computer.motherboardModel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(procVelocity, memoryInMb, motherboardModel);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "procVelocity=" + procVelocity +
                ", memoryInMb=" + memoryInMb +
                ", motherboardModel=" + motherboardModel +
                '}';
    }
}
