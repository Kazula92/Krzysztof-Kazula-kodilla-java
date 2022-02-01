package com.kodilla.testing.forum.statistics;

public class CalculatingStatistics {

    private int numberOfUsers = 0;
    private int numberOfPosts = 0;
    private int numberOfComments = 0;
    private int averageNumberOfPostsPerUser = 0;
    private int averageNumberOfCommentsPerUser = 0;
    int averageNumberOfCommentsPerPost = 0;

    public CalculatingStatistics() {
        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.averageNumberOfPostsPerUser = averageNumberOfPostsPerUser;
        this.averageNumberOfCommentsPerUser = averageNumberOfCommentsPerUser;
        this.averageNumberOfCommentsPerPost = averageNumberOfCommentsPerPost;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public int getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public int getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){

        numberOfUsers= statistics.usersNames().size();
        numberOfPosts= statistics.postsCount();
        numberOfComments= statistics.commentsCount();

        if(numberOfUsers > 0){
            averageNumberOfPostsPerUser = numberOfPosts/numberOfUsers;
            averageNumberOfCommentsPerUser = numberOfComments/numberOfUsers;
        }

        if(numberOfUsers < 0){
            averageNumberOfCommentsPerPost = numberOfComments/numberOfPosts;
        }
    }

    public void showStatistics(){

        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + averageNumberOfPostsPerUser);
        System.out.println("Average number of comments per user: " + averageNumberOfCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageNumberOfCommentsPerPost);
    }
}
