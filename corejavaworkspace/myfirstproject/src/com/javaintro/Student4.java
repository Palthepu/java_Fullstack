package com.javaintro;
//objects inside method
public class Student4 {
	 static String name;
	 static int id;
		static void method1() {
			Student4 s4 = new Student4();
			Student4 s5 = new Student4();
			System.out.println(s4);
			System.out.println(s5);
		}
		@Override
		protected void finalize() throws Throwable {
			System.out.println("object destroy");
		}
		public static void main(String[] args) {
			System.out.println(id);
			System.out.println("main method started");
			method1();
			System.gc();
		}

}
