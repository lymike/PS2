package base;

public class MyInteger {

	private static int iValue;
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	
	public static int getValue() {
		return iValue; 
	}
	
	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOdd() {
		if (iValue % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isPrime() {
		 for (int i = 2; i < iValue; i++) {
			 if (iValue % i == 0)
				 return false;
		 }
		 return true;
	}
	
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isOdd(int value) {
		if (value % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger val) {
		if (getValue() % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger val) {
		if (getValue() % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger val) {
		for (int i = 2; i < getValue(); i++) {
			if (getValue() % i == 0)
				return false;
		}
		return true;
	}
	
	public boolean equals(int value) {
		if (value == getValue()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(MyInteger val) {
		if (iValue == getValue()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
