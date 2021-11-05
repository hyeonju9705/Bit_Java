package bbb;

import bit_java1103.A;

class B extends A{
	void set() {
		def=1; //다른 패키지에 있기 때문에 접근 불가
		pro = 2;
		pri = 3; //private라고 볼 수 없음
		pub = 4;
	}
}
