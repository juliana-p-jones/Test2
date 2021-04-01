package assessment2;

import java.util.Comparator;

public class SpeedComparator implements Comparator<DriveAble>{

        @Override
        public int compare(DriveAble vehicle1, DriveAble vehicle2) {
            if (vehicle1.milesPerHour() > vehicle2.milesPerHour()) {
                return 1;
            }
            return -1;
        }
    }
