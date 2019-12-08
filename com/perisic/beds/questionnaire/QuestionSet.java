package com.perisic.beds.questionnaire;

import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.perisic.beds.peripherals.LoadingPanel;
import com.perisic.beds.peripherals.ShowImageFromURL;
import com.perisic.beds.rmiinterface.RemoteQuestions;
import com.sun.awt.AWTUtilities;
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
//			myQuestions.addQuestionToSurvey(questionDesc, option, status);
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
	 * Submit the edited question.
	 * @param i the question.
	 * @return 
	 */
	public Integer updateQuestionPane(String description, int quesId, Boolean status) { 
		Integer val = null;
		try {
			val = myQuestions.updateQuestionPane(description, quesId, status);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val; 
	}
	/**
	 * Submit the new question.
	 * @param i the question.
	 * @return 
	 */
	public Integer addQuestionToSurvey(String questionDesc, String option, Boolean status) { 
		Integer val = null;
		try {
			val = myQuestions.addQuestionToSurvey(questionDesc, option, status);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val; 
	}
	/** 
	 * Reports the answers in various ways. 
	 */
	public ArrayList<ArrayList<String>> reportAnswers() { 

		try {
			Answers myAnswers = new Answers(myQuestions.getData());

			System.out.println("Basic analysis:" + myAnswers);
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
//		JFrame f = new JFrame("Window");
//		f.setUndecorated(true);
//		f.setBounds(100, 100, 344, 450);
//		f.setLocationRelativeTo(null);
//		AWTUtilities.setWindowOpacity(f, 0.1f);
//		f.setOpacity(0.8f);
//		LoadingPanel imagePanel = new LoadingPanel();
//		JPanel jp = null;
//		try {
//			jp = imagePanel.LoadingPanel();
//		} catch (Exception ex) {
//			Logger.getLogger(LoadingPanel.class.getName()).log(Level.SEVERE, null, ex);
//		}
//		f.setContentPane(jp);
//		f.setBackground(new Color(0, 0, 0, 0)); // <-- THIS CAUSES FLICKERING
//            f.pack();
//		f.setVisible(true);
        return myQuestions.getSurveyAccess(username, pass);
    }
	
	public int createPaneUser( String currntUserName, String usrname, String pswd, boolean isSuper) throws RemoteException{
		JFrame f = new JFrame("Window");
		f.setUndecorated(true);
		f.setBounds(100, 100, 344, 450);
		f.setLocationRelativeTo(null);
		AWTUtilities.setWindowOpacity(f, 0.1f);
		f.setOpacity(0.8f);
		LoadingPanel imagePanel = new LoadingPanel();
		JPanel jp = null;
		try {
			jp = imagePanel.LoadingPanel();
		} catch (Exception ex) {
			Logger.getLogger(LoadingPanel.class.getName()).log(Level.SEVERE, null, ex);
		}
		f.setContentPane(jp);
		f.setBackground(new Color(0, 0, 0, 0)); // <-- THIS CAUSES FLICKERING
//            f.pack();
		f.setVisible(true);
        return myQuestions.createPaneUser(currntUserName, usrname, pswd, isSuper);
    }


}
