//Laurence Timothy Manalo Garcia
//CS 1400, Section 03
//Project 6 - Trivia Game
//April 17th, 2021

import java.util.Scanner;
public class TriviaGameV2 
{
   private final int ARRAY_SIZE = 5;
   private Trivia[] trivia;
   private int score;
   private int questionNum;

   public TriviaGameV2()
   {
      Trivia q1 = new Trivia("The first Pokemon that Ash receives from Professor Oak",
                             "pikachu", 1);
      Trivia q2 = new Trivia("Erling Kagge skiied into here along on January 7, 1993",
                             "south pole", 2);
      Trivia q3 = new Trivia("1997 British band that produced 'Tub Thumper'",
                             "chumbawumba", 2);
      Trivia q4 = new Trivia("Who is the tallest person on record (8 ft. 11 in) that has lived?",
                             "robert wadlow", 3);
      Trivia q5 = new Trivia("PT Barnum said 'This way to the ______' to attract people to the exit.",
                             "egress", 1);

      trivia = new Trivia[] {q1, q2, q3, q4, q5};
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
      System.out.println(trivia[questionNum].getQuestion());
      answer = kb.nextLine();
      answer = answer.toLowerCase();
      if(answer.compareTo(trivia[questionNum].getAnswer()) == 0)
      {
         System.out.println("That is correct!");
         score += trivia[questionNum].getValue();
      }
      else
      {
         System.out.printf("Wrong. The correct answer is %s\n", trivia[questionNum].getAnswer());   
      }
      questionNum++;
      return true;
   }

   public void showScore()
   {
      System.out.printf("Your score is %d\n", score);
   }
}
