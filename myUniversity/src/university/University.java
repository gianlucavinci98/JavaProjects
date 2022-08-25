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
	String uniName;
	String rector;
	
	Student[] studenti;
	int iscritti = INITIAL_ID;
	
	Corso[] corsi;
	int numCorsi = INITIAL_CODE;
	
	public University(String name){
		this.uniName = name;
		studenti = new Student[MAX_STUDENTS];
		corsi = new Corso[MAX_COURSES];
	}
	
	public String getName(){
		return this.uniName;
	}
	

	public void setRector(String first, String last){
		this.rector = first + " " + last;
	}
	

	public String getRector(){
		return rector;
	}
	

	public int enroll(String first, String last){
		studenti[iscritti-INITIAL_ID]= new Student(first, last, iscritti);
		return iscritti++;
	}
	

	public String student(int id){
		for (int i = 0; i<(iscritti-INITIAL_ID); i++)
		{
			if (studenti[i].getID()==id) return studenti[i].toString();
		}
		return "studente non trovato";
	}
	
	public StringBuffer stampaStudenti()
	{
		StringBuffer str = new StringBuffer();
		for (Student s : studenti)
		{
			if(s!=null)
			{
				str.append(s.toString() + "\n");
			}
		}
		return str;
	}

	public int activate(String title, String teacher){
		corsi[numCorsi-INITIAL_CODE]= new Corso(title, teacher, numCorsi);
		return numCorsi++;
	}
	

	public String course(int code){
		for (int i = 0; i<(numCorsi-INITIAL_CODE); i++)
		{
			if(corsi[i].getCode()==code) return corsi[i].toString();
		}
		return "corso non trovato";
	}
	
	/**
	 * Register a student to attend a course
	 * @param studentID id of the student
	 * @param courseCode id of the course
	 */
	public void register(int studentID, int courseCode){
		Student s = studenti[studentID-INITIAL_ID];
		Corso c = corsi[courseCode-INITIAL_CODE];
		s.addCorso(c);
		c.addStud(s);
		
	}
	
	/**
	 * Retrieve a list of attendees
	 * 
	 * @param courseCode unique id of the course
	 * @return list of attendees separated by "\n"
	 */
	public String listAttendees(int courseCode){
		Corso c = corsi[courseCode-INITIAL_CODE];
		return c.getStudenti();
	}

	/**
	 * Retrieves the study plan for a student
	 * 
	 * @param studentID id of the student
	 * @return list of courses the student is registered for
	 */
	public String studyPlan(int studentID){
		Student s = studenti[studentID-INITIAL_ID];
		return s.getCorsi();
	}
}
