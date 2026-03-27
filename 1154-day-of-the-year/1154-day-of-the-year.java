class Solution {
    public int dayOfYear(String date) {
        int day[] ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int yr= Integer.parseInt(date.substring(0,4));
        int mth=Integer.parseInt(date.substring(5,7));
        int d=Integer.parseInt(date.substring(8,10));
        if(leap(yr)){
            day[1]=29;
        }
        int td=0;
        for(int i=0;i<mth-1;i++){
            td+=day[i];
        }
        td+=d;
        return td;
    }
    public static boolean leap(int yr){
        return (yr%4==0 && yr%100!=0) || (yr %400==0);
    }
}