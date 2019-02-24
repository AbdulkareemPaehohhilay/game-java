import java.util.Scanner;
public class Start extends Player{
   /* void start(){
        System.out.println("..empty ");
    }*/
    Player py = new Player();
    Saber Sb = new Saber();
    Bag Bg = new Bag();
    SelectItem Si = new SelectItem();
    Scanner Sc = new Scanner(System.in);
    void randomACK(int ackP, int ackC ,int hpP , int hpC)
   {
    System.out.println("HP COM =" + hpC);
    System.out.println("HP PLAYER = " +hpP);
    int h = 50;
    do{  
    if(ackP > ackC){
       hpC = hpC - ackP;
       hpP = hpP - ackC;
       System.out.println("Damage = -" + ackP);
       System.out.println("HP COM =" + hpC);
       System.out.println("HP PLAYER = " +hpP);
       System.out.println("..........................."); 
        if(hpC <= 0){break;}
    }
     else {
       hpP = hpP - ackC;
       hpC = hpC - ackP;
       System.out.println("Damage = -" + ackC);
       System.out.println("HP PLAYER = " +hpP);
       System.out.println("HP COM =" + hpC);
       System.out.println("..........................."); 
       }
    }while(hpC != 0 );
    
    System.out.println(".......END GAME........."); 
    System.out.println("HP PLAYER = " +hpP);
    
    if(hpP != 0){
        System.out.println("..........................."); 
        System.out.println("You win exp+100");
        System.out.println("exp =" + Upexp(hpP,py.Exp));
        System.out.print(".......SELECT ITEM..........");
        Si.selectitem();
        int x = Sc.nextInt();
        
        System.out.print("Item your = " + Si.item[x - 1]);
        Si.showitem(x);
        
       // Si.item[x-1] = Bg.Myitem();
    }
        else{
           System.out.println("..........................."); 
           System.out.println("You lose");
           System.out.println("...........................");}
   }
   public static int Upexp( int hpP,int expP)
   {
       if(hpP != 0){
       expP = expP + 100;
       }
       return expP;
   }
}