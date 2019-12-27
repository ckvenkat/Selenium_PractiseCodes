package com.role.privilages;

import java.util.Arrays;

public class RoleBO {
	 private int maxCount=0;
	 private String temp1 = "";
	void display(Role[] roles) {
		for(int i=0;i<roles.length;i++){
            int k = roles[i].getPrivilege().length;
            if(k>maxCount)
                maxCount=k;
        }

        for(int i=roles.length-1;i>=0;i--){
            if(maxCount == roles[i].getPrivilege().length)
                temp1 +=roles[i].getName()+",";
        }

        String temp2[] = temp1.split(",");
        Arrays.sort(temp2);
        for (int i=0;i<temp2.length;i++){
            System.out.println(temp2[i]);
        }
	}

}
