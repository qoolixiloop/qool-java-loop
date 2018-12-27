import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class TodoList {

  private static void printTodos(List<String> todos) {
    System.out.println();
    System.out.println("Todos:");
    for (int i = 0; i < todos.size(); i++) {
      System.out.println((i+1) + ": " + todos.get(i));
    }
    System.out.println();
  }

  public static void main(String[] args) {
    List<String> todos = new ArrayList<String>();
    System.out.println("Enter '!quit' to exit");
    System.out.println("Enter '!rm <todo #>' to remove an item");

    Scanner keyboard = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a todo: ");
      String next = keyboard.nextLine( );

      if (next.equals("!quit")) { break; }
      if (next.startsWith("!rm")) {
        int index = Integer.parseInt(next.substring(4));
        todos.remove(index-1);
      }
      else {
        todos.add(next);
      }
      printTodos(todos);
    }

  }
}

