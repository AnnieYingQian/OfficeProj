package com.imooc.model;
/**
 * 职务类
 * @author yingqian
 *
 */

public class Duty {
	private int dutyNo;
	private String dutyName;
	
	// no parameter construction
	public Duty() {
			
	}
	
	// with parameters construction: dutyName
	public Duty(String dutyName) {
		this.setDutyName(dutyName);	
	}
	
	// with parameters construction: 职务编号、职务名称
	public Duty(int dutyNo, String dutyName) {
		this.setDutyNo(dutyNo);
		this.setDutyName(dutyName);	
	}
	
	// interface of dutyNo
	public int getDutyNo() {
		return dutyNo;
	}
	
	public void setDutyNo(int dutyNo) {
		this.dutyNo = dutyNo;
	}
	
	// interface of dutyName
	public String getDutyName() {
		return dutyName;
	}
	
	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}
	
}
