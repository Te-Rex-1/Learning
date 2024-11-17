package Output;

public class Q1 {
    public int fn1(int a,int b){
        int num=1;
        for (int i = 1; i <=a &&i<=b; i++) {
            if ((a%i==0)&&(b%i==0))
            {
                num=i;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Q1 ob=new Q1();
        System.out.println(ob.fn1(12,8));
    }
}
