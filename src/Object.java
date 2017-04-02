

import java.io.Serializable;
import java.util.Date;

public class Object implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int seqNumber;
	private Date timestamp;
	public Object(int seqNumber, Date timestamp) {
		super();
		this.seqNumber = seqNumber;
		this.timestamp = timestamp;
	}
	public int getSeqNumber() {
		return seqNumber;
	}
	public void setSeqNumber(int seqNumber) {
		this.seqNumber = seqNumber;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
