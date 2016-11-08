//This class maintains all the leave requests

public class Leave {
	String toWhom,fromWhom,reason,dateRange,status;
	void Leave(String toWhom, String fromWhom, String reason, String dateRange, String status)
	{
		this.setSender(fromWhom);
		this.setReceiver(toWhom);
		this.setReason(reason);
		this.setDateRange(dateRange);
		this.setStatus(status);
	}
	String getStatus()
	{
		return status;
	}
	String getSender()
	{
		return fromWhom;
	}
	String getReceiver()
	{
		return toWhom;
	}
	String getReason()
	{
		return reason;
	}
	String getDateRange()
	{
		return dateRange;
	}
	void setStatus(String status2) {
		this.status=status2;
	}
	void setDateRange(String dateRange2) {
		this.dateRange=dateRange2;
	}
	void setReason(String reason2) {
		this.reason=reason2;
	}
	void setReceiver(String toWhom2) {
		this.toWhom=toWhom2;
		
	}
	void setSender(String s) {
		this.fromWhom=s;
	}
}
