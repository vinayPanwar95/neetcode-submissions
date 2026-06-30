class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> freqMap = new HashMap<>();
        List<List<String>> result = new ArrayList();

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

          freqMap.computeIfAbsent(sortedStr, k-> new ArrayList<>()).add(str);

            
        }

        return new ArrayList<>(freqMap.values());
        
    }
}
