class Solution {
    public List<List<String>> groupAnagrams(String[] strs){

        Map<String,List<String>> ans = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            List<String> curr = new ArrayList<>();
            if(!ans.containsKey(key)){
                curr.add(strs[i]);
                ans.put(key , curr);
            }
            else ans.get(key).add(strs[i]);
            
        }
        return new ArrayList<>(ans.values());












        // public static boolean isAnagram(String s1, String s2) {
        //    char[] fre = new char[26];

        //    for(char ch : s1.toCharArray()) fre[ch-'a']++;
        //    for(char ch : s2.toCharArray()) fre[ch-'a']--;

        //    for(char n : fre){
        //     if(n != 0) return false;
        //    }
        //    return true;
        // }
        // public List<List<String>> groupAnagrams(String[] strs) {
        //     List<List<String>> ans = new ArrayList<>();
        //     Boolean[] Vis = new Boolean[strs.length];
        //     for(int i=0; i<Vis.length;i++){
        //         Vis[i]=false;
        //     }

        //     for(int i=0;i<strs.length;i++){
        //         if(Vis[i]!=true){
        //             List<String> curr = new ArrayList<>();
        //             curr.add(strs[i]);
        //             Vis[i]=true;
        //             for(int j=i+1;j<strs.length;j++){
        //                 if(Vis[j]!=true && isAnagram(strs[i],strs[j])){
        //                     curr.add(strs[j]);
        //                     Vis[j] = true;
        //                 }
        //             }
        //             ans.add(curr);
        //         }

        //     }
        //     return ans;
    }
}