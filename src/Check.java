public class Check {
    void mymethod(int count){
        if(count==0)
            System.out.println(" ");
        else {
            System.out.println("hello"+count);
            mymethod(--count);
            System.out.println(" "+count);
        }
    }

    public static void main(String[] args) {
        Check ob=new Check();
        ob.mymethod(3);
    }
}
