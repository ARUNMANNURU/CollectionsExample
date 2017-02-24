import java.util.Scanner;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
	public class Node{
	
		public static void main(String[] args){
			
			Scanner scan = new Scanner(System.in);
	       //create object for class linkedlist
			LinkedList ll = new LinkedList();
			System.out.println("Singly Linked List Test\n");          
	        char ch;
	        /*  Perform list operations  */
	        do
	        {
	            System.out.println("\nSingly Linked List Operations\n");
	            System.out.println("1. insert at begining");
	            System.out.println("2. insert at end");
	            System.out.println("3. insert at position");
	            System.out.println("4. delete at position");
	            System.out.println("5. check empty");
	            System.out.println("6. get size");            
	            int choice = scan.nextInt();            
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Enter integer element to insert");
	                ll.insertAtStart( scan.nextInt() );                     
	                break;                          
	            case 2 : 
	                System.out.println("Enter integer element to insert");
	                ll.insertAtEnd( scan.nextInt() );                     
	                break;                         
	            case 3 : 
	                System.out.println("Enter integer element to insert");
	                int num = scan.nextInt() ;
	                System.out.println("Enter position");
	                int pos = scan.nextInt() ;
	                if (pos <= 1 || pos > ll.getSize() )
	                    System.out.println("Invalid position\n");
	                else
	                    ll.insertAtPos(num, pos);
	                break;                                          
	            case 4 : 
	                System.out.println("Enter position");
	                int p = scan.nextInt() ;
	                if (p < 1 || p > ll.getSize() )
	                    System.out.println("Invalid position\n");
	                else
	                    ll.deleteAtPos(p);
	                break;
	            case 5 : 
	                System.out.println("Empty status = "+ ll.isEmpty());
	                break;                   
	            case 6 : 
	                System.out.println("Size = "+ ll.getSize() +" \n");
	                break;                         
	             default : 
	                System.out.println("Wrong Entry \n ");
	                break;   
	            }
	            /*  Display List  */ 
	            ll.display();
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);                        
	        } while (ch == 'Y'|| ch == 'y');               
		}			
	}