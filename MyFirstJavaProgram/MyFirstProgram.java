    import java.util.Random;
    import java.util.Scanner;

    public class MyFirstProgram {
        // throws interruptedexception is needed for time of clearing the terminal
        public static void main(String[] args) throws InterruptedException {
            // ANSI codes for reset, colors, and clear
            String RESET = "\u001B[0m";
            String CLEAR_SCREEN = "\033[H\033[2J";

            // Setting a string for background and text colors
            String BG_BLUE = "\033[44m";
            String BG_RED = "\033[41m";
            String WHITE_TEXT = "\033[97m";
            String GREEN_TEXT = "\033[92m";
            String YELLOW_TEXT = "\033[93m";
            String CYAN_TEXT = "\033[96m";
            String INPUT_COLOR = "\033[95m"; // Purple input color

            // Clear screen and fill background with blue
            System.out.print(CLEAR_SCREEN);
            System.out.print(BG_BLUE);
            for (int i = 0; i < 50; i++) {
                System.out.println(" ".repeat(100));
            }
            System.out.print("\033[H"); // Move cursor back to top

            // Scanner for user input
            Scanner input = new Scanner(System.in);

            // Welcome message with colored text
            System.out.println(BG_BLUE + WHITE_TEXT + "Welcome to the program!" + RESET);
            System.out.print(BG_RED + YELLOW_TEXT + "Please enter your name: " + INPUT_COLOR); // Set input color
            String name = input.nextLine();
            System.out.print(RESET); // Reset after input

            // Apply background and text color explicitly for each line
            System.out.println(BG_BLUE + GREEN_TEXT + "Hi there " + name + "!" + RESET);
            System.out.println(BG_BLUE + CYAN_TEXT + "Thank you for opening this program!" + RESET);
            System.out.println(BG_BLUE + YELLOW_TEXT + "Current Java Version: " + System.getProperty("java.version") + RESET);

            // Array of fun facts, each line is has an index from 0-9 (since there is 10 line in the array)
            String[] funFacts = {
                "Java was originally called 'Oak' before being renamed.",
                "Over 3 billion devices run Java worldwide.",
                "Java's slogan is 'Write Once, Run Anywhere' (WORA).",
                "Minecraft was originally built using Java.",
                "Java was released in 1995 by Sun Microsystems.",
                "The name 'Java' was inspired by coffee from the Indonesian island of Java.",
                "Java uses automatic garbage collection for memory management.",
                "Android app development relies heavily on Java.",
                "Java and JavaScript are completely unrelated despite similar names.",
                "Java is one of the most popular programming languages in the world."
            };

            // Random fun fact with red background and yellow text
            Random random = new Random();
            int randomIndex = random.nextInt(funFacts.length);

            System.out.println(BG_RED + WHITE_TEXT + "Here's a fun fact about Java:" + RESET);
            // Would output 1 0f the funfacts there are in the array base on the index its choose random
            System.out.println(BG_RED + YELLOW_TEXT + funFacts[randomIndex] + RESET);
            System.out.println("This text will be cleared in 5 seconds...");
            Thread.sleep(5000); // Pause for 5 seconds
            // To clear the console
            System.out.print("\033[H\033[2J");
            System.out.flush();

            input.close();
        }
    }
