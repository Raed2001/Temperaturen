public class ZimmertemperaturTesttreiber{

    public static void main(String[]args){

        int[]temperaturen=new int[5];

        Zimmertemperatur.einlesenTemperatur(temperaturen);
        Zimmertemperatur.ausgeben(Zimmertemperatur.temp);

    }



}