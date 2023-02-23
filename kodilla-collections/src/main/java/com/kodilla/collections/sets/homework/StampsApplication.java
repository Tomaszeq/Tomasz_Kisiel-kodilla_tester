package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Lato", "43mmX31.25mm","yes"));
        stamps.add(new Stamp("Lato", "43mmX31.25mm","yes"));
        stamps.add(new Stamp("Jesień", "43mmX31.25mm", "yes"));
        stamps.add(new Stamp("Jesień", "43mmX31.25mm", "no"));
        stamps.add(new Stamp("Zima", "43mmX31.25mm", "no"));
        stamps.add(new Stamp("Zima", "43mmX31.25mm", "yes"));
        stamps.add(new Stamp("Wiosna", "43mmX31.25mm", "no"));
        stamps.add(new Stamp("Wiosna", "43mmX31.25mm", "yes"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
