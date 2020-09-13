package HW8.dto;

import java.util.Comparator;

public class PupilLatentPotentialComparator implements Comparator<Pupil> {
    @Override
    public int compare(Pupil o1, Pupil o2) {
        if (o1.isLatentPotential() && !o2.isLatentPotential()) return 1;
        if (o1.isLatentPotential() && o2.isLatentPotential())
            return Integer.compare(o1.getBaseIQ(), o2.getBaseIQ());
        if (!o1.isLatentPotential() && !o2.isLatentPotential())
            return Integer.compare(o1.getBaseIQ(), o2.getBaseIQ());
        if (!o1.isLatentPotential() && o2.isLatentPotential()) return -1;
        return 0;
    }
}
