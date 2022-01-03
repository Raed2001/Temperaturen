import java.util.Scanner;
public class Zimmertemperatur{
    static int[]temp;
    public static void einlesenTemperatur(int[]temperaturen){

        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<temperaturen.length;i++){
            int t=scanner.nextInt();
            if(t>=15&&t<=30){
                temperaturen[i]=t;
            }
            if(t==-1){
                temp=temperaturen;
                return;}
        }
        temp=temperaturen;

    }


    public static void ausgeben(int[]temperaturen){

        for(int i:temperaturen){

            System.out.println("Temperatur: "+i+" Grad");

        }

    }


}