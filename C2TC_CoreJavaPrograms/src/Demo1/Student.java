package Demo1;

public class Student {
    private int id;
    private String name;
    private int age;
     
    public void setId(int id) {
    	this.id = id;
    }
    public int getId() {
    	return this.id;
    }
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
