class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<=numRows||numRows==1) return s;
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuilder();
        }
        int curr=0;
        boolean flag=false;
        for(char c:s.toCharArray()){
            sb[curr].append(c);
        
        if(curr==0||curr==numRows-1){
            flag=!flag;
        }
        curr+=flag?1:-1;
        }
      
    StringBuilder result=new StringBuilder();
    for(StringBuilder row:sb){
        result.append(row);
    }
    return result.toString();
}
}
 