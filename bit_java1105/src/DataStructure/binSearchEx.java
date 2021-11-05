package DataStructure;

public class binSearchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int binSearch(int [] iArray, int key) {
		int lIndex = 0;
		int rIndex = iArray.length-1;
		do {
			int cIndex = (lIndex+rIndex)/2;
			if(iArray[cIndex]==key)
				return cIndex;
			else if(iArray[cIndex]<key)
				lIndex = cIndex+1;
			else
				rIndex = cIndex-1;
			} while(lIndex<=rIndex);
		return -1;
	}
}
