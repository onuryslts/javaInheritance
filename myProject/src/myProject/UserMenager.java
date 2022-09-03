package myProject;

public class UserMenager {
	public void add(User user) {
		System.out.println(user.firstName + " " +user.lastName + " Kaydedildi... ");
	}
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
