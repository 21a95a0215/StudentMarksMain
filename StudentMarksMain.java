package collectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarksMain {
	
	public static void processMarks(ArrayList<Integer> marks) {
		
		Collections.sort(marks);
		for (int j=0; j < marks.size(); j++) {
			if (marks.get(j) < 40) {
				marks.remove(j);
				j--;
			}
		}
		System.out.println("Filtered and Sorted Marks: ");
		for (int k=0; k<marks.size(); k++) {
			System.out.println(marks.get(k));
		}
		System.out.println("Total Passing Students: "+marks.size());
		if (marks.size() > 0) {
			System.out.println("Highest Mark: "+ marks.get(marks.size()-1));
			System.out.println("Lowest Mark: "+ marks.get(0));
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> studentMarks = new ArrayList<>();
		System.out.println("Number of subjects: ");
		int sub = sc.nextInt();
		for (int i=0; i < sub; i++) {
			int marks = sc.nextInt();
			studentMarks.add(marks);
		}
		sc.close();
		
		processMarks(studentMarks); 	
	}
}
