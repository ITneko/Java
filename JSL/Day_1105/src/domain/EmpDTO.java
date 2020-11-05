package domain;

import java.sql.Date;

public class EmpDTO {
	private int eno;
	private String ename;
	private String job;
	private int manager;
	private Date hiredate;
	private int salary;
	private int commission;
	private int dno;
	private int intTemp;
	private int intTemp2;
	private int intTemp3;
	private int intTemp4;
	private double doubleTemp4;
	private String stringTemp;
	private String stringTemp2;
	private Date dateTemp;
	private Date dateTemp2;
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
	public int getIntTemp2() {
		return intTemp2;
	}
	public void setIntTemp2(int intTemp2) {
		this.intTemp2 = intTemp2;
	}
	public String getStringTemp() {
		return stringTemp;
	}
	public void setStringTemp(String stringTemp) {
		this.stringTemp = stringTemp;
	}
	public String getStringTemp2() {
		return stringTemp2;
	}
	public void setStringTemp2(String stringTemp2) {
		this.stringTemp2 = stringTemp2;
	}
	public Date getDateTemp() {
		return dateTemp;
	}
	public void setDateTemp(Date dateTemp) {
		this.dateTemp = dateTemp;
	}
	public Date getDateTemp2() {
		return dateTemp2;
	}
	public void setDateTemp2(Date dateTemp2) {
		this.dateTemp2 = dateTemp2;
	}
	public int getIntTemp3() {
		return intTemp3;
	}
	public void setIntTemp3(int intTemp3) {
		this.intTemp3 = intTemp3;
	}
	public double getDoubleTemp4() {
		return doubleTemp4;
	}
	public void setDoubleTemp4(double doubleTemp4) {
		this.doubleTemp4 = doubleTemp4;
	}
	public int getIntTemp4() {
		return intTemp4;
	}
	public void setIntTemp4(int intTemp4) {
		this.intTemp4 = intTemp4;
	}
	
	
	
}
