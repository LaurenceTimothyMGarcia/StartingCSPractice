//Laurence Timothy Manalo Garcia
//CS 1400, Section 03
//Project 6 - Trivia Game
//April 17th, 2021

public class TriviaGameV2Test 
{
   public static void main(String[] args)
   {
      TriviaGameV2 game = new TriviaGameV2();
         while (game.askNextQuestion())
      game.showScore();
      System.out.println("Game over! Thanks for playing!");
   }
}
