package bit_Java1102;

public class PersonEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] pa;
		pa = new Person[5]; //硅凯 按眉  积己
		
		for(int i=0; i<pa.length; i++) {
			pa[i]=new Person(); //Person 按眉 积己
			pa[i].age = 30+i;
		}
		
		for(int i=0; i<pa.length; i++) {
			System.out.print(pa[i].age+" ");
		}
		
		for(Person aPerson : pa) {
			System.out.println(aPerson.age);
		}
	}

}
