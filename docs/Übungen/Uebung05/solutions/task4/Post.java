/**
 * Class represents a post in e.g. a social network or forum.
 *
 */
public class Post {
	/** serves as an id generator for each newly generated post */
	private static int idCounter = 0;
	/** the actual id of the post */
	private int id;
	/** the user that submitted the post */
	private String userName;
	/** the actual message submitted through the post */
	private String message;

	/**
	 * Constructor of a new post that assigns a new id using the idCounter static variable which is then incremented.
	 * 
	 * @param userName
	 *            the user who posted the post
	 * @param message
	 *            the message the user posted
	 */
	public Post(String userName, String message) {
		this.id = idCounter++;
		this.userName = userName;
		this.message = message;
	}

	/**
	 * Counts the number of times the word specified by <code>word</code> occurs in the messages of a number of posts specified by <code>posts</code>
	 * 
	 * @param posts
	 *            posts to search and count <code>word</code>
	 * @param word
	 *            the word to search the <code>posts</code> messages
	 * @return the number of times <code>word</code> occurred in the messages of <code>posts</code>
	 */
	public static int calculateDocumentFrequency(Post[] posts, String word) {
		int wordOccurrences = 0;
		for (Post post : posts) {
			String[] postWords = post.getMessage().split(" ");
			for (String postWord : postWords) {
				if (postWord.equalsIgnoreCase(word)) {
					wordOccurrences++;
				}
			}
		}
		return wordOccurrences;
	}

	/**
	 * prints a number of posts given as array parameter in <code>posts</code> to the screen
	 * 
	 * @param posts
	 *            the posts to be printed to the screen
	 */
	public static void printPosts(Post[] posts) {
		for (Post post : posts) {
			System.out.println(post.getId() + ": " + post.getUserName() + " writes: \"" + post.getMessage() + "\"");
		}
	}

	// Below follow getter and setter methods

	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
