class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<Character, Integer>[] aryMap = new HashMap[strs.length];
    for (int i=0; i<strs.length; i++) {
      aryMap[i] = new HashMap<>();
    }

    for (int i=0; i<strs.length; i++) {
      String str = strs[i];
      HashMap<Character, Integer> map = aryMap[i];

      for (int j=0; j<str.length(); j++) {
        map.put(str.charAt(j), (map.getOrDefault(str.charAt(j), 0) + 1));
      }
    }

    List<List<String>> ansList = new ArrayList<>();
    boolean[] visited = new boolean[aryMap.length];

    for (int i=0; i<aryMap.length; i++) {

      if (visited[i]) continue;

      List<String> nestedAnsList= new ArrayList<>();
      HashMap<Character, Integer> map1 = aryMap[i];

      for (int j=i+1; j<aryMap.length; j++) {
        if (!visited[j] && map1.equals(aryMap[j])) {
          nestedAnsList.add(strs[j]);
          visited[j] = true;
        }
      }

      nestedAnsList.add(strs[i]);
      visited[i] = true;
      ansList.add(nestedAnsList);
    }

    return ansList;
  }
}