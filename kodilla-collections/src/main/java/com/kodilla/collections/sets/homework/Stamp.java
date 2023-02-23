package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampDimensions;
    private String haveStamp;
    public Stamp (String stampName, String stampDimensions, String haveStamp) {
        this.stampName = stampName;
        this.stampDimensions = stampDimensions;
        this.haveStamp = haveStamp;
    }
    public String getStampName() {
        return stampName;
    }
    public String getStampDimensions() {
        return stampDimensions;
    }
    public String getHaveStamp() {
        return haveStamp;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampName, stamp.stampName) && Objects.equals(stampDimensions, stamp.stampDimensions) && Objects.equals(haveStamp, stamp.haveStamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimensions, haveStamp);
    }
    @Override
    public String toString() {
        return "Stamp{" +
                "StampName='" + stampName + '\'' +
                ", StampDimensions='" + stampDimensions + '\'' +
                ", HaveStamp='" + haveStamp + '\'' +
                '}';
    }
}
