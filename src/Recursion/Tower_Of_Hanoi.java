package Recursion;

public class Tower_Of_Hanoi {
   void move(int n,String src,String helper,String Dest,int count){

       if (n==1)
       {
           System.out.println("Move Disc form "+n+" From "+src+" To "+Dest+"count "+count);
       }
       else {
           count++;
           move(n-1,src,Dest,helper,count);
           System.out.println("Move Disc from "+n+" from "+src+" to "+Dest+"count"+count);
           move(n-1,helper,src ,Dest,count);
       }
   }

    public static void main(String[] args) {
        Tower_Of_Hanoi ob=new Tower_Of_Hanoi();

        ob.move(500,"S","H","D",0);
    }
}
