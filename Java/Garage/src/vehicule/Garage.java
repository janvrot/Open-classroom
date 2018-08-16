package vehicule;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicule> voitures = new ArrayList<Vehicule>();

	public Garage() {

	}

	public String toString() {
		String str = "";
		File f = new File("garage.txt");
		if (f.exists() && !f.isDirectory()) {
			this.readFile();
			str += "Garage :\n";
			str += "*************************\n";
			for (Vehicule voiture : this.voitures) {
				str += "+ Voiture " + voiture.getMarque() + " : " + voiture.getNom();
				str += " " + voiture.getMoteur();
				str += voiture.getOptions();
				str += " d'une valeur de " + voiture.getPrix() + "€\n";
			}
		} else {
			str += "Garage :\n";
			str += "*************************\n";
			str += "Aucun vehicule trouve";				
		}
		return str;
	}

	public void addVoiture(Vehicule voit) {
		this.voitures.add(voit);
		this.writeFile();
	}

	public List<Vehicule> getVoitures() {
		return this.voitures;
	}

	private void writeFile() {

		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("garage.txt"))));

			for (Vehicule voiture : voitures) {
				oos.writeObject(voiture);
			}
			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readFile() {
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("garage.txt"))));
			addVoitureToGarage(ois);
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private List<Vehicule> addVoitureToGarage(ObjectInputStream ois) throws IOException {
		List<Vehicule> voitures = new ArrayList<Vehicule>();
		while (true) {
			try {
				try {
					voitures.add(((Vehicule) ois.readObject()));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			} catch (EOFException e) {
				this.voitures = voitures;
				return voitures;
			}
		}

	}

}
