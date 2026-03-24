class Solution {
    public String ReverseVowelsInWord(String s) {
        char [] arr=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if("aeiouAEIOU".indexOf(arr[start])==-1){
                start++;
            }
            else if("aeiouAEIOU".indexOf(arr[end])==-1){
                end--;
            }
            else{
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}
  