public class Person{
    int age;
    String name;
    
    public Person(String name, int age){
	this.name = name;
	this.age = age;
    }

    public int compareTo(Person other){
	return name.compareTo(other.name);
    }

    public static void main(String[]args){
	Person ape = new Person("Ape", 10);
	Person beh = new Person("Beh", 20);
	Person cee = new Person("Cee", 30);

	System.out.print(ape.compareTo(beh) + ",");
	System.out.print(ape.compareTo(cee));
    }
} 