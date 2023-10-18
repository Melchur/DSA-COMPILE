
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		
		
		while(true) {
			System.out.println("MENU: ");
			System.out.println("I. Stack ");
			System.out.println("II. Queue ");
			System.out.println("III. Trees ");
			
			String choice = scanner.nextLine();
			
			switch(choice) {
			case "I": 
				while(true) {
					System.out.println("Stack Operations");
					System.out.println("1. Push ");
					System.out.println("2. Pop ");
					System.out.println("3. Peek ");
					System.out.println("4. Display ");
					
					
					System.out.println("Enter your choice: ");
					
					int choice1 = scanner.nextInt();
					
					if(choice1 == 1 ) {
						System.out.println("Enter elements to push: ");
						int element = scanner.nextInt();
						stack.push(element);
						System.out.println("Elements pushed: " + element);
					} else if(choice1 == 2) {
						if(!stack.isEmpty()) {
							int poppedElement = stack.pop();
							System.out.println("Popped Element: " + poppedElement);
						}else {
							System.out.println("Stack is Empty.");
						}
					} else if(choice1 == 3) {
						if(!stack.isEmpty()) {
							int peekedElement = stack.peek();
							System.out.println("Peeked Element: " + peekedElement);
						} else {
							System.out.println("Stack is empty.");
						}	
					} else if (choice1 == 4) {
						if(!stack.isEmpty()) {
							System.out.println("Stack elements: " + stack);
						} else {
							System.out.println("Stack is empty.");
						}	
						}
					else {
						System.out.println("Invalid input.");
						scanner.close();
						System.exit(0);
					}
					break;
				}
				
			case "II":
				while(true) {
					System.out.println("Queue Operations");
					System.out.println("1. Enqueue ");
					System.out.println("2. Dequeue ");
					System.out.println("3. Display ");
					
					System.out.println("Enter your choice: ");
					
					int choice2 = scanner.nextInt();
					
					if(choice2 == 1 ) {
						System.out.println("Enter elements to enqueue: ");
						int element = scanner.nextInt();
						queue.offer(element);
						System.out.println("Elements pushed: " + element);
					} else if(choice2 == 2) {
						if(!queue.isEmpty()) {
							int dequeuedElement = queue.poll();
							System.out.println("Dequeued Element: " + dequeuedElement);
						}else {
							System.out.println("Queue is Empty.");
						}
					} else if (choice2 == 3) {
						if(!queue.isEmpty()) {
							System.out.println("Queue elements: " + queue);
						} else {
							System.out.println("Queue is empty.");
						}	
						}
					else {
						System.out.println("Invalid input.");
						scanner.close();
						System.exit(0);
					}
				
				}
			case "III":
				System.out.println("In-Order Traversal: CCC, BB, HH, DD, AA");
				System.out.println("Pre-Order Traversal: CCC, BB, HH, DD, AA, FF, EE, GG, CC");
				System.out.println("Post-Order Traversal: CCC, BB, HH, DD, CC, EE, FF, GG, AA");
				break;
				
			default:
				System.out.println("Invalid choice.");
				scanner.close();
				System.exit(0);
				
			
			}
			
		}
		
	}
}
			
		
		
		//scanner.close();

	

