public class Studenti {
	int id;
	String emri, mbiemri;
	int[] notat;
	public Studenti(int id, String emri, String mbiemri, int[]notat) {
		this.emri = emri;
		this.id=id;
		this.mbiemri= mbiemri;
		this.notat = notat;
	}

	public double notaMesatare() {
		double sum = 0.0;
		for (int i = 0; i < notat.length; i++) {
			sum += notat[i];
		}

		return sum / notat.length;
	}

	public void shtypDetajet() {
		System.out.printf("%d-%s-%s-%f", id, emri, mbiemri, notaMesatare());
	}

	public int notaMax() {
		int max = notat[0];
		for (int i = 0; i < notat.length; i++) {
			if (notat[i] > max) {
				max = notat[i];
			}
		}
		return max;
	}
	
	public int notaMin() {
		int min = notat[0];
		for (int i = 0; i < notat.length; i++) {
			if (notat[i] < min) {
				min = notat[i];

			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int []notat = {1,2,3,4,5};
		Studenti student = new Studenti(12, "Endrit", "Gjokaj", notat);
		System.out.println("Nota mesatare: "+student.notaMesatare());
		System.out.println("Nota maksimale: "+student.notaMax());
		System.out.println("Nota minimale: "+student.notaMin());

	}
}
