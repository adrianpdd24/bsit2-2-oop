import java.util.*;

public class PostManager {

    
    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) {
            return 0;
        }
        int total = 0;
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }

   
    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) {
            return "Viral";
        } else if (engagementScore >= 500) {
            return "Popular";
        } else if (engagementScore >= 100) {
            return "Good";
        } else if (engagementScore >= 50) {
            return "Low";
        } else {
            return "Poor";
        }
    }

    
    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    
    public ArrayList<String> manageHashtags(String[] hashtags) {
        ArrayList<String> uniqueHashtags = new ArrayList<>();
        if (hashtags == null) return uniqueHashtags;

        int maxSize = Math.min(hashtags.length, 5);
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < maxSize; i++) {
            if (hashtags[i] != null && seen.add(hashtags[i])) {
                uniqueHashtags.add(hashtags[i]);
            }
        }

        return uniqueHashtags;
    }

  
    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trendingPosts = new LinkedList<>();
        if (posts == null || postEngagement == null) return trendingPosts;

        for (String post : posts) {
            if (postEngagement.containsKey(post) && postEngagement.get(post) > 500) {
                trendingPosts.add(post);
            }
        }

        return trendingPosts;
    }

    
    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> uniqueAuthors = new HashSet<>();
        if (authors == null) return uniqueAuthors;

        for (String author : authors) {
            if (author != null) {
                uniqueAuthors.add(author);
            }
        }

        return uniqueAuthors;
    }
