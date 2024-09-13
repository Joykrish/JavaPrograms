package reflectionAPIs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Reflection {
	public static void main(String[] args) {
		Test t=new Test();
		Class cl=t.getClass();
		System.out.println(cl.getSimpleName());
		//System.out.println(cl.getMethods().length);
		Method[] method=cl.getDeclaredMethods();
		System.out.println(method.length);
//		
//		for (Method method2 : method) {
//			System.out.println(method2.getName()+"---"+method2.getReturnType());
//			Parameter[] parms=method2.getParameters();
//			for (Parameter parameter:parms) {
//				System.out.println(parameter.getName());
//			}
//		}
		
		Constructor[] constr=cl.getDeclaredConstructors();
		System.out.println(constr.length);
		
		for (Constructor constructor : constr) {
			System.out.println(constructor.getName());
			
		}
	}

}
