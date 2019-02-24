import javax.naming.NameClassPair;
import java.util.Random;
import java.util.Scanner;

public class SelectClass{


    public static void SelectCl() {
        Scanner Sc = new Scanner(System.in);
        int i;
        Player C = new Player();
       // String  nameC[] ={"Saber","Archer","Rider","Lancer","Caster","Assassin","Berserker","Ruler","Avenger"};
        for(i=0;i<9;i++){
        System.out.print(" "+(i+1)+".");
        System.out.println(C.NameC[i]);
     }}
     

}