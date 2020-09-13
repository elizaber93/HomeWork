package HW8.dto;

import java.util.Comparator;

public class PupilIQComparator implements Comparator<Pupil> {
    @Override
    public int compare(Pupil o1, Pupil o2) {
        return Integer.compare(o1.getBaseIQ(), o2.getBaseIQ());
    }
}
