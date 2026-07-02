class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String s1[]= num1.split("\\+|i");  // [1,1]
        String s2[]=num2.split("\\+|i"); //[1,1];

        int rs1=Integer.parseInt(s1[0]);
        int imgs1=Integer.parseInt(s1[1]);

        int rs2=Integer.parseInt(s2[0]);
        int imgs2=Integer.parseInt(s2[1]);

        int real=rs1*rs2-imgs1*imgs2;
        int img=rs2*imgs1+imgs2*rs1;

        return real+ "+" +img+ "i";
    }
}