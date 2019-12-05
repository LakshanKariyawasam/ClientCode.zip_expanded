package com.perisic.beds.questionnaire;

import java.io.UnsupportedEncodingException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;

import com.perisic.beds.peripherals.ShowImageFromURL;
import com.perisic.beds.rmiinterface.RemoteQuestions;
/**
 * Represents the questionnaire locally. All requests from peripherals will be 
 * through this class. 
 * @author Marc Conrad
 *
 */
public class QuestionSet {

	RemoteQuestions myQuestions; 
	/**
	 * Retrieves the questions from the server. 
	 * To do: connect to different servers, make configurable. 
	 */
	public QuestionSet() {
		super();
		try {
			myQuestions =   (RemoteQuestions) Naming.lookup("rmi://localhost/quizepathservice");
		} catch (Exception e) {
			System.out.println("A problem occured: "+e.toString());
			e.printStackTrace();
			System.out.println("Is your server running?");
		} 
	}
	/**
	 * How many questions are there in the questionnaire?
	 * @return number of questions.
	 */

	public int numberOfQuestions() { 
		try {
			return myQuestions.getNumberOfQuestions();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0; 
		} 
	}
	/**
	 * Retrieve a specific question. 		
	 * @param i the number of the question.
	 * @return text of the question. 
	 */
	public String getQuestion(int i) { 
		try {
			return myQuestions.getQuestion(i).getQuestionText();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "no connection to server"; 
		} 
	}
	/** 
	 * Gives a set of options for this question. 
	 * @param i the number of the question.
	 * @return an array of options. 
	 */
	public String [] getOptions(int i) { 
		try {
			return myQuestions.getQuestion(i).getAnswers();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		} 
	}
	/**
	 * Submit the answer to a given question.
	 * @param i the question.
	 * @param answer the chosen answer.
	 */
	public void submitAnswer(int i, String answer) { 
		try {
			myQuestions.submitAnswer(i, answer);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	/** 
	 * Reports the answers in various ways. 
	 */
	public ArrayList<ArrayList<String>> reportAnswers() { 

		try {
			Answers myAnswers = new Answers(myQuestions.getData());

			System.out.println("Basic analysis:");
			System.out.println(myAnswers.getJSON());

//			ShowImageFromURL.show(myAnswers.getBarChartURL());
			
			return myAnswers.getJSON();
		} catch (RemoteException e) {
			System.out.println("Something went wrong: "+e.toString());
			e.printStackTrace();
			return null;  
		}
		
	}
	
	
	public boolean getSurveyAccess( String username, String pass) throws RemoteException{
        return myQuestions.getSurveyAccess(username, pass);
    }


}
