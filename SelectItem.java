public class SelectItem{
    public String item[] ={"Magic Resistance","Luna Break Manual"
    ,"Clairvoyance ","Rune Magic"};

    void selectitem(){
            int i;
            for(i=0;i<4;i++){
            System.out.print(" "+(i+1)+".");
            System.out.println(item[i]);
            
         }}
    void showitem(int x){
     
            if(x == 1){
                System.out.println("Magic damage will be reduced.");
            }
            if(x == 2){
                System.out.println("A versatile magic strategy book.");
            }
            if(x == 3){
                System.out.println("Can see the target in a very long distance and look at the real high speed clearly But he must use magic to strengthen his eyes in order to gain ability.");
            }
            if(x == 4){
                System.out.println("Magic abilities that use runes.");
            }
    }     
    
}