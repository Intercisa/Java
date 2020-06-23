package func;

import java.util.List;

public class FuncReduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(12,9,13,4,6,2,4,12,15);
		
		System.out.println(sumNumStruct(list));
		System.out.println(sumNumFuncWithMethod(list));
		System.out.println(sumNumFunc(list));
		System.out.println(sumNumFuncStatic(list));
		System.out.println(maxNumFunc(list));
		System.out.println(mimNumFunc(list));
		
	}

	
	private static int maxNumFunc(List<Integer> list) {
		return list.stream()
				.reduce(Integer.MIN_VALUE, (a,b) -> a>b?a:b);
	}
	
	private static int mimNumFunc(List<Integer> list) {
		return list.stream()
				.reduce(Integer.MAX_VALUE, (a,b) -> a<b?a:b);
	}


	private static int sum(int a, int b) {
		System.out.println(a + " " + b);
		return a+b;
	}
	
	private static int sumNumFuncWithMethod(List<Integer> list) {
		return list.stream()
				.reduce(0, FuncReduce::sum);
	}
	
	private static int sumNumFunc(List<Integer> list) {
		return list.stream()
				.reduce(0, (a,b) -> a+b);
	}
	
	private static int sumNumFuncStatic(List<Integer> list) {
		return list.stream()
				.reduce(0, Integer::sum);
	}
	private static int sumNumStruct(List<Integer> list) {
		int sum = 0;
		for (int num : list) 
			sum+=num;
		
		return sum;
	}
}
