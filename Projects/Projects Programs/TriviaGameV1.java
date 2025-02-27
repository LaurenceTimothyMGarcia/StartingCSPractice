//Laurence Timothy Manalo Garcia
//CS 1400, Section 03
//Project 6 - Trivia Game
//April 17th, 2021

import java.util.Scanner;
public class TriviaGameV1 
{
   private final int ARRAY_SIZE = 5;
   private String[] questions;
   private String[] answers;
   private int[] values;
   private int score;
   private int questionNum;

   public TriviaGameV1()
   {
      questions = new String[] {"The first Pokemon that Ash receives from Professor Oak",
                                "Erling Kagge skiied into here along on January 7, 1993",
                                "1997 British band that produced 'Tub Thumper'",
                                "Who is the tallest person on record (8 ft. 11 in) that has lived?",
                                "PT Barnum said 'This way to the ______' to attract people to the exit."};
      answers = new String[] {"pikachu", "south pole", "chumbawumba", "robert wadlow", "egress"};
      values = new int[]{1, 2, 2, 3, 1};
   }

   public boolean askNextQuestion()
   {
      Scanner kb = new Scanner(System.in);
      String answer;

      if(questionNum >= ARRAY_SIZE)
      {
         return false;
      }

      System.out.println("\nQuestion " + (questionNum + 1));
      System.out.println(questions[questionNum]);
      answer = kb.nextLine();
      answer = answer.toLowerCase();
      if(answer.compareTo(answers[questionNum]) == 0)
      {
         System.out.println("That is correct!");
         score += values[questionNum];
         System.out.printf("Your score is %d\n", score);
      }
      else
      {
         System.out.printf("Wrong. The correct answer is %s\n", answers[questionNum]);
         System.out.printf("Your score is %d\n", score);
      }

      questionNum++;
      return true;
   }

   public void showScore()
   {
      System.out.printf("Your score is %d\n", score);
   }
}
