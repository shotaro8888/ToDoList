public class Training01 {

	public static void main(String[] args) {
		Person person1 = new Person("okada", 12);
		Person person2 = new Person("nishino", 18);
		
		System.out.println(person1.isSameAge(person2));
	}

}