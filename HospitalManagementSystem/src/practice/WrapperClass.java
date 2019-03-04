package practice;

import java.math.BigDecimal;

public class WrapperClass {

	public static void main(String[] args) {
		// byte short int long float double char boolean
		byte b = 5;
		Byte byteObj = new Byte((byte) 5);

		int i = 10;
		Integer intObj1 = new Integer(10);
		Integer intObj2 = new Integer(20);

		String num = "40";
		String num1 = new String("30");

		Integer intObj3 = new Integer(num);

		// integer sum
		System.out.println(intObj3 + i);
		// string concat
		System.out.println(num + num1);

		System.out.println(intObj1 + intObj2);

		String phoneNum = "686645654";

		// number format exception
		Long mobileNum = new Long(phoneNum);
		System.out.println(mobileNum);

		BigDecimal number = new BigDecimal(phoneNum);
		System.out.println(number);

		Boolean bool = new Boolean(false);
		Character chara = new Character('f');

		Double val = new Double("343.44");

		// Auto-boxing, unboxing

		// auto boxing- java automa-- convert primitive se wrapper
		int age = 23;

		Integer ageObj = age; // hidden-->new Integer(age)

		int newAge = ageObj; // object to primitive , ageObj.intValue();

		int age212 = ageObj.intValue(); // Integer object primitive

		int age122 = Integer.valueOf("34");
		System.out.println(age122);

		// ---- cacheing Integer values (-128-127)

		Integer a = Integer.valueOf(10);
		Integer c = Integer.valueOf(10);

		Integer aa = Integer.valueOf(1000);
		Integer cc = Integer.valueOf(1000);

		System.out.println(a.hashCode()); // add1
		System.out.println(c.hashCode()); // add1
		System.out.println(aa.hashCode()); // add2
		System.out.println(cc.hashCode()); // add4

		if (aa == cc) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		if (a == c) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		// parseInt

		int k =34;
		byte j = (byte) k;
		
		String str = "2323";
		Integer intObj = new Integer(678);
		// null not handled
		// wrapper to primitive
		int strInt = Integer.parseInt(str); // new Integer(str);
		long var1 =  Long.parseLong(str);
		
		Double var2 = Double.parseDouble(str);
		
		
		Integer strInt1 = Integer.valueOf(intObj);
		
		System.out.println(strInt);

		System.out.println(strInt1);
		
		// int: .intValue, .parseInt, .valueOf
		//

	}

}
