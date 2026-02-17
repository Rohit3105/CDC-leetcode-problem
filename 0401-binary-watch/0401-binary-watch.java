class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> res = new ArrayList<>();
        // Iterate through all possible hours (0-11)
        for (int h = 0; h < 12; h++) {
            // Iterate through all possible minutes (0-59)
            for (int m = 0; m < 60; m++) {
                // Total LEDs on = bits in hour + bits in minute
                int t = Integer.bitCount(h) + Integer.bitCount(m);
                
                if (t == turnedOn) {
                    // Format minutes with leading zero if necessary
                    if (m < 10) {
                        res.add(h + ":0" + m);
                    } else {
                        res.add(h + ":" + m);
                    }
                }
            }
        }
        return res;
    }
}