package HW8.dto;

import java.util.Comparator;

public class PupilLatinessComparator implements Comparator<Pupil> {
    @Override
    public int compare(Pupil o1, Pupil o2) {
        return (o1.isLateness() == o2.isLateness()) ? 0 : -1;
    }
}
