package exercise1;

class Person {
	private int age;
	private String name;

	public Person(){
		age = 0;
		name = null;
	}

	public Person(String name,int age){
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}
