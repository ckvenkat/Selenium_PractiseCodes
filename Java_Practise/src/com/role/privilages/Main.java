package com.role.privilages;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter number of role :");
		int n = scanner.nextInt();
		Role[] roles = new Role[n];
		for(int i=0;i<roles.length;i++) {
			System.out.println("Enter the role " + (i + 1) + " details :");
			System.out.println("Enter role name :");
			String name = scanner.nextLine();
			System.out.println("Enter description :");
			String description = scanner.nextLine();
			System.out.println("Enter the privileges :");
			String privileges[] = scanner.nextLine().split(",");
			Privilege[] tmpPrivileges = new Privilege[privileges.length];
            for(int j=0;j<tmpPrivileges.length;j++){
                tmpPrivileges[i]= new Privilege(privileges[j]);
            }
            roles[i]=new Role(name,description,tmpPrivileges);
		}
		scanner.close();
		System.out.println("Role names which has more number of privileges :");
		RoleBO bo = new RoleBO();
        bo.display(roles);

	}

}
