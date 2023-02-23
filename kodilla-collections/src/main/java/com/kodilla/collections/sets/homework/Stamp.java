package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Objects;

public class Stamp {
    private String StampName;
    private String StampDimensions;
    private String HaveStamp;
    public Stamp (String stampName, String stampDimensions, String haveStamp) {
        this.StampName = stampName;
        this.StampDimensions = stampDimensions;
        this.HaveStamp = haveStamp;
    }
    public String getStampName() {
        return StampName;
    }
    public String getStampDimensions() {
        return StampDimensions;
    }
    public String getHaveStamp() {
        return HaveStamp;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(StampName, stamp.StampName) && Objects.equals(StampDimensions, stamp.StampDimensions) && Objects.equals(HaveStamp, stamp.HaveStamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(StampName, StampDimensions, HaveStamp);
    }
    @Override
    public String toString() {
        return "Stamp{" +
                "StampName='" + StampName + '\'' +
                ", StampDimensions='" + StampDimensions + '\'' +
                ", HaveStamp='" + HaveStamp + '\'' +
                '}';
    }
}
