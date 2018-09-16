public class Animal implements Comparable<Animal>{
	String name;
	int legs;
	public int getLegs(){
		return legs;
	}
	public String getName(){
		return name;
	}

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return 0;
	}
}