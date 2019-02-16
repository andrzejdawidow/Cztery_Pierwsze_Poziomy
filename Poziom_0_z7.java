import java.util.*;
import java.lang.*;
import java.io.*;

class User {
	private String name;
	private String lastname;
	private String sex;
	private int age;
	private String mail;
	
	public User(String name, String lastname, String sex, int age, String mail) {
		this.name = name;
		this.lastname = lastname;
		this.sex = sex;
		this.age = age;
		this.mail = mail;
	}
	    public void logIn() {}

        public void deleteAccount() {}
		
		public String getName() {
			return this.name;
		}
		public String getLastname() {
			return this.lastname;
		}
		public String getSex() {
			return this.sex;
		}
		public int getAge() {
			return this.age;
		}
		public String getMail() {
			return this.mail;
		}
}

class ForumUser extends User {
	private String nameUser;
	private int numberOfPosts;
	private boolean online;
	
	public ForumUser(String nameUser, int numberOfPosts, boolean online,
						String name, String lastname, String sex, int age, String mail) {
		super(name, lastname, sex, age, mail);
		this.nameUser = nameUser;
		this.numberOfPosts = numberOfPosts;
		this.online = online;
	}
	    public void publishPost() {}

        public void postComment() {}
		
		public void userInfo() {}
		
		public String getNameUser() {
			return this.nameUser;
		}
		public int getNumberOfPosts() {
			return this.numberOfPosts;
		}
		public boolean getOnline() {
			return this.online;
		}
}

class Application {
	        public static void main(String[] args) {
				ForumUser forumUser = new ForumUser("Andi", 5, true, 
														"Andrzej", "Kowalski", "men", 21, "enedue@liketake");
				String nameUser = forumUser.getNameUser;
				int numberOfPosts = forumUser.getNumberOfPosts;
				boolean online = forumUser.getOnline;
				String name = forumUser.getName;
				String lastname = forumUser.getLastname;
				String sex = forumUser.getSex;
				int age = forumUser.getAge;
				String mail = forumUser.getMail;
				
				System.out.println(nameUser +"\n" + numberOfPosts + "\n" + online + "\n" + name 
									+ "\n" + lastname + "\n" + sex + "\n" + age + "\n" + mail);
			}
}