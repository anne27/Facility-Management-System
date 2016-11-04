	public class Staff {
	public String ID, username,department,name,DOB,address,status;
	public Supervisor department_supervisor;
	public int no_of_tasks=0;
	public Task task[];

	public Staff(String username, String ID, String department, String name, String DOB, String address, String status){
		this.setID(ID);
		this.setUsername(username);
		this.setDepartment(department);
		this.setDOB(DOB);
		this.setAddress(address);
		this.setStatus(status);
		this.setname(name);
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public String getID()
	{
		return this.ID;
	}
	public String getDepartment()
	{
		return this.department;
	}
	public String getName()
	{
		return this.name;
	}
	public String getDOB()
	{
		return this.DOB;
	}
	public String getAddress()
	{
		return this.address;
	}
	public String getStatus()
	{
		return this.status;
	}

	private void setname(String name)
	{
		this.name=name;
	}
	private void setStatus(String status2) {
		this.status=status2;	
	}	
	
	private void setAddress(String address2) {
		this.address=address2;
	}

	private void setDOB(String dOB2) {
		this.DOB=dOB2;
	}

	private void setDepartment(String department2) {
		this.department=department2;
	}

	private void setUsername(String username2) {
		this.username=username2;
	}

	private void setID(String iD2) {
		this.ID=iD2;
	}

	void sendLogisticReq()	//send logistic requirement to supervisor
	{
		
	}
	void sendLeave(Leave l)
	{
		
	}
	void updateTaskStatus(Task task)
	{
		
	}
	void generateTaskReport(Task task)
	{
		
	}
	public void updateStatus(String status)
	{
		
	}
}
