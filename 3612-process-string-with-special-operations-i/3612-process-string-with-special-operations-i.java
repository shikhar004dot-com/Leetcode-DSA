class Solution {
    public String processStr(String s) {
        ArrayList<Character> ll=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                ll.add(ch);
            }
            else if(ch=='*'){
                star(ll);

            }
            else if(ch=='#'){
                hash(ll);

            }
            else if(ch=='%'){
                modulo(ll);
            }
        }   
        char[] arr = new char[ll.size()];
        for(int i = 0; i < ll.size(); i++){
            arr[i] = ll.get(i);
        }
        return new String(arr);
    }
    public static void star(ArrayList<Character> ll){
        if(!ll.isEmpty()){
            ll.remove(ll.size()-1);
        }
    }
    public static void hash(ArrayList<Character> ll){
        int n=ll.size();
       for(int i=0;i<n;i++){
            ll.add(ll.get(i));
        }
    }
    public static void modulo(ArrayList<Character> ll){
       Collections.reverse(ll);
    }
}