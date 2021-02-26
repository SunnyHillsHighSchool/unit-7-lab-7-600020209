//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
    words = new ArrayList<Word>();
    for(String i: wordList){
      words.add(new Word(i));
    }
	}

	public int countWordsWithXChars(int size)
	{
    //Create int variable count with value 0
		int count=0;
    //For each word within the object stored within variable current:
    for(Word current: words){
      //if the length of current is equal to parameter x:
      if(current.getLength() == size){
        //Increment count by 1
        count++;
      //End if
      }
    //End for
    }
    //Return count
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
    //Create int variable vowelCount with value 0
    int vowelCount = 0;
    //Initiate for loop; initializing int variable i with value 0, while i is less than the size of the list private instance variable, and incrementing i by 1 each loop:
    for(int i = 0; i < words.size(); i++){
      //If the length of the word stored at index i is equal to size:
      if(words.get(i).getLength() == size){
        //Add the number of vowels returned by getNumVowels to vowelCount
        vowelCount += words.get(i).getNumVowels();
        //Remove the value at index i
        words.remove(i);
        //Decrease i by 1
        i--;
      //End if
      }
    //End for
    }
    //Return vowelCount
		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
    //Create int variable count with value 0
		int count=0;
    //For each word within the object stored within variable current:
    for(Word current: words){
      //If the number of vowels in current returned by getNumVowels is equal to parameter x:
      if(current.getNumVowels() == numVowels){
        //Increment count by 1
        count++;
      //End if
      }
    //End for
    }
    //Return count
		return count;
	}
	
	//add in a toString
  public String toString(){
    return "" + words;
  }
}