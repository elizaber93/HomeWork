package HW8.dto;

import java.util.Comparator;

public class PupilBehaviorComparator implements Comparator<Pupil> {
    @Override
    public int compare(Pupil o1, Pupil o2) {
        return Double.compare(o1.getBehavior(),o2.getBehavior());
    }
}
