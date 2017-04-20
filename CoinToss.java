
package cointoss;

import java.util.Random;


public class CoinToss {
    public String tossACoin(){
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if(toss == 0){
            return "heads";
        }
        else{
            return "tails";
        }
        
    }

    public static void main(String[] args) {
     CoinToss game = new CoinToss();
     System.out.println(game.tossACoin());
     System.out.println(game.tossACoin());
     System.out.println(game.tossACoin());
     System.out.println(game.tossACoin());
     
     
    }
    
}
