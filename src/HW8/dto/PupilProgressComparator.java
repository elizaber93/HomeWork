package HW8.dto;

import java.util.Comparator;

public class PupilProgressComparator implements Comparator<Pupil> {
    @Override
    public int compare(Pupil o1, Pupil o2) {
        return Double.compare(o1.getProgress(),o2.getProgress());
    }
}
