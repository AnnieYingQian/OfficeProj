package com.imooc.model;
/**
 * 部门类
 * @author yingqian
 *
 */

public class Department {
	private int departmentNo;
	private String departmentName;
	private Employee[] myEmployees;
	private int employeeNum;
	
	// no parameter construction
	public Department() {
		
	}
	
	// with parameters construction: departmentName
	public Department(String departmentName) {
		this.setDepartmentName(departmentName);
	}
	
	// with parameters construction: departmentName, departmentNo 
	public Department(int departmentNo, String departmentName) {
		this.setDepartmentNo(departmentNo);
		this.setDepartmentName(departmentName);
	}
	
	// interface of departmentNo
	public int getDepartmentNo() {
		return departmentNo;
	}
	
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	
	// interface of departmentName
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	// interface of employee information
	/**
	 * 获取所有该部门员工信息，如果保存员工信息的数组未被初始化，则，先初始化长度为200
	 * @return 保存员工的数组
	 */
	public Employee[] getMyEmployees() {
		if (this.myEmployees == null) 
			this.myEmployees = new Employee[200];
		return myEmployees;
	}

	public void setMyEmployees(Employee[] myEmployees) {
		this.myEmployees = myEmployees;
	}

	// interface of employee number
	public int getEmployeeNum() {
		return employeeNum;
	}
	
	
	public void addEmployee(Employee employee) {
		/*
		 * 1.将员工保存到数组中
		 * 2.将员工个数保存到employeeNum
		 **/
		// 1.将员工保存到数组中
		for (int i = 0; i < this.getMyEmployees().length; i++) {
			if (this.getMyEmployees()[i] == null) {
				employee.setEmployeeDepartment(this);
				this.getMyEmployees()[i] = employee;
				// 2.将员工个数保存到employeeNum
				this.employeeNum = i + 1;
				return;
			}
		}
	}
	
}
