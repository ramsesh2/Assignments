import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Section {
	String name;
	ArrayList<assignment> grades;
	float weight;
	
	public Section(String n, float w){
		this.name = n;
		this.weight = w;
		this.grades = new ArrayList<assignment>();
	}
	
	public void AddGrade(assignment a){
		grades.add(a);
	}
	
	public void requestGrade() throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Assignment name: ");
		String n = sc.readLine();
		System.out.println("Grade: ");
		float g = Float.parseFloat(sc.readLine());
		System.out.println("Total Points Possible: ");
		float t = Float.parseFloat(sc.readLine());
		assignment a = new assignment(n, g, t);
		this.AddGrade(a);
	}
}
