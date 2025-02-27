//Laurence Timothy Manalo Garcia
//CS 1400, Section 03
//Project 6 - Trivia Game
//April 17th, 2021

public class TriviaGameV1Test
{
   public static void main(String[] args)
   {
      TriviaGameV1 game = new TriviaGameV1();
      while (game.askNextQuestion())
         game.showScore();
      System.out.println("Game over! Thanks for playing!");
   }
}
