package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exam {

	public static void main(String[] args) {

		try {
			BufferedReader qFile = new BufferedReader(new FileReader("src/project/Question"));
			BufferedReader aFile = new BufferedReader(new FileReader("src/project/Answer"));

			List<Question> qList = new ArrayList<Question>();
			String start = " ";
			while (start != null) {
				start = qFile.readLine();
				Question q = new Question(start);
				qList.add(q);
			}
			for (Question q : qList) {
				q.setAnswer(aFile.readLine());
			}
			for (Question q : qList) {
				if (q.getQuestion() != null && q.getAnswer() != null) //was getting a null issue previously
						 System.out.println(q.getQuestion() + " " + q.getAnswer());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void readFile() {

	}

	Scanner console = new Scanner(System.in);
}