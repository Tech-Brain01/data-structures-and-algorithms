package FUNCTION;

public class binToDeci {
    public static void binToDeci(int BinNum){
           int Mynum = BinNum;
           int pow = 0;
           int deciNum = 0;
        while(BinNum > 0){
           int lastDigit = BinNum % 10;
           deciNum = deciNum + (lastDigit * (int)Math.pow(2, pow)) ;
            pow ++;
           BinNum = BinNum/10;
           
        }
        System.out.println("the decimal value of " + Mynum +" = " + deciNum);
    }
    public static void main(String[] args){
        binToDeci(101101);
