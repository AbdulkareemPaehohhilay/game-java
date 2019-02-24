import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class game{
    public static void main(String args[]){
        Player Py = new Player();             //call class Player
        Scanner Sc = new Scanner(System.in);
        System.out.println("....Wellcome.... ");
        System.out.print("Enter Name: ");
        Py.Name = Sc.nextLine();                //input save Name in Player
        System.out.println("Your name is " + Py.Name);   //show Name in Player
        System.out.println("..................");
        System.out.println("Select your class: ");
        SelectClass.SelectCl();  //show total class 9 NameC in Player
        int x = Sc.nextInt();  //input number save method in Player
        System.out.println("..................");
        System.out.println("Class your = " + Py.xClass(x));   //show class in metod Player
        
        System.out.println("....INGAME....");
        Py.selectmode();  // selecmode 4 mode 1. Profile 2.Bag 3.play game 4.end game
        
        
        
 
    }
   
      
    }
