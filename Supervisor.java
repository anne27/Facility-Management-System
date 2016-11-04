import java.util.*;
public class Supervisor {
	private String ID,username,name,department,DOB,address;
	private List<Staff> staff_under_me;
	private int no_of_staff,no_of_tasks;
	
	void Supervisor(String ID, String username, String department, String DOB, String address)
	{
		this.setID(ID);
		this.setUsername(username);
		this.setName(department);
		this.setDepartment(department);
		this.setDOB(DOB);
		this.setAddress(address);
	}
	private void setAddress(String address2) {
		this.address=address2;
	}
	
	private void setDOB(String dOB2) {
		this.DOB=dOB2;
	}
	
	void setID(String ID)
	{
		this.ID=ID;
	}
	void setName(String Name)
	{
		this.name=Name;
	}
	void setDepartment(String dep)
	{
		this.department=dep;
	}
	void setUsername(String Username)
	{
		this.username=Username;
	}
	String getID()
	{
		return this.ID;
	}
	String getUsername()
	{
		return this.ID;
	}
	String getName()
	{
		return this.ID;
	}
	String getDepartment()
	{
		return this.ID;
	}
	String getDOB()
	{
		return this.ID;
	}
	String getAddress()
	{
		return this.ID;
	}
	int getStaffNumber()
	{
		return this.no_of_staff;
	}
	int getTaskNumber()
	{
		return this.no_of_tasks;
	}
	List getStaff()
	{
		return this.staff_under_me;
	}
	
	void addStaff(Staff staff)
	{
		staff_under_me.add(staff);
	}
	void viewStaff()
	{
		System.out.println(staff_under_me);
	}
	void deleteStaff(Staff staff)
	{
		
	}
	void assignTask(Task task)	//pass parameter to assign to only 1, some or all
	{
		
	}
	void sendLeave(Leave l)
	{
		
	}
	void handleLeave(Leave l)
	{
		
	}
}
