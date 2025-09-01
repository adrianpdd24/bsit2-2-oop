import java.util.*;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) return 0;
        int total = 0;
        for (int count : interactions) {
            total += count;
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
        int maxSize = 5;
        String[] hashtagArray = new String[maxSize];
        for (int i = 0; i < maxSize && i < hashtags.length; i++) {
            hashtagArray[i] = hashtags[i];
        }
        HashSet<String> uniqueSet = new HashSet<>();
        for (String tag : hashtagArray) {
            if (tag != null) uniqueSet.add(tag);
        }
        return new ArrayList<>(uniqueSet);
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        for (String post : posts) {
            Integer score = postEngagement.get(post);
            if (score != null && score > 500) {
                trending.add(post);
            }
        }
        return trending;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> uniqueAuthors = new HashSet<>();
        if (authors != null) {
            for (String author : authors) {
                if (author != null) uniqueAuthors.add(author);
            }
        }
        return uniqueAuthors;
    }

   
