import java.util.Scanner;
public class Player{

    Scanner Sc = new Scanner(System.in);
    public String Name , Classname, bag;
    public int Level=1, Exp=0 ,xnum;
    public String  NameC[] ={"Saber","Archer","Rider","Lancer","Caster","Assassin","Berserker","Ruler","Avenger"};


     String xClass(int x){
         xnum = x;
        return Classname = NameC[x-1];

    }
    void selectmode(){
        int j=10;
        Profile Pr = new Profile();
        Bag Bg = new Bag();
        Start St = new Start();
        while(j>0){
        System.out.println("..................");
        System.out.println(" Select mode ");
        System.out.println(" 1.Profile");
        System.out.println(" 2.Bag");
        System.out.println(" 3.Start");
        System.out.println(" 4.EndGame");
        System.out.println("..................");
        int selectmode = Sc.nextInt();
        if(selectmode == 1){
            Pr.profile();
        }
        else if(selectmode == 2){
            Bg.bag();
        }
        else if(selectmode == 3){
            Saber Sb = new Saber();
            St.randomACK(Sb.Ack, Sb.AckC, Sb.Hp,Sb.HPC);
        }
        else{
            break;
        }
      }  
    }

}