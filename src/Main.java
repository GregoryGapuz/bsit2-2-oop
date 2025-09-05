import java.util.*;

public class PostManager {

    private String postTitle;
    private int engagementScore;
    private String category;

    private List<String> hashtags;
    private List<String> trendingPosts;
    private Set<String> uniqueAuthors;

    public PostManager(String postTitle, int engagementScore, String category,
                       String[] hashtagsArray, String[] trendingPostsArray, String[] authorsArray) {
        this.postTitle = postTitle;
        this.engagementScore = engagementScore;
        this.category = category;

        this.hashtags = new ArrayList<>(Arrays.asList(hashtagsArray));
        this.trendingPosts = new ArrayList<>(Arrays.asList(trendingPostsArray));
        this.uniqueAuthors = new HashSet<>(Arrays.asList(authorsArray));
    }

    public void displayPostDetails() {
        System.out.println("=== Social Media Post Manager ===");
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
        System.out.println();
        System.out.println("Unique Hashtags: " + hashtags);
        System.out.println("Trending Posts: " + trendingPosts);
        System.out.println("Unique Authors: " + uniqueAuthors);
    }

    public static void main(String[] args) {
        String[] hashtags = {"#java", "#coding", "#programming", "#tips"};
        String[] trending = {"Advanced Java Tutorial", "Spring Boot Guide"};
        String[] authors = {"Alice", "Bob", "Charlie", "Alice"};

        PostManager manager = new PostManager("Java Programming Tips", 250, "Good",
                                              hashtags, trending, authors);
        manager.displayPostDetails();
    }
}

