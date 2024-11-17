

import java.util.Scanner;
/*

    ******************       Stone .... Paper ...... Scissor ****************
                           GAME


Developer :- Abhinav
 */


public class stone{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome To Stone Paper Scissor Game");
        System.out.println("How many Rounds you want ???");
        int comp=0,user=0;
        int round=in.nextInt();
        String con="yes";
        while(con.equals("yes")){
            for(int i=1;i<=round;i++)
            {
                System.out.println("Enter 1 for Stone .....    2 for Paper ......   3 for Scissor");
                int choice=in.nextInt();//Accept choice form user
                int n=3,r=(int)(Math.random()*n)+1;//Computer choice
                if(choice==1)//when user choose Stone\
                {
                    if(r==1)//when computer choose stone
                    {
                        System.out.println("You Choose \t"+"Computer Choose ");
                        System.out.println("Stone \t"+"   Stone ");
                        System.out.println("Tie");

                    }
                    if(r==2)//when computer choose  Paper  *** user lose
                    {System.out.println("You Choose \t"+"Computer Choose ");
                        System.out.println("Stone \t"+"   Paper ");
                        System.out.println("You lose  ....  Computer win");
                        comp++;

                    }
                    if(r==3)//when computer choose Scissor  **** User win
                    {
                        System.out.println("You Choose \t"+"Computer Choose ");
                        System.out.println("Stone \t"+"   Scissor ");
                        System.out.println("You Win  Computer Lose ");
                        user++;
                    }



                }
                if(choice==2)// when user choice Paper
                {
                    if(r==1) // when computer choose stone ***** User win
                    {
                        System.out.println("You Choose \t"+"Computer Choose ");
                        System.out.println("Paper  \t"+"   Stone ");
                        System.out.println("You win ..... Computer lose ");
                        user++;
                    }
                    if(r==2)//when computer choose Paper
                    {
                        System.out.println("You Choose \t"+"Computer Choose ");
                        System.out.println("Paper  \t"+"   Paper  ");
                        System.out.println(" Tie  ");

                    }
                    if(r==3)// when computer choose Scissor ***** user lose computer win
                    {
                        System.out.println("You Choose \t"+"Computer Choose ");
                        System.out.println("Paper  \t"+"   Scissor ");
                        System.out.println("You lose ..... Computer win ");
                        comp++;
                    }

                }
                if(choice==3)// when user choose Scissor
                {
                    if(r==1)// when Computer choose Stone ***** user lose Computer win
                    {


                        System.out.println("You Choose \t"+"Computer Choose ");
                        System.out.println("Scissor  \t"+"   Stone ");
                        System.out.println("You Lose ..... Computer Win ");
                        comp++;
                    }
                    if(r==2)// when Computer choose Paper ****** User Win Computer lose
                    {

                        System.out.println("You Choose \t"+"Computer Choose ");
                        System.out.println("Scissor  \t"+"   Paper ");
                        System.out.println("You Win ..... Computer Lose ");
                        user++;
                    }
                    if(r==3)// when computer choose Scissor
                    {
                        System.out.println("You Choose \t"+"Computer Choose ");
                        System.out.println("Scissor  \t"+"   Scissor ");
                        System.out.println("Tie ");
                    }

                }
            }//loop
            if(user>comp)
            {
                System.out.println("🎆🎆🎆  Congratulations  You Win 👍👍👍");
                System.out.println("Score");
                System.out.println("Computer :"+comp+"\n"+"User :"+user);
            }
            else{
                System.out.println("☹☹☹☹ You lose ");
                System.out.println("Score");
                System.out.println("Computer :"+comp+"\n"+"User :"+user);

            }
            if(user==comp)
            {
                System.out.println("Game tie ");
                System.out.println("Score");
                System.out.println("Computer :"+comp+"\n"+"User :"+user);

            }

            System.out.println("###  Do you want to continue ..... (yes or no)");//asking form user for contnue
            con="";
            con=in.next();

        }
    }
}
