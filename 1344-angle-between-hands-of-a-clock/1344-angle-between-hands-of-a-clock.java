class Solution {
    public double angleClock(int hour, int minutes) {
        double theta= (double)hour*(30)-(double)5.5*(minutes);
        if(Math.abs(theta)>180){
            return 360-Math.abs(theta);
        }
        return Math.abs(theta);
    }
}