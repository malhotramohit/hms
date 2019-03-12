import java.util.ArrayList;

public class StackUsingArrayList {
	public static void main(String[] args) {

		MyStack gymWeights = new MyStack(4);

		gymWeights.push(20);
		gymWeights.push(15);
		gymWeights.push(10);
		gymWeights.push(5);

		gymWeights.traverse();

		// pop
		System.out.println("before pop");
		gymWeights.traverse();
		int num = gymWeights.pop();
		System.out.println("number poped " + num);
		System.out.println("after pop");
		gymWeights.traverse();

		// peek
		System.out.println("before peek");
		gymWeights.traverse();
		num = gymWeights.peek();
		System.out.println("number peeked " + num);
		System.out.println("after peek");
		gymWeights.traverse();

		// exception overflow
		gymWeights.push(15);
		gymWeights.push(10);
		gymWeights.push(5);

	}

}

class MyStack {
	ArrayList<Integer> listAsStack;
	int size;

	public MyStack(int size) {
		this.size = size;
		listAsStack = new ArrayList<>(size);
	}

	void push(Integer val) {
		if (listAsStack.size() >= size) {
			System.out.println("Stack is full or overflow error");
		} else {
			listAsStack.add(val);
		}
	}

	Integer peek() {
		Integer num = -1;
		if (listAsStack.isEmpty()) {
			System.out.println("Stack is empty or under flow");
		} else {
			int lastElemenetIndex = listAsStack.size() - 1;
			num = listAsStack.get(lastElemenetIndex);
		}
		return num;
	}

	Integer pop() {
		Integer num = -1;
		if (listAsStack.isEmpty()) {
			System.out.println("Stack is empty or under flow");
		} else {
			int lastElemenetIndex = listAsStack.size() - 1;
			num = listAsStack.remove(lastElemenetIndex);
		}
		return num;
	}

	void traverse() {
		for (int i = 0; i < listAsStack.size(); i++) {
			System.out.println(listAsStack.get(i));
		}
	}
}
