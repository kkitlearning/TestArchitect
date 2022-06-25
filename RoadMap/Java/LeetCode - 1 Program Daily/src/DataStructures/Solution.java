class Solution {
    public static int lengthOfLastWord(String s) {
        int count=0;
        int n = s.length();

        char[] ch=s.toCharArray();

        int i=0;

        while(i<n){
            if(ch[i] !=' '){
                count++;
                i++;
            }else{
                while(i<n && ch[i] == ' '){
                    i++;
                }
                if(i==n) {
                    return count;
                }else{
                    count=0;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        System.out.println("The last word is "+lengthOfLastWord("   fly me   to   the moon  "));
    }
}