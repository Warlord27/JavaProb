
import java.util.Scanner;
public class LinkedList {
    class StringList {
        String data;
        StringList next;

        // Constructor
        StringList() {
            this.data = "";
            this.next = null;
        }

        // Insert element at front
        StringList forInput(StringList start, String val) {
            StringList newNode = new StringList();
            newNode.data = val;
            newNode.next = start;
            start = newNode;
            return start;
        }

        // Insert element at end
        StringList bacInput(StringList start, String val) {
            StringList newNode = new StringList();
            newNode.data = val;
            if (start == null)
                return newNode;
            StringList temp = start;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
            return start;
        }

        // Insert element at specific index (0-based)
        StringList addAtIndex(StringList start, String val, int index) {
            StringList newNode = new StringList();
            newNode.data = val;
            if (index == 0 || start == null) {
                newNode.next = start;
                return newNode;
            }
            StringList temp = start;
            for (int i = 0; i < index - 1 && temp.next != null; i++)
                temp = temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
            return start;
        }

        // Delete first element
        StringList delFirst(StringList start) {
            if (start == null) {
                System.out.println("List is empty.");
                return null;
            }
            return start.next;
        }

        // Delete last element
        StringList delLast(StringList start) {
            if (start == null) {
                System.out.println("List is empty.");
                return null;
            }
            if (start.next == null)
                return null;
            StringList temp = start;
            while (temp.next.next != null)
                temp = temp.next;
            temp.next = null;
            return start;
        }

        // Delete element at specific index (0-based)
        StringList delAtIndex(StringList start, int index) {
            if (start == null) {
                System.out.println("List is empty.");
                return null;
            }
            if (index == 0)
                return start.next;
            StringList temp = start;
            for (int i = 0; i < index - 1 && temp.next != null; i++)
                temp = temp.next;
            if (temp.next == null)
                System.out.println("Index out of range.");
            else
                temp.next = temp.next.next;
            return start;
        }

        // Reverse the linked list
        StringList reverse(StringList start) {
            StringList prev = null;
            StringList current = start;
            StringList nextNode;
            while (current != null) {
                nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            return prev;
        }

        // Display list
        void display(StringList start) {
            if (start == null) {
                System.out.println("List is empty.");
                return;
            }
            StringList temp = start;
            System.out.print("String List: ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    class IntList {
        int data;
        IntList next;

        // Constructor
        IntList() {
            this.data = 0;
            this.next = null;
        }

        // Insert element at front
        IntList forInput(IntList start, int val) {
            IntList newNode = new IntList();
            newNode.data = val;
            newNode.next = start;
            start = newNode;
            return start;
        }

        // Insert element at end
        IntList bacInput(IntList start, int val) {
            IntList newNode = new IntList();
            newNode.data = val;
            if (start == null)
                return newNode;
            IntList temp = start;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
            return start;
        }

        // Insert element at specific index (0-based)
        IntList addAtIndex(IntList start, int val, int index) {
            IntList newNode = new IntList();
            newNode.data = val;
            if (index == 0 || start == null) {
                newNode.next = start;
                return newNode;
            }
            IntList temp = start;
            for (int i = 0; i < index - 1 && temp.next != null; i++)
                temp = temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
            return start;
        }

        // Delete first element
        IntList delFirst(IntList start) {
            if (start == null) {
                System.out.println("List is empty.");
                return null;
            }
            return start.next;
        }

        // Delete last element
        IntList delLast(IntList start) {
            if (start == null) {
                System.out.println("List is empty.");
                return null;
            }
            if (start.next == null)
                return null;
            IntList temp = start;
            while (temp.next.next != null)
                temp = temp.next;
            temp.next = null;
            return start;
        }

        // Delete element at specific index (0-based)
        IntList delAtIndex(IntList start, int index) {
            if (start == null) {
                System.out.println("List is empty.");
                return null;
            }
            if (index == 0)
                return start.next;
            IntList temp = start;
            for (int i = 0; i < index - 1 && temp.next != null; i++)
                temp = temp.next;
            if (temp.next == null)
                System.out.println("Index out of range.");
            else
                temp.next = temp.next.next;
            return start;
        }

        // Reverse the linked list
        IntList reverse(IntList start) {
            IntList prev = null;
            IntList current = start;
            IntList nextNode;
            while (current != null) {
                nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            return prev;
        }

        // Display list
        void display(IntList start) {
            if (start == null) {
                System.out.println("List is empty.");
                return;
            }
            IntList temp = start;
            System.out.print("Integer List: ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Linked List Operations ===");
            System.out.println("1. String List Operations");
            System.out.println("2. Integer List Operations");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stringListMenu(linkedList);
                    break;
                case 2:
                    intListMenu(linkedList);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }

    static void stringListMenu(LinkedList linkedList) {
        Scanner sc = new Scanner(System.in);
        StringList strList = linkedList.new StringList();
        int ch;

        do {
            System.out.print("\n--- String List Menu ---\n" + "1. Insert at Front\n" + "2. Insert at End\n"
                + "3. Insert at Index\n" + "4. Delete First\n" + "5. Delete Last\n" + "6. Delete at Index\n"
                + "7. Reverse List\n" + "8. Display List\n" + "9. Back to Main Menu\n" + "Enter your choice: ");
            ch = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (ch) {
                case 1:
                    System.out.print("Enter string to insert at front: ");
                    String str1 = sc.nextLine();
                    strList = strList.forInput(strList, str1);
                    System.out.println("Inserted successfully!");
                    break;
                case 2:
                    System.out.print("Enter string to insert at end: ");
                    String str2 = sc.nextLine();
                    strList = strList.bacInput(strList, str2);
                    System.out.println("Inserted successfully!");
                    break;
                case 3:
                    System.out.print("Enter string to insert: ");
                    String str3 = sc.nextLine();
                    System.out.print("Enter index: ");
                    int idx1 = sc.nextInt();
                    strList = strList.addAtIndex(strList, str3, idx1);
                    System.out.println("Inserted successfully!");
                    break;
                case 4:
                    strList = strList.delFirst(strList);
                    System.out.println("First element deleted!");
                    break;
                case 5:
                    strList = strList.delLast(strList);
                    System.out.println("Last element deleted!");
                    break;
                case 6:
                    System.out.print("Enter index to delete: ");
                    int idx2 = sc.nextInt();
                    strList = strList.delAtIndex(strList, idx2);
                    break;
                case 7:
                    strList = strList.reverse(strList);
                    System.out.println("List reversed!");
                    break;
                case 8:
                    strList.display(strList);
                    break;
                case 9:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (ch != 9);
    }

    static void intListMenu(LinkedList linkedList) {
        IntList intList = linkedList.new IntList();
        int ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\n--- Integer List Menu ---\n" + "1. Insert at Front\n" + "2. Insert at End\n"
                + "3. Insert at Index\n" + "4. Delete First\n" + "5. Delete Last\n" + "6. Delete at Index\n"
                + "7. Reverse List\n" + "8. Display List\n" + "9. Back to Main Menu\n" + "Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter integer to insert at front: ");
                    int num1 = sc.nextInt();
                    intList = intList.forInput(intList, num1);
                    System.out.println("Inserted successfully!");
                    break;
                case 2:
                    System.out.print("Enter integer to insert at end: ");
                    int num2 = sc.nextInt();
                    intList = intList.bacInput(intList, num2);
                    System.out.println("Inserted successfully!");
                    break;
                case 3:
                    System.out.print("Enter integer to insert: ");
                    int num3 = sc.nextInt();
                    System.out.print("Enter index: ");
                    int idx1 = sc.nextInt();
                    intList = intList.addAtIndex(intList, num3, idx1);
                    System.out.println("Inserted successfully!");
                    break;
                case 4:
                    intList = intList.delFirst(intList);
                    System.out.println("First element deleted!");
                    break;
                case 5:
                    intList = intList.delLast(intList);
                    System.out.println("Last element deleted!");
                    break;
                case 6:
                    System.out.print("Enter index to delete: ");
                    int idx2 = sc.nextInt();
                    intList = intList.delAtIndex(intList, idx2);
                    break;
                case 7:
                    intList = intList.reverse(intList);
                    System.out.println("List reversed!");
                    break;
                case 8:
                    intList.display(intList);
                    break;
                case 9:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (ch != 9);
    }
}
