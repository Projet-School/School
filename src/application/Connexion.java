package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

public class Connexion {
	private String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
	private String login = "root";
	private String passwd = "";
	//private String passwd = "d";
	protected static Connection cn = null;
	private Statement st = null;
	
	public Connexion(Connection cn) {
		this.cn = cn;
	}

	// méthode pour se connecter à la base de données
	public void connect() {
		try {
			//Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			//Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException f) {
			f.printStackTrace();
		} 
	}
	
	public static Connection getConnection() {
		return cn;
	}
	
	public void close() {
		try {
			//Etape 3 : libérer ressources de la mémoire
			cn.close();
			st.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Permet de récupérer le statut d'une personne
	public String statut(String login) {
		connect();
		String statut = null;;
		ResultSet rs = null;
		try {
			String sql = "SELECT statut FROM connexion WHERE login = ?";
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
			ps.setString(1, login);
			rs = ps.executeQuery();
			while (rs.next()) {
				statut = rs.getString("statut");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return statut;
	}
	
	//Permet de récupérer l'id de connexion (auto implémenté par la bd) d'une personne
	public String id(String login) {
		connect();
		String id = null;;
		ResultSet rs = null;
		try {
			String sql = "SELECT IdConnexion FROM connexion WHERE login = ?";
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
			ps.setString(1, login);
			rs = ps.executeQuery();
			while (rs.next()) {
				id = rs.getString("IdConnexion");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return id;
	}
	
	//Permet de récupérer les informations d'une personne gràce à son login
	public ArrayList<String> info(String login) {		
		connect();
		ResultSet rs = null;
		ResultSet rs2 = null;
		ArrayList<String> info = new ArrayList<String>();
		String statut = null;
		String i = null;
		String sql2 = "";
		int cpt = 1;
		int max;
		try {
			String sql = "SELECT idConnexion, statut FROM connexion WHERE login = ?";
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
			ps.setString(1, login);
			rs = ps.executeQuery();
			while (rs.next()) {
				statut = rs.getString("statut");
				i = rs.getString("idConnexion");
			}
			if(statut.equals("enseignant") || statut.equals("Enseignant")) {
				sql2 = "SELECT * FROM enseignant WHERE Id_Connexion = ?";
				max = 7;
			}
			else {
				sql2 = "SELECT * FROM etudiant WHERE Id_Connexion = ?";
				max = 4;
			}
			PreparedStatement ps2 = (PreparedStatement) cn.prepareStatement(sql2);
			ps2.setString(1, i);
			rs2 = ps2.executeQuery();
			while (rs2.next()) {
				while(cpt <= max){
					info.add(rs2.getString(cpt));
					cpt++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return info;			
	}
}
