package finalCA;

import java.util.ArrayList;

public class Controller {
	
	
	private Rubric student1, student2, student3;
	private ArrayList<Rubric> rubricsList;
	
	
	
	
	
	
	
	public Controller() 
	{
		

		student1 = new Rubric("Patrick","patrick","criteria1","criteria2","criteria3","criteria4","criteria5","criteria6","criteria7","criteria8","criteria9","criteria10",5,5,5,5,5,5,5,5,5,5);
		student2 = new Rubric("Patrick","patrick","criteria1","criteria2","criteria3","criteria4","criteria5","criteria6","criteria7","criteria8","criteria9","criteria10",5,5,5,5,5,5,5,5,5,5);
		student3 = new Rubric("Patrick","patrick","criteria1","criteria2","criteria3","criteria4","criteria5","criteria6","criteria7","criteria8","criteria9","criteria10",5,5,5,5,5,5,5,5,5,5);
		
		rubricsList.add(student1);
		rubricsList.add(student2);
		rubricsList.add(student3);
	
		
	}
	
	public void addRubric(String name,String student,String criteria1,String criteria2,String criteria3,String criteria4,String criteria5,String criteria6,String criteria7,String criteria8,String criteria9,String criteria10,
			int score1,int score2,int score3,int score4,int score5,int score6, int score7, int score8, int score9, int score10) 
	{
		
	}
	
	public void Summary() 
	{
		
	}
	
	
	
	

}
