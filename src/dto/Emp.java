package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp {
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private String hiredate;
	private int sal;
	private int comm;
	private int deptNo;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		Date d = null;
//		try {
//			d = format.parse(hiredate);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return "Emp [empNo=" + empNo
				+ ", eName=" + eName
				+ ", job=" + job
				+ ", mgr=" + mgr
				+ ", hiredate=" + hiredate
				+ ", sal=" + sal
				+ ", comm=" + comm
				+ ", deptNo=" + deptNo + "]";
	}
}
