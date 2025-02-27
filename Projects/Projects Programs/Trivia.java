//Laurence Timothy Manalo Garcia
//CS 1400, Section 03
//Project 6 - Trivia Game
//April 17th, 2021

public class Trivia 
{
   private String question;
   private String answer;
   private int value;

   public Trivia()
   {
      question = "";
      answer = "";
      value = 0;
   }

   public Trivia(String q, String a, int v)
   {
      question = q;
      answer = a;
      value = v;
   }

   public String getQuestion()
   {
      return question;
   }
   public String getAnswer()
   {
      return answer;
   }
   public int getValue()
   {
      return value;
   }
}
