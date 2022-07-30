package university;

public class University {

	// costanti
	public static final int MAX_STUDENTS = 1000;
	public static final int INITIAL_ID = 10000;
	public static final int MAX_COURSES = 50;
	public static final int INITIAL_CODE = 10;
	public static final int MAX_COURSES_PER_STUDENT = 25;
	public static final int MAX_STUDENTS_PER_COURSE = 100;
	
	// attributi

	
	public University(String name){

	}
	
	public String getName(){
		return null;
	}
	

	public void setRector(String first, String last){
	}
	

	public String getRector(){
		return null;
	}
	

	public int enroll(String first, String last){
		return 0;
	}
	

	public String student(int id){

		return null;
	}
	

	public int activate(String title, String teacher){
		return 0;
	}
	

	public String course(int code){
		return null;
	}
	
	/**
	 * Register a student to attend a course
	 * @param studentID id of the student
	 * @param courseCode id of the course
	 */
	public void register(int studentID, int courseCode){
	}
	
	/**
	 * Retrieve a list of attendees
	 * 
	 * @param courseCode unique id of the course
	 * @return list of attendees separated by "\n"
	 */
	public String listAttendees(int courseCode){
		return null;
	}

	/**
	 * Retrieves the study plan for a student
	 * 
	 * @param studentID id of the student
	 * @return list of courses the student is registered for
	 */
	public String studyPlan(int studentID){

		return null;
	}
}
