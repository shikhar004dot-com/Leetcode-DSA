class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int h=n/2;
        int sl=0;
        int sr=0;
        int ql=0;
        int qr=0;
        for(int i=0;i<h;i++){
            char c=num.charAt(i);
            if(c=='?'){
                ql++;
            }
            else{
                sl+=c-'0';
            }
        }
        for(int i=h;i<n;i++){
            char c=num.charAt(i);
            if(c=='?'){
                qr++;
            }
            else{
                sr+=c-'0';
            }
        }
        if((ql+qr)%2!=0){
            return true;
        }
        int diff=sl-sr;
        int qdiff=qr-ql;
        if(diff*2!=qdiff*9){
            return true;
        }
        else{
            return false;
        }

    }
}