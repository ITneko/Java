package oracle.vo;

import java.sql.Date;

/*
 * 데이터 버스 역활 Velue Object
 * Bean, Vo, DTO
*/
public class EmpVO {
	
	private int eno;
	private String ename;
	private String job;
	private int manager;
	private Date hiredate;
	private int salary;
	private int commission;
	private int dno;
	private int intTemp;
	private String stringTemp;
	
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		if(job.length()<8) {
			this.job = job+"\t";
		}else {
			this.job = job;
		}
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public int getIntTemp() {
		return intTemp;
	}
	public void setIntTemp(int intTemp) {
		this.intTemp = intTemp;
	}
	public String getStringTemp() {
		return stringTemp;
	}
	public void setStringTemp(String stringTemp) {
		this.stringTemp = stringTemp;
	}
	
	
}
