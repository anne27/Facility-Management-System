import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;
public class Admin {
	private String ID, username,DOB,department,address,name;
	private List<Staff> complete_staff_list;
	private List<Supervisor> supevisors_under_me;
	private List<Task> complete_task_list;
	private List<String> logistics_list;
	public Admin(String ID, String username, String name, String DOB, String department, String address)
	{
		this.setID(ID);
		this.setUsername(username);
		this.setName(name);
		this.setDOB(DOB);
		this.setDepartment(department);
		this.setAddress(address);
	}

	private void setName(String name2) {
		this.name=name2;
	}

	private void setAddress(String address2) {
		this.address=address2;
	}

	private void setDepartment(String dOB2) {
		this.department=dOB2;
	}

	private void setDOB(String dOB2) {
		this.DOB=dOB2;
	}

	private void setUsername(String username2) {
		this.username=username2;
	}

	private void setID(String iD2) {
		this.ID=iD2;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public String getDepartment() {
		return this.department;
	}

	public String getDOB() {
		return this.DOB;
	}

	public String getUsername() {
		return this.username;
	}

	public String getID() {
		return this.ID;
	}


	void addStaff(Staff staff)		//reject
	{
		try {
			InputStream in=new FileInputStream("Registrations.csv");
			Scanner sc=new Scanner(in);
			sc.nextLine();
			String x=sc.nextLine();
			String split[] = x.split(",");
			//if(split[1].equals(user)&&split[4].equals(depa));
			//admin_login=new Admin(split[0],split[1],split[2],split[3],depa,split[5]);
		}
			catch (FileNotFoundException e) {
		}
	}
	
	void addSupervisor(Supervisor sup)
	{

	}
	void viewStaff()
	{

	}
	void viewSupervisor(Supervisor sup)
	{

	}
	void deleteStaff(Staff staff)
	{

	}
	void deleteSupervisor(Supervisor sup)
	{

	}
	void assignTasks(Task t)	//Assign task to supervisor
	{

	}
	void handleSupervisorRequest()		//Accept or reject
	{

	}
	//Supervisors can send logistics approval requests for inventory to GM.

	void handleLeave(Leave l)		//Send leave to GM
	{

	}
	void viewTaskReports()
	{
		System.out.println(complete_task_list);
	}
}