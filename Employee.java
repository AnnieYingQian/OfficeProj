package com.imooc.model;

/**
 * 员工类
 * 
 * @author yingqian
 *
 */

public class Employee {
	private String employeeName;
	private String employeeNo;
	private int employeeAge;
	private String employeeSex;
	private Department employeeDepartment;
	private Duty employeeDuty;

	// no parameter construction
	public Employee() {

	}

	// with parameters construction: 姓名、工号、性别、年龄
	public Employee(String employeeName, String employeeNo, String employeeSex, int employeeAge) {
		this.setEmployeeName(employeeName);
		this.setEmployeeNo(employeeNo);
		this.setEmployeeSex(employeeSex);
		this.setEmployeeAge(employeeAge);
	}

	// with parameters construction: 姓名、工号、性别、年龄、部门、职务
	public Employee(String employeeName, String employeeNo, String employeeSex, int employeeAge,
			Department employeeDepartment, Duty employeeDuty) {
		this.setEmployeeName(employeeName);
		this.setEmployeeNo(employeeNo);
		this.setEmployeeSex(employeeSex);
		this.setEmployeeAge(employeeAge);
		this.setEmployeeDepartment(employeeDepartment);
		this.setEmpoyeeDuty(employeeDuty);
	}

	// interface of employeeName
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	// interface of employeeNo
	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	// interface of employeeAge
	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		// 设定方法限定年龄只能是18--65之间,反之则设置默认为18岁
		if (employeeAge < 18 || employeeAge > 65)
			this.employeeAge = 18;
		else
			this.employeeAge = employeeAge;
	}

	// interface of employeeSex
	public String getEmployeeSex() {
		return employeeSex;
	}

	public void setEmployeeSex(String employeeSex) {
		// 设定方法限定性别只能是“男”或者“女”,反之则设置默认为"男"
		if (employeeSex.equals("男") || employeeSex.equals("女"))
			this.employeeSex = employeeSex;
		else
			this.employeeSex = "男";
	}

	// interface of employeeDepartment
	/**
	 * 获取部门对象，如果没有实例化，先实例化后再返回
	 * 
	 * @return 部门对象信息
	 */
	public Department getEmployeeDepartment() {
		if (this.employeeDepartment == null)
			this.employeeDepartment = new Department();
		return employeeDepartment;
	}

	public void setEmployeeDepartment(Department employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	// interface of employeeDuty
	/**
	 * 获取职务对象，如果没有实例化，先实例化后再返回
	 * 
	 * @return 职务对象信息
	 */
	public Duty getEmpoyeeDuty() {
		if (this.employeeDuty == null)
			this.employeeDuty = new Duty();
		return employeeDuty;
	}

	public void setEmpoyeeDuty(Duty employeeDuty) {
		this.employeeDuty = employeeDuty;
	}

	/**
	 * 员工自我介绍的方法
	 * 
	 * @param myDepartment
	 * @param myDuty
	 * @return 自我介绍的信息，包括姓名、工号、性别、年龄、职务
	 */
	public String introduction(Department myDepartment, Duty myDuty) {
		String str = "姓名：" + this.getEmployeeName() + "\n工号：" + this.getEmployeeNo() + "\n性别：" + this.getEmployeeSex()
				+ "\n年龄：" + this.getEmployeeAge() + "\n职务：" + myDepartment.getDepartmentName() + myDuty.getDutyName();
		return str;
	}

}
