import java.util.Random;
import  java.util.Scanner;
public class sps {
    public static void main(String[] args) {

        String head = "this program is applicable for create a stone paper scissors";
        System.out.println(head.toCharArray());
        System.out.println("----------------------------------------------------------");

        System.out.println("WELCOME TO STONE PAPER SCISSORS GAME");

        System.out.println("PRRB PVT.LTD");

        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        System.out.println("input your name:---->");
        String name = sc.nextLine();

        System.out.println("follow instruction THEN PRESS 0:->stone , 1:->paper , 2:->scissors ");
        System.out.println("lets start:---->");
        System.out.println("player 1:-->");
        System.out.println(name.toUpperCase());
        System.out.println("input:---->");
        int a = sc.nextInt();
        System.out.println("player 2:-->");
        System.out.println("computer !!!!");
        System.out.println("input:---->");
        int b = r.nextInt(2);
        System.out.println(b);



        if (a == b && b == a) {
            System.out.println("match is draw");
            System.out.println("both are playing so well");
        }
        else if (a == 0 && b == 1) {
            System.out.println("player 2 :----> you win");
            System.out.println("player 1 :----> better lock next time");
        }
        else if (a == 1 && b == 0) {
            System.out.println("player 1 :----> you win");
            System.out.println("player 2 :----> better lock next time");
        }

        else if (a == 2 && b == 1) {
            System.out.println("player 1 :----> you win");
            System.out.println("player 2 :----> better lock next time");
        }
        else if (a == 1 && b == 2) {
            System.out.println("player 2 :----> you win");
            System.out.println("player 1 :----> better lock next time");
        }

        else if( a == 2 && b == 0){
            System.out.println("player 2 :----> you win");
            System.out.println("player 1 :----> better lock next time");
        }

        else if( a == 0 && b == 2) {
            System.out.println("player 1 :----> you win");
            System.out.println("player 2 :----> better lock next time");
        }
            else
            System.out.println("you input a invalid number !!!!!!!");
    }
}
