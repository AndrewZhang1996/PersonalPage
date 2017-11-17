package my_hobby;

public abstract class Hobby {

	private String name = null;
	private String description = null;
	
	public abstract void set_hobby_name(String name);
	public abstract void set_hobby_description(String description);
	public abstract String return_hobby_name();
	public abstract String return_hobby_description();
}
