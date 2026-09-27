class Solution {

    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int j = 0; j < t.length(); j++) {

            char ch2 = t.charAt(j);

            if(map.containsKey(ch2)) {

                map.put(ch2, map.getOrDefault(ch2, 0) - 1);

            } else {
                return false;
            }
        }

        for(Character ch : map.keySet()) {

            if(map.get(ch) != 0) {
                return false;
            }
        }

        return true;
    }
}