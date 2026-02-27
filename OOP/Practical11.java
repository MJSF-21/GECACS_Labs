import java.util.*;

public class Practical11 {

    public static void main(String[] args) {

        int ch, element, position;
        LinkedList<Integer> dblList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Insert element at beginning");
        System.out.println("2. Insert element at end");
        System.out.println("3. Insert element at position");
        System.out.println("4. Delete a given element");
        System.out.println("5. Display elements in the list");
        System.out.println("6. Exit");

        do {
            System.out.print("\nChoose your choice (1 - 6): ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter element to insert at beginning: ");
                    element = sc.nextInt();
                    dblList.addFirst(element);
                    System.out.println("Successfully Inserted");
                    break;

                case 2:
                    System.out.print("Enter element to insert at end: ");
                    element = sc.nextInt();
                    dblList.addLast(element);
                    System.out.println("Successfully Inserted");
                    break;

                case 3:
                    System.out.print("Enter position to insert element: ");
                    position = sc.nextInt();

                    if (position >= 0 && position <= dblList.size()) {
                        System.out.print("Enter element: ");
                        element = sc.nextInt();
                        dblList.add(position, element);
                        System.out.println("Successfully Inserted");
                    } else {
                        System.out.println("Enter position between 0 and " + dblList.size());
                    }
                    break;

                case 4:
                    System.out.print("Enter element to remove: ");
                    element = sc.nextInt();

                    if (dblList.contains(element)) {
                        dblList.remove(Integer.valueOf(element));
                        System.out.println("Successfully Deleted");

                        System.out.println("Elements after deletion:");
                        for (Integer val : dblList) {
                            System.out.print(val + " <-> ");
                        }
                        System.out.println("NULL");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;

                case 5:
                    System.out.println("Elements in the list:");
                    for (Integer val : dblList) {
                        System.out.print(val + " <-> ");
                    }
                    System.out.println("NULL");
                    break;

                case 6:
                    System.out.println("Program terminated");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (ch != 6);

        sc.close();
    }
}