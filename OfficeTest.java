package com.imooc.test;
import com.imooc.model.*;

public class OfficeTest {
	public static void main(String[] args) {
		// 测试部门类
		Department department1 = new Department("人事部");
		Department department2 = new Department("市场部");
		
		// 测试职务类
		Duty duty1 = new Duty("助理");
		Duty duty2 = new Duty("职员");
		Duty duty3 = new Duty("经理");
		
		// 测试员工类
		Employee employee1 = new Employee("张铭", "S001", "男", 29);
		Employee employee2 = new Employee("李艾爱", "S002", "女", 21);
		Employee employee3 = new Employee("孙超", "S004", "男", 29);
		Employee employee4 = new Employee("张美美", "S005", "女", 26);
		Employee employee5 = new Employee("蓝迪", "S006", "男", 37);
		Employee employee6 = new Employee("米莉", "S007", "女", 24);
		System.out.println(employee1.introduction(department1, duty3));
		System.out.println("=========================="); 
		System.out.println(employee2.introduction(department1, duty1));
		System.out.println("==========================");
		System.out.println(employee3.introduction(department1, duty2));
		System.out.println("==========================");
		System.out.println(employee4.introduction(department2, duty2));
		System.out.println("==========================");
		System.out.println(employee5.introduction(department2, duty3));
		System.out.println("==========================");
		System.out.println(employee6.introduction(department2, duty2));
		System.out.println("==========================");
		
		// 测试制定部门中的员工人数
		department1.addEmployee(employee1);
		department1.addEmployee(employee2);
		department1.addEmployee(employee3);
		department2.addEmployee(employee4);
		department2.addEmployee(employee5);
		department2.addEmployee(employee6);		
		System.out.println(department1.getDepartmentName() + "总共有" + department1.getEmployeeNum() + "名员工");
		System.out.println(department2.getDepartmentName() + "总共有" + department2.getEmployeeNum() + "名员工");
	}
}
