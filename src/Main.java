 public static void main(String[] args) {
        PostManager pm = new PostManager();

        
        String postTitle = "Java Programming Tips";
        int engagement = pm.calculateEngagement(150, 75, 25);
        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
  
        ArrayList<String> posts = new ArrayList<>(Arrays.asList("Java Programming Tips", "Advanced Java Tutorial", "Spring Boot Guide"));
        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagement);
        postEngagement.put("Advanced Java Tutorial", 600);
        postEngagement.put("Spring Boot Guide", 950);
        String[] authorsArray = {"Alice", "Bob", "Alice", "Charlie", "Bob"};

       
        System.out.println("=== Social Media Post Manager ===");
        String category = pm.getCategoryRating(engagement);
        pm.displayPostStats(postTitle, engagement, category);

        System.out.println();
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        LinkedList<String> trendingPosts = pm.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trendingPosts);

        HashSet<String> uniqueAuthors = pm.getUniqueAuthors(authorsArray);
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
