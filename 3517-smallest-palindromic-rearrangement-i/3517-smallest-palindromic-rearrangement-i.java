class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        char arr[]= new char[s.length()/2];
        for(int i=0;i<(s.length()/2);i++){
            arr[i]=s.charAt(i);
        }
        Arrays.sort(arr);
        char arr2[]=new char[s.length()/2];
        int j=0;
        for(int i=s.length()-arr2.length;i<s.length();i++){
            arr2[j]=s.charAt(i);
            j++;
        }
        Arrays.sort(arr2);
        int x=0;
        int y=arr2.length-1;
        while(x<=y){
            char dn=arr2[x];
            arr2[x]=arr2[y];
            arr2[y]=dn;
            x++;
            y--;
        }
        StringBuilder sb=new StringBuilder();
        for(int z=0;z<arr.length;z++){
            sb.append(arr[z]);
        }
        if(s.length()%2==1){
            sb.append(s.charAt(s.length()/2));
        }
        for(int z=0;z<arr2.length;z++){
            sb.append(arr2[z]);
        }
        return new String(sb);
    }
}