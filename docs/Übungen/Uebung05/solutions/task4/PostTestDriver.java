/**
 * Test driver to test the <code>Post</code> class
 */
public class PostTestDriver {
	public static void main(String[] args) {
		Post[] posts = new Post[3];
		posts[0] = new Post("Hans", "It's a good time to program.");
		posts[1] = new Post("Herbert", "Good god, why does that always happen to me?");
		posts[2] = new Post("Toni", "Good luck with your studies.");

		Post.printPosts(posts);
		String wordToCount = "good";
		int count = Post.calculateDocumentFrequency(posts, wordToCount);
		System.out.println("Number of times the word \"" + wordToCount + "\" occured in all posts: " + count);
	}
}
