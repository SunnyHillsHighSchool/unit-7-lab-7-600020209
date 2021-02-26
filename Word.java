//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?
   
   //add an instance variable
  private String s;
	//create 2 constructors
  public Word(){
    s = "";
  }
	public Word(String word){
    s = word;
  }
	//create other methods
  //Setter method
  public void setWord(String newString){
    s = newString;
  }
  //Getter method
  public String getWord(){
    return s;
  }
	//getLength method
  public int getLength(){
    //Return the length of the string instance variable within the class
    return s.length();
  }
  //getNumVowels method
  public int getNumVowels(){
    //Initialize int variable vowels with value 0
    int numVowels = 0;
    //Initialize string variable word with the value of the private instance variable
    String word = s;
    //Start for loop; initializing int var i with value 0, while i is less than the length of word, and incrementing i by one each iteration:
    for(int i = 0; i < word.length(); i++){
      //Start for loop; initializing int var j with value 0, while j is less than the length of vowels, and incrementing j by one each iteration:
      for(int j = 0; j < vowels.length(); j++){
        //Start if statement; if the character of string word at index i is equal to the character of string vowels at index j:
        if(word.charAt(i) == vowels.charAt(j)){
          //Increment numVowels by 1
          numVowels++;
        //Close if
        }
      //Close for
      }
    //Close for
    }
    //Return numVowels
    return numVowels;
  }
	//create a toString method
  public String toString(){
    return "" + s;
  }
}