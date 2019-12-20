
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Joueur {
	
	private String nom;
	private int numero;
	private int numeroPassage;
	private String couleur;
	private int position;
	private int positionDepart;
	private char orientation = 'S';
	private int points = 0;
	
	private ArrayList<String> deck = new  ArrayList<String>();
	private ArrayDeque<String> fileInstruction = new ArrayDeque<String>();
	
	private int fileInstructionMode = 0;
	private int nombreObstaclePierre = 3;
	private int nombreObstacleGlace = 2;
	
	//////////////////////////////
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumeroPassage() {
		return numeroPassage;
	}
	public void setNumeroPassage(int numeroPassage) {
		this.numeroPassage = numeroPassage;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getPositionDepart() {
		return positionDepart;
	}
	public void setPositionDepart(int positionDepart) {
		this.positionDepart = positionDepart;
	}
	public char getOrientation() {
		return orientation;
	}
	public void setOrientation(char orientation) {
		this.orientation = orientation;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
	public ArrayList<String> getDeck() {
		return deck;
	}
	public void setDeck(ArrayList<String> deck) {
		this.deck = deck;
	}
	public ArrayDeque<String> getFileInstruction() {
		return fileInstruction;
	}
	public void setFileInstruction(ArrayDeque<String> fileInstruction) {
		this.fileInstruction = fileInstruction;
	}
	
	
	public int getFileInstructionMode() {
		return fileInstructionMode;
	}
	public void setFileInstructionMode(int fileInstructionMode) {
		this.fileInstructionMode = fileInstructionMode;
	}
	public int getNombreObstaclePierre() {
		return nombreObstaclePierre;
	}
	public void setNombreObstaclePierre(int nombreObstaclePierre) {
		this.nombreObstaclePierre = nombreObstaclePierre;
	}
	public int getNombreObstacleGlace() {
		return nombreObstacleGlace;
	}
	public void setNombreObstacleGlace(int nombreObstacleGlace) {
		this.nombreObstacleGlace = nombreObstacleGlace;
	}
	
}
