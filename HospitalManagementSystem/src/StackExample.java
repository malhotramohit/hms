import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
			
		Stack<Integer>  gymWeights =  new Stack<Integer>();
		
		//push
		gymWeights.push(25);
		gymWeights.push(20);
		gymWeights.push(15);
		gymWeights.push(10);

		System.out.println(gymWeights);
		
		//pop remove the top element
		int weight = gymWeights.pop();
		
		System.out.println(weight);
		
		System.out.println(gymWeights);
		
		//peek
		int num = gymWeights.peek();
		System.out.println(num);
		System.out.println(gymWeights);
		
		//search
		int pos = gymWeights.search(20);
		System.out.println(pos);
		
		//exception
		Stack<String> urls = new Stack<String>();
		
		urls.push("www.abc.com");
		
		System.out.println(urls.pop());
		//now stack is empty
		System.out.println(urls.pop());
				


	}

}
