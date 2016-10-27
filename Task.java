public class Task {
	public int deadline,taskID;
	private String status="NOT STARTED";	// NOT STARTED(default),ONGOING,COMPLETE	
	void setStatus(String s)
	{
		this.status=s;
	}
	String getStatus()
	{
		return this.status;
	}
	void setDeadline(int s)
	{
		this.deadline=s;
	}
	int getDeadline()
	{
		return this.deadline;
	}
	void generateCompletionReport()
	{
		if (status=="COMPLETE")
		{
			//generate report with system generated timestamps
		}
	}
	
}
