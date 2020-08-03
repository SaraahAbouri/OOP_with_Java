public class JumpRecord {
    private int JumpsAttempted;
    private int maximum;
    private double distance;
    private int fouljumps;
    private double jump1;
    private double jump2;
    private double jump3;
    private int maxjumps;


    JumpRecord() {
        JumpsAttempted = 0;
        maximum = 0;
        distance = 0;
        fouljumps = 0;
        maxjumps = 3;
        jump1 = 0;
        jump2 = 0;
        jump3 = 0;


    }

    void recordJump(double distance) {
        if (JumpsAttempted == 0) {

            jump1 = distance;
            JumpsAttempted++;
            maximum = 1;
        } else if (JumpsAttempted == 1) {

            jump2 = distance;
            JumpsAttempted++;
            if (jump2 > jump1) {
                maximum = 2;
            } else {
                maximum = 1;
            }

        } else if (JumpsAttempted == 2) {

            jump3 = distance;
            JumpsAttempted++;
            if (jump3 > jump2 && jump3 > jump1) {
                maximum = 3;
            } else if (jump2 >= jump3 && jump2 > jump1) {
                maximum = 2;
            } else if (jump1 >= jump2 && jump1 >= 3) {
                maximum = 1;
            }
        }

    }


    public void recordFoulJump() {
        if (JumpsAttempted == 3) {
            fouljumps = JumpsAttempted;
        }
    }

    int jumps() {
        if (JumpsAttempted == 0) {
            return JumpsAttempted;
        }
        if (JumpsAttempted == 1) {
            return JumpsAttempted;
        }
        if (JumpsAttempted == 2) {
            return JumpsAttempted;
        }
        if (JumpsAttempted == 3) {
            return JumpsAttempted;
        }
        return jumps();
    }


    boolean finished() {
        boolean x = jumps() == maxJumps();
        if (x == true) {
            return true;
        } else {
            return false;
        }
    }

    int maxJumps() {
        return maxjumps;
    }

    int foulJumps() {
        return fouljumps;
    }

    boolean isFoulJump(int n) {
        if (n > 3) {
            return false;
        } else {
            return true;
        }
    }

    double getJumpDistance(int n) {
        double m = 0;
        if (n > 0 && n <= 3) {
            String j = "j" + n;

            if (j.equals("j1")) {
                m = jump1;
            } else if (j.equals("j2")) {
                m = jump2;
            } else if (j.equals("j3")) {
                m = jump3;
            }
            return m;
        } else {
            return m;
        }

    }


    int getLongest() {
        int s = 0;
        if (JumpsAttempted > 0 && fouljumps < JumpsAttempted) {
            return maximum;
        } else {
            return s;
        }

    }
}


