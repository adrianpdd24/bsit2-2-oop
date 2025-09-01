 public static void main(String[] args) {
        PostManager manager = new PostManager();

       
        String postTitle = "Java Programming Tips";
        int likes = 150;
        int comments = 75;
        int shares = 25;

      
        int engagementScore = manager.calculateEngagement(likes, comments, shares);

     
        String category = manager.getCategoryRating(engagementScore);


        System.out.println("=== Displaying Post Stats ===");
        manager.displayPostStats(postTitle, engagementScore);
        System.out.println();
        manager.displayPostStats(postTitle, engagementScore, category);
        System.out.println();

       
        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);
        System.out.println("=== Unique Hashtags ===");
        for (String tag : uniqueHashtags) {
            System.out.println(tag);
        }
        System.out.println();

      
        ArrayList<String> posts = new ArrayList<>(Arrays.asList(
                "Java Programming Tips", "Python Basics", "Web Dev Guide", "AI in 2025"
        ));
        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagementScore);
        postEngagement.put("Python Basics", 1200);
        postEngagement.put("Web Dev Guide", 450);
        postEngagement.put("AI in 2025", 780);

        LinkedList<String> trendingPosts = manager.findTrendingPosts(posts, postEngagement);
        System.out.println("=== Trending Posts (Engagement > 500) ===");
        for (String trendingPost : trendingPosts) {
            System.out.println(trendingPost);
        }
        System.out.println();

      
        HashSet<String> uniqueAuthors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("=== Unique Authors ===");
        for (String author : uniqueAuthors) {
            System.out.println(author);
        }
    }
}
