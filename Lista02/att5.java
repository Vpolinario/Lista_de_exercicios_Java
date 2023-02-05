package Lista02;

import java.util.Scanner;

public class att5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int kills, deaths,assists, vencedor;
        int killsSoma = 0;
        int deathsSoma = 0;
        int assistsSoma = 0;


        do {
         System.out.println("Numero de kills: ");
         kills = entrada.nextInt();
         System.out.println("Numero de deaths: ");
         deaths = entrada.nextInt();
         System.out.println("Numero de assists: ");
         assists = entrada.nextInt();
         System.out.println("Houve vencedor? 1 = sim e 2 = nao ");
         vencedor = entrada.nextInt();

         //Somatório a cada rodada
         killsSoma += kills;
         deathsSoma += deaths;
         assistsSoma += assists;

         if(killsSoma<=5){
             System.out.println("Noob...");
         }
         else if(kills>=20){
             System.out.println("Master");
         }

         if(deathsSoma >=20){
             System.out.println("Houston, we have a problem.");
         }

         if(assistsSoma >= 20){
             System.out.println("Team work");
         }


        }while (vencedor != 1 );
     System.out.println("Fim do campeonato! Houve a  tomada de território!");
    }
}
