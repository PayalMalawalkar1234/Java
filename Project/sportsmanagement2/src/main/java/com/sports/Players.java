package com.sports;


@Entity
@Table(name = "players")
public class Players {
	
	@Id 
    @Column(name = "Id")
    private int id;
 
    @Column(name = "First_Name")
    private String First_Name;
    
    @Column(name = "Last_Name")
    private String Last_Name;
 
    @Column(name = "Age") 
    private int age;
    
    @Column(name = "Address")
    private String address;
    
    @Column(name = "Category")
    private String category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
    
 
	
	
	
	 

}
