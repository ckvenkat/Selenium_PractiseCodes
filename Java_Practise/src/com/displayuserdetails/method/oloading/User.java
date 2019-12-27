package com.displayuserdetails.method.oloading;

public class User {
	private String userName;
	private String firstName;
	private String lastName;
	private String contact;
	
	User(){}
	
	public User(String userName, String firstName, String lastName, String contact) {
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
		this.contact=contact;		
	}
	
	User findUser(User userArray[],String userName) {
		User user=null;
        int noOfUsers = userArray.length;
        for(int i=0;i<noOfUsers;i++){
            if(userArray[i].getuserName().equals(userName)){
                user = userArray[i];
            }
        }
        return user;
	}
	
	User findUser(User userArray[],String firstName,String lastName) {
		User user=null;
        int noOfUsers = userArray.length;
        for(int i=0;i<noOfUsers;i++){
            if(userArray[i].getfirstName().equals(firstName)&&userArray[i].getlastName().equals(lastName)){
                user = userArray[i];
            }
        }
        return user;
	}
	
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getlastName() {
		return lastName;
	}
	public void setuserName(String userName) {
		this.userName=userName;
	}
	
	public String getuserName() {
		return userName;
	}
	
	public void setcontact(String contact) {
		this.contact=contact;
	}
	
	public String getcontact() {
		return contact;
	}

}
