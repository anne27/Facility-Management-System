import java.util.*;
public class Admin {
	private String ID, username,DOB,department,address;
	private List<Staff> complete_staff_list; 
	private List<Supervisor> supevisors_under_me;
	private List<Task> complete_task_list;
	private List<String> logistics_list;
	void Admin(String ID, String username, String DOB, String department, String address)
	{
		this.setID(ID);
		this.setUsername(username);
		this.setDOB(DOB);
		this.setDepartment(DOB);
		this.setAddress(address);
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

	void addStaff(Staff staff)		//reject
	{
		
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
