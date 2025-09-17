package Array;
import java.util.*;
public class SinglyLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; 

    
    public SinglyLinkedList() {
        this.head = null;
    }

    public void addAtBeginning(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    void addAtMiddle(int data,int position){
        if(position<1){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            addAtBeginning(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("POsition out of bound..");
            return;
        }
        else{
            newNode.next=temp.next;
            temp.next=newNode;
        }

    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        System.out.print("Singly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner sc=new Scanner(System.in);
        int ch; 
        do{
           System.out.println("=====Menu========");
             System.out.println("1.Insert at Beginning ");
             System.out.println("2.Insert at End ");
              System.out.println("3.Insert at Middle ");
             System.out.println("4.display");
             System.out.println("5.Exit");
             System.out.println("\nEnter your choice ");
             ch=sc.nextInt();
             switch(ch)
             {
                case 1:
                    System.out.println("\nEnter Data :");
                     int data=sc.nextInt();
                    list.addAtBeginning(data);
                    break;
                case 2:
                    System.out.println("\nEnter Data :");
                    int data1=sc.nextInt();
                    list.addAtEnd(data1);
                    break;
                case 3:
                        System.out.println("\nEnter Data :");
                        int data3=sc.nextInt();
                        System.out.println("\nEnter position :");
                        int position=sc.nextInt();
                        list.addAtMiddle(data3, position);
                case 4:
                 list.display();
                    break;
                case 5:
                System.out.println("Program end..");
                break;
                default :
                    System.out.println("Enter valid choice ..");

             }
            
        }while(ch!=5);
       

        // list.addAtBeginning(10);
        // list.addAtBeginning(20);
        // list.addAtBeginning(30);
        // list.addAtEnd(40);
        // list.addAtEnd(50);
        // list.display(); 
    }
}
