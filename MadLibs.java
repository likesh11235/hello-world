/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madlibs;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DiNeSh KriSHH
 * it is my first biggest project
 * managed to point out all the errors by comments 
 */
public class MadLibs {
    String Story;
    String Name;
    String Noun1;
    String Noun2;
    String Noun3;
    String Adj1;
    String Adj2;
    String Adv;
    String randomNos;
    Random rand = new Random();//in large programs better initialise globally
    Scanner scanner = new Scanner(System.in);
    //getters
    public String getName(){
        return Name;
    }
    public String getStory(){
        return Story;
    }
    public String getNoun1(){
        return Noun1;
    }
    public String getNoun2(){
        return Noun2;
    }
    public String getNoun3(){
        return Noun3;
    }
    public String getAdj1(){
        return Adj1;
    }
    public String getAdj2(){
        return Adj2;
    }
    public String getAdv(){
        return Adv;
    }
    //Setters
    /* error made 
    public void setName(){
        this.Name = getName();
    }
    public void setNoun1(){
        this.Noun1 = getNoun1();
    }
    public void setNoun2(){
        this.Noun2 = getNoun2();
    }
    public void setNoun3(){
        this.Noun3 = getNoun3();
    }
    public void setAdj1(){
        this.Adj1 = getAdj1();
    }
    public void setAdj2(){
        this.Adj2 = getAdj2();
    }
    public void setAdv(){
        this.Adv = getAdv();
    }
    */
    public void setStory(String newStory){
        this.Story = newStory;
    }
    public void setName(String newName){
        this.Name = newName;
    }
    public void setNoun1(String newNoun1){
        this.Noun1 = newNoun1;
    }
    public void setNoun2(String newNoun2){
        this.Noun2 = newNoun2;
    }
    public void setNoun3(String newNoun3){
        this.Noun3 = newNoun3;
    }
    public void setAdj1(String newAdj1){
        this.Adj1 = newAdj1;
    }
    public void setAdj2(String newAdj2){
        this.Adj2 = newAdj2;
    }
    public void setAdv(String newAdv){
        this.Adv = newAdv;
    }
    public void setRandomNo(){
        int[] numbers= new int[3];
        int index = 0;
        while(index < numbers.length){
            numbers[index] = Math.abs(rand.nextInt())%100;
            index++;
        }
        System.out.println("My pet shits"+numbers[0]+" or "+numbers[1]+ " or "+numbers[2]+"a day");
        
    }
    //player data
    public void enterName(){
        System.out.println("Can u please enter the name!!!!");
        setName(scanner.nextLine());//cant use Scanner coz it is static content
    }
    public void enterNoun1(){
        System.out.println("Better enter the noun!!!!");
        setNoun1(scanner.nextLine());//i forgot all these things
    }
    public void enterNoun2(){
        System.out.println("can u make another noun!!!!");
        setNoun2(scanner.nextLine());
    }
    public void enterNoun3(){
        System.out.println("last noun!!!! may be ur girlfriend ");
        setNoun3(scanner.nextLine());
    }
    public void enterAdj1(){
        System.out.println("can u describe ur girl with a beautiful adjective!!!!");
        setAdj1(scanner.nextLine());
    }
    public void enterAdj2(){
        System.out.println("last adjective!!!!");
        setAdj2(scanner.nextLine());
    }
    public void enterAdv(){
        System.out.println("describe how u eat!!!!");
        setAdv(scanner.nextLine());
    }
    public void PutTogetherStory(){
        //Random rand = new Random(); already initialised
        int num = Math.abs(rand.nextInt()) % 2;
        if(num==0){
            Story = "Hey!! I'm " +getName()+ " This is a story about my friends "+getNoun1()+" and "
                    +getNoun2()+ " I used to have a pet named " + getNoun3()+ ". It looks " +getAdj1()+" and "
                    +getAdj2()+getNoun3()+" runs "+getAdv();
        }else{
            Story = "Hey!! I'm " +getName()+ " This is a damn about my enemies "+getNoun1()+" and "
                    +getNoun2()+ " I used to have a dick named " + getNoun3()+ ". It looks " +getAdj1()+" and "
                    +getAdj2()+"."+getNoun3()+" sucks "+getAdv();
        }
        setStory(Story);//need to set the story as the return type is void
    }
    public void play(){
        enterName();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdj1();
        enterAdj2();
        enterAdv();
        setRandomNo();// no parameters inside. smartass
        PutTogetherStory();//u can put this in main also but i did not try!!
        System.out.println(getStory());//fucking important!! how did I miss this??
    }
    public void PrintInstructions(){
        System.out.println("This game is all about creating a crazy story!!!! Let us start");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        MadLibs game = new MadLibs();
        game.PrintInstructions();
        game.play();
       
    }

    
}
