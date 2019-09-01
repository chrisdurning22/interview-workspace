public class HashMaps {

	static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
            // i = substringsize
        int i = -1;
        int j = 0;
        int k = 1;
        while(!(i == 1 && j == s.length())) {

            i++;
            j++;

            if(j > s.length()) {
                k++;
                j = k;
                i = 0;
            }

            char [] arr = s.substring(i, j).toCharArray();
            Arrays.sort(arr);

            if(map.get(new String(arr)) == null) {
                map.put(new String(arr), 1);
            } 
            else {
                int amount = map.get(new String(arr));
                amount++;
                map.put(new String(arr), amount);
            }

        }

        int pairs = 0;

        for (String name: map.keySet()){

            String key =name.toString();
            if(Integer.parseInt(map.get(name).toString()) > 1) {
                int n = Integer.parseInt(map.get(name).toString());
                pairs += n*(n-1)/2;
            }  
        } 

        return pairs;
    }
    
	static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < magazine.length; i++) {
            if(map.get(magazine[i]) != null) {
                int amount = map.get(magazine[i]);
                amount++;
                map.put(magazine[i], amount);
            } 
            else {
                map.put(magazine[i], 1);
            }
        }

        for(int i = 0; i < note.length; i++) {
            if(map.get(note[i]) == null) {
                System.out.println("No");
                return;
            } 
            else {
                int amount = map.get(note[i]);
                amount--;

                if(amount == 0) {
                    map.remove(note[i]);
                } 
                else {
                    map.put(note[i], amount);
                }
            }
        }
        System.out.println("Yes");

    }

    static String twoStrings(String s1, String s2) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), s1.charAt(i));
        }

        for(int i = 0; i < s2.length(); i++) {
            if(map.get(s2.charAt(i)) != null) {
                return "YES";
            }
        }

        return "NO";
    }
}