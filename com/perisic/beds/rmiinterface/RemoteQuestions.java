package com.perisic.beds.rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

/**
 * RMI interface to enable to retrieve questions from the server and to submit
 * data to the server.
 * 
 * @author Marc Conrad
 *
 */
public interface RemoteQuestions extends Remote {
	/**
	 * Number of questions on the server.
	 * 
	 * @return
	 * @throws RemoteException
	 */
	public int getNumberOfQuestions() throws RemoteException;

	/**
	 * Retrieve specific question from the server.
	 * 
	 * @param i number of the question.
	 * @return the Question.
	 * @throws RemoteException
	 */
	public Question getQuestion(int i) throws RemoteException;

	/**
	 * Submit the answer to the question number i.
	 * 
	 * @param i      question where the answer belongs to.
	 * @param answer the answer given to this question.
	 * @throws RemoteException
	 */
	void submitAnswer(int i, String answer) throws RemoteException;

	/**
	 * Returns the answers to the questions given.
	 * 
	 * @return answers to the questions.
	 * @throws RemoteException
	 */
	Integer updateQuestionPane(String description, int quesId, Boolean status) throws RemoteException;

	/**
	 * Update the question number i.
	 * 
	 * @param i question where the answer belongs to.
	 * @return
	 * @throws RemoteException
	 */
	public Vector<Question> getData() throws RemoteException;

	public boolean getSurveyAccess(String username, String pass) throws RemoteException;
	
	/**
	 * @param questionDesc
	 * @param option
	 * @param status
	 * @return
	 * @throws RemoteException
	 */
	Integer addQuestionToSurvey(String questionDesc, String option, Boolean status) throws RemoteException;


	public Integer createPaneUser(String currntUserName, String usrname, String pswd, boolean isSuper) throws RemoteException;
	
}
