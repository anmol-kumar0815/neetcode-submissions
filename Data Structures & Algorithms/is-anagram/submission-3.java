class Solution {
  public boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) return false;

    int[] frequencyArray = new int[26];
    Arrays.fill(frequencyArray, 0);

    for(int i=0; i<str1.length(); i++) {
      frequencyArray[(int)(str1.charAt(i) - 'a')]++;
      frequencyArray[(int)(str2.charAt(i) - 'a')]--;
    }

    for(int i=0; i<26; i++) {
      if(frequencyArray[i] != 0) {
        return false;
      }
    }

    return true;
  }
}
