package bit_java1104;

abstract class Animal{
	abstract public void makeSound(); // abstract�޼ҵ�� abstract class�ȿ� �־���ϸ�
	//makeSound()�� ������ ���� �� ����. {}�� System.out.println("�Ҹ�������")�̷� ���븻�̴�.
	//�߻� Ŭ����, �߻� �޼ҵ�� �ݵ�� �տ� abstract Ű���带 �޾������
	public void eat() {
		System.out.println("�Դ´�");
	}
}
abstract class Shape{
	//�߻� �޼ҵ尡 ���, abstract class�� �ϸ� �߻� Ŭ������
}
abstract class Mouse extends Animal{ // �ڽĵ� �θ𿡰� ��ӹ��� �߻� �޼ҵ带 overriding�ؼ�
	//�������� ������ �߻�Ŭ������ �ȴ� - > ���� overriding���� �����Ŷ�� �׳� abstract�ٿ��� 
	//�ڽ�Ŭ������ �߻� Ŭ������ ��������
	
}
class Dog extends Animal{
	public void makeSound() { //�߻�޼ҵ�, abstract, ��ü(����)�� ���� �޼ҵ�
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("�Ŀ�");
	}
}

public class AnimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Animal(); //�߻� Ŭ������ ��ü ���� �Ұ�
		
		Animal dog = new Dog(); //�߻�Ŭ������ ���۷��� ���� ����
		dog.makeSound();
	}

}
