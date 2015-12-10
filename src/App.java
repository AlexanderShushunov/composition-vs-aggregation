import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Person {

	private final String name;
	private final Date birthDay;
	private final List<Person> children = new ArrayList<>();

	public Person(String name, Date birthDay) {
		this.name = name;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public List<Person> getChildren() {
		return children;
	}

	public void addChild(Person child) {
		children.add(child);
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", birthDay=" + birthDay +
				(children.size() > 0 ? ", children=" + children : "") +
				'}';
	}
}

class App {
	public static void main(String[] args) {
		birthDay();
		children();
		name();
	}

	private static void children() {
		Person petya = new Person("Petya", new Date(90, 1, 1));
		petya.addChild(new Person("Vasya", new Date(115, 1, 1)));
		System.out.println(petya);
		petya.getChildren().add(new Person("Masha", new Date(30, 1, 1)));
		System.out.println(petya);
	}

	private static void birthDay() {
		Date birthDay = new Date(90, 1, 1);
		Person petya = new Person("Petya", birthDay);
		System.out.println(petya);
		birthDay.setYear(50);
		System.out.println(petya);
		petya.getBirthDay().setYear(30);
		System.out.println(petya);
	}

	private static void name() {
		Person petya = new Person("Petya", new Date(90, 1, 1));
		System.out.println(petya);
		String name = petya.getName();
		name.toUpperCase();
		System.out.println(petya);
		name = "Vasya";
		System.out.println(petya);
	}
}