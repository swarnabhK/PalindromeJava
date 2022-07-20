package palindrome_java;

class palindrome{
  public static boolean isPalindrome(String s){
    int left=0;
    int right = s.length()-1;
    while(left<right){
      if(s.charAt(left)!=s.charAt(right)){
        return false;
      }
      left+=1;
      right-=1;
    }
    return true;
  } 
  public static void main(String[] args) {
    System.out.println(isPalindrome("racecar"));
    System.out.println(isPalindrome("abba"));
    System.out.println(isPalindrome("aaaaaaa"));
    System.out.println(isPalindrome("aaaabaa"));
  }

}