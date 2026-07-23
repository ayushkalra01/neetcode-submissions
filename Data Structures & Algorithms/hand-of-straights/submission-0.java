class Solution {
    public boolean isNStraightHand(int[] hand, int g) {

        if (hand.length % g != 0)
            return false;

        TreeMap<Integer, Integer> mp = new TreeMap<>();

        for (int x : hand)
            mp.put(x, mp.getOrDefault(x, 0) + 1);

        while (!mp.isEmpty()) {

            int start = mp.firstKey();

            for (int i = start; i < start + g; i++) {

                if (!mp.containsKey(i))
                    return false;

                if (mp.get(i) == 1)
                    mp.remove(i);
                else
                    mp.put(i, mp.get(i) - 1);
            }
        }

        return true;
    }
}