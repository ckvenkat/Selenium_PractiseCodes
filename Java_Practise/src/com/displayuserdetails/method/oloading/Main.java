package com.displayuserdetails.method.oloading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String []arg) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the total number of users");
    int noOfUsers = Integer.parseInt(reader.readLine());
    User [] users = new User[noOfUsers];
    System.out.println("Enter user details");
    for(int i=0;i<noOfUsers;i++){
        String userDetails = reader.readLine();
        String[] tmpDetails = userDetails.split(",");
        users[i]=new User(tmpDetails[0],tmpDetails[1],tmpDetails[2],tmpDetails[3]);
    }

    System.out.println("1)Search user by user name");
    System.out.println("2)Search user by first name and last name");
    System.out.println("Enter your option");
    String input = reader.readLine();
    User user = new User();
    User user1 ;
    if(input.equals("1")){
        System.out.println("Enter the user name to search");
        String searchString = reader.readLine();
        user1 = user.findUser(users,searchString);
        if(user1==null){
            System.out.println("User not found");
        }else{
            System.out.println("User details :");
            System.out.println("Username :"+user1.getuserName());
            System.out.println("FirstName :"+user1.getfirstName());
            System.out.println("LastName :"+user1.getlastName());
            System.out.println("Contact :"+user1.getcontact());
        }
    }else if(input.equals("2")){
        System.out.println("Enter the first name to search");
        String firstName = reader.readLine();
        System.out.println("Enter the last name to search");
        String lastName = reader.readLine();
        user1=user.findUser(users,firstName,lastName);
        if(user1==null){
            System.out.println("User not found");
        }else{
            System.out.println("User details :");
            System.out.println("Username :"+user1.getuserName());
            System.out.println("FirstName :"+user1.getfirstName());
            System.out.println("LastName :"+user1.getlastName());
            System.out.println("Contact :"+user1.getcontact());
        }
    }

}
}
