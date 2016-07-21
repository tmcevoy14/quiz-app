
package com.tmm.android.chuck.quiz;

import java.util.ArrayList;
import java.util.List;

import com.tmm.android.chuck.Player;

//this class represents the current game being played
//tracks the score and player details

public class GamePlay {
	
	private int numRounds;
	private int difficulty;
	private String playerName;
	private int right;
	private int wrong;
	private int round;
	private int QuizNum;
	public int count=0;
	
	
	private List<Question> questions = new ArrayList<Question>();
	private List<Player>players= new ArrayList<Player>();
	
	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	/**
	 * @return the right
	 */
	public int getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(int right) {
		this.right = right;
	}
	/**
	 * @return the wrong
	 */
	public int getWrong() {
		return wrong;
	}
	/**
	 * @param wrong the wrong to set
	 */
	public void setWrong(int wrong) {
		this.wrong = wrong;
	}
	
	
	/**
	 * @return the round
	 */
	public int getRound() {
		return round;
	}
	/**
	 * @param round the round to set
	 */
	public void setRound(int round) {
		this.round = round;
	}
	
	public int getQuizNum(){
		return QuizNum;
	}
	
	public void setQuizNum(int QuizNum){
		this.QuizNum=QuizNum;
	}
	/**
	 * @param difficulty the difficulty to set
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	/**
	 * @return the difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}
	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	/**
	 * @param q the question to add
	 */
	public void addQuestions(Question q) {
		this.questions.add(q);
	}
	
	/**
	 * @return the questions
	 */
	public List<Question> getQuestions() {
		return questions;
	}
	
	
	public Question getNextQuestion(){
		
		//get the question
		Question next = questions.get(this.getRound());
		//update the round number to the next round
		this.setRound(this.getRound()+1);
		return next;
	}
	
	public List<Player> getPlayers(){
		return players;
	}
	
	
	
	//maybe????
	public int getNextQuiz(){
		int NextQuiz=this.getQuizNum();
		this.setQuizNum(this.getQuizNum()+1);
		return NextQuiz;
	}
	
	/**
	 * method to increment the number of correct answers this game
	 */
	public void incrementRightAnswers(){
		right ++;
	}
	
	/**
	 * method to increment the number of incorrect answers this game
	 */
	public void incrementWrongAnswers(){
		wrong ++;
	}
	
	public void setNumRounds(int numRounds) {
		this.numRounds = numRounds;
	}
	
	public int getNumRounds() {
		return numRounds;
	}
	

	public int updateCount(int count){
		count=count+1;
		return count;
		
	}
	
	//method that checks if the game is over
	//@return boolean
	 
	public boolean isGameOver(){
		return (getRound() >= getNumRounds());
	}
	
	public int getTotal() {
		int total=0;
		total=total+(this.getRound())+1;
		return total;
	}
}
