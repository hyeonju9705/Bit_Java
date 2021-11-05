package PM3;

class Rect{
	int width;
	int height;
	
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public boolean equals(Rect r) { //사각형끼리 비교를 해야하니까 Rect r로 입력받음, (Rect 에 width랑 height가 자동으로 들어가므로)
		int area=width*height; //여기가 이상해서안되는거같은데
		return area==(r.height*r.width); 
		//
	}
}
public class RectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect(2,6);
		Rect r2 = new Rect(3,4);
		Rect r3 = new Rect(2,4);
		if(r1.equals(r2))
			System.out.println("r1과 r2가 각각 참조하는 두 사각형의 면적이 같음");
		else
			System.out.println("r1과 r2가 각각 참조하는 두 사각형의 면적이 다름");
		if(r1.equals(r3))
			System.out.println("r1과 r3가 각각 참조하는 두 사각형의 면적이 같음");
		else
			System.out.println("r1과 r3가 각각 참조하는 두 사각형의 면적이 다름");
	} //왜안돼,,,

}
