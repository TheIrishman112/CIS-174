package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int rightCount = 0;
		int finalScore = 0;
		try {
			BufferedReader qFile = new BufferedReader(new FileReader("src/project/Question")); ///starts to read question file
			BufferedReader aFile = new BufferedReader(new FileReader("src/project/Answer")); ///starts to read answer file

			List<Question> qList = new ArrayList<Question>();
			String start = " ";
			while (start != null) { /// creates a start string which receives the values of each line in the question file

				start = qFile.readLine();
				if (start != null) { /// without this I was getting an issue where I had an extra empty question being passed
					Question q = new Question(start); /// reads in each question
					qList.add(q);
				}

			}
			for (Question q : qList) {
				q.setAnswer(aFile.readLine()); /// gives each question an answer
			}
			for (Question q : qList) {
				if (q.getQuestion() != null && q.getAnswer() != null) // starts game loop
					System.out.println(q.getQuestion());

				String response = console.next();
				while (!response.equals("t") && !response.equals("f")) { /// handles potential errors resulting from improper input
					System.out.println("Please answer each question t or f");
					response = console.next();
				}
				if (response.equals(q.getAnswer())) { /// gets user input and compares it to the answer
					System.out.println("Correct!");
					rightCount++;
				} else {
					System.out.println("Oops");
				}

			}
			finalScore = rightCount * 10; /// gives complete exam score
			System.out.println("You scored " + finalScore + " points");
			BufferedWriter score = null;
			FileWriter testScore = new FileWriter("src/project/score", true); ///initializes file writer
			score = new BufferedWriter(testScore);
			score.write("You scored " + finalScore + " points \n");
			score.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}