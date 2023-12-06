package WEEK_9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("Cristiano Ronaldo","Forward","Right",10,38,20,1);
        FootballPlayer footballPlayer1 = new FootballPlayer("Lionel Messi","Forward","Left",10,36,20,0);
        BasketballPlayer basketballPlayer = new BasketballPlayer("Lebron James","Power Forward","Right",10,38,100,20);
        BasketballPlayer basketballPlayer1 = new BasketballPlayer("Stephen Curry","Point Guard","Right",18,35,29,5);
        footballPlayer.printPlayerInfo();
        basketballPlayer.printPlayerInfo();
        Team team = new Team();
        team.addFootballPlayer(footballPlayer);
        team.addFootballPlayer(footballPlayer1);
        team.addBasketballPlayer(basketballPlayer);
        team.addBasketballPlayer(basketballPlayer1);
        team.displayTeam();
    }
}

abstract class Player {
    private final String name;
    private final String position;
    private final int matchesPlayed;
    private final int age;

    protected Player (String name,String position,int matchesPlayed,int age){
        this.name = name;
        this.position = position;
        this.matchesPlayed = matchesPlayed;
        this.age = age;
    }

    protected void printPlayerInfo(){
        System.out.printf("Player Name: %s\nAge: %d\nPosition: %s\nMatches Played: %d\n",
                this.name,this.age,this.position,this.matchesPlayed);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getAge() {
        return age;
    }
}

class FootballPlayer extends Player {
    private final String foot;
    private final int goalScored;
    private final int yellowCards;

    public FootballPlayer(String name, String position, String foot, int matchesPlayed, int age, int goalScored, int yellowCards) {
        super(name, position, matchesPlayed, age);
        this.foot = foot;
        this.goalScored = goalScored;
        this.yellowCards = yellowCards;
    }

    public void printPlayerInfo(){
        System.out.printf("Player Name: %s\nAge: %d\nPosition: %s\nFoot: %s\nMatches Played: %d\nGoal Scored: %d\nYellow Cards: %d\n",
                this.getName(),this.getAge(),this.getPosition(),this.foot,this.getMatchesPlayed(),this.goalScored,this.yellowCards);
    }

    @Override
    public String toString() {
        return String.format("FootballPlayer: Name=%s, Age=%d, Position=%s, Foot=%s, Matches Played=%d, Goal Scored=%d, Yellow Cards=%d",
                this.getName(), this.getAge(), this.getPosition(), this.foot, this.getMatchesPlayed(), this.goalScored, this.yellowCards);
    }
}

class BasketballPlayer extends Player {
    private final String shoots;
    private final int points;
    private final int rebounds;

    public BasketballPlayer(String name, String position, String shoots, int matchesPlayed, int age, int points, int rebounds) {
        super(name, position, matchesPlayed, age);
        this.shoots = shoots;
        this.points = points;
        this.rebounds = rebounds;
    }

    @Override
    public String toString() {
        return String.format("BasketballPlayer: Name=%s, Age=%d, Position=%s, Shoots=%s, Matches Played=%d, Points=%d, Rebounds=%d",
                this.getName(), this.getAge(), this.getPosition(), this.shoots, this.getMatchesPlayed(), this.points, this.rebounds);
    }

    public void printPlayerInfo(){
        System.out.printf("Player Name: %s\nAge: %d\nPosition: %s\nShoots: %s\nMatches Played: %d\nPoints: %d\nRebounds: %d\n",
                this.getName(),this.getAge(),this.getPosition(),this.shoots,this.getMatchesPlayed(),this.points,this.rebounds);
    }
}

class Team {
    private final ArrayList<Object> footballPlayers = new ArrayList<Object>();
    private final ArrayList<Object> basketballPlayers = new ArrayList<Object>();

    public void addFootballPlayer (Object player){
        footballPlayers.add(player);
    }

    public void addBasketballPlayer (Object player){
        basketballPlayers.add(player);
    }

    public void displayTeam (){
        System.out.println("Football Players:");
        for (Object footballPlayer : footballPlayers){
            System.out.println(footballPlayer);
        }
        System.out.println("Basketball Players:");
        for (Object basketballPlayer: basketballPlayers){
            System.out.println(basketballPlayer);
        }
    }


}