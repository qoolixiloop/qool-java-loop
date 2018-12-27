package addressbook;

public class Main {
	
	public static void main(String[] args) {
		
		// checking whether any arguments have been passed (from command line)
		if(args.length > 0) {
			if(args[0].equals("--cli")) {
				runCLI();
			} else {
				printUsage();
			}
		} else {
			runGUI();
		}
	}

	private static void runCLI() {
		// creating an instance of the command line interface and pass a new address book object
		CommandLineInterface cli = new CommandLineInterface(new AddressBook(1));
		// run the interface
		cli.run();
	}
	
	private static void runGUI() {
		// TODO Start Graphical User Interface here.
		System.out.println("Not yet implemented.");
	}

	private static void printUsage() {
		System.out.println("Usage: java Main <options>\nOptions:\n\t--cli\truns the command line interface\n\t--gui\truns the graphical user interface (default)");
	}
}
