import java.util.Scanner;

public class DriverScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Game> gameQueue = new Queue<>();

        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the game name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the game price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    Game game = new Game(name, price);
                    gameQueue.add(game);
                    print("Game added to the queue.");
                    print("");
                    break;
                case 2:
                    if (gameQueue.isEmpty()) {
                        print("The queue is empty.");
                    } else {
                        Game polledGame = gameQueue.poll();
                        print("Polled game: " + polledGame);
                    }
                    print("");
                    break;
                case 3:
                    if (gameQueue.isEmpty()) {
                        print("The queue is empty.");
                    } else {
                        Game peekedGame = gameQueue.peek();
                        print("Peeked game: " + peekedGame);
                    }
                    print("");
                    break;
                case 4:
                    print("The queue is " + (gameQueue.isEmpty() ? "empty" : "not empty"));
                    print("");
                    break;
                case 5:
                    print("Size of the queue: " + gameQueue.size());
                    print("");
                    break;
                case 6:
                    System.out.print("Enter the game name to check: ");
                    String gameNameToCheck = scanner.nextLine();
                    Game gameToCheck = new Game(gameNameToCheck, 0.0);
                    boolean contains = gameQueue.contains(gameToCheck);
                    print("The queue " + (contains ? "contains" : "does not contain") + " the game.");
                    print("");
                    break;
                case 7:
                    print("Exiting App...");
                    break;
                default:
                    print("Invalid choice. Try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void displayMenu() {
        print("\nQueue Menu:");
        print("1. Add a game");
        print("2. Poll a game");
        print("3. Peek at the front game");
        print("4. Check if the queue is empty");
        print("5. Get the size of the queue");
        print("6. Check if the queue contains a game");
        print("7. Exit");
        System.out.print("Enter your choice: ");
        print("");
    }
    public static void print(String s) {
        System.out.println(s);
    }
}