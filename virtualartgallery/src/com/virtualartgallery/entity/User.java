package com.virtualartgallery.entity;

public class User {
	
	private static int uid=0;
	
	private int userId;
	private String userName;
	private String passWord;
	private String email;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String profilePicture;
	private String favoriteArtWorks;
	
	public User() {
		
	}
	
	public User(String userName, String passWord, String email, String firstName, String lastName,
			String dateOfBirth, String profilePicture, String favoriteArtWorks) {
		super();
		this.userId = ++uid;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.profilePicture = profilePicture;
		this.favoriteArtWorks = favoriteArtWorks;
	}
	
	
	
	public int getUserId() {
		return userId;
	}




	public void setUserId(int userId) {
		this.userId = userId;
	}




	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getProfilePicture() {
		return profilePicture;
	}


	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}


	public String getFavoriteArtWorks() {
		return favoriteArtWorks;
	}


	public void setFavoriteArtWorks(String favoriteArtWorks) {
		this.favoriteArtWorks = favoriteArtWorks;
	}


	

}
