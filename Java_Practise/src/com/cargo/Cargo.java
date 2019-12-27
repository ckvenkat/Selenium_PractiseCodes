package com.cargo;

public class Cargo {
	
	private String name;
    private String description;
    private Double width;
    private Double length;

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public Double getWidth(){
        return width;
    }

    public Double getLength(){
        return length;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setWidth(Double width){
        this.width=width;
    }

    public void setLength(Double length){
        this.length=length;
    }

    public void displayCargoDetails(){
        System.out.println("The cargo details are:");
        System.out.println("Name : "+getName());
        System.out.println("Description : "+getDescription());
        System.out.println("Length : "+getLength()+" cm");
        System.out.println("Width : "+getWidth()+" cm");
    }

}
