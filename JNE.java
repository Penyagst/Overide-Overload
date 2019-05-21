import java.util.Random;

class JNE {
	protected String penerima, pengirim, alamat, noHp, asal, tujuan, noPemesanan;
	protected int totBerat;
	protected String code;

	protected JNE() {
		this.penerima = "null";
		this.pengirim = "null";
		this.alamat = "null";
		this.noHp = "null";
		this.asal = "null";
		this.tujuan = "null";
		this.totBerat = 1;
		this.noPemesanan = "null";
	}

	// overload
	protected JNE(String penerima, String pengirim, String alamat, String noHp, String asal, String tujuan,
			int totBerat) {
		this.penerima = penerima;
		this.pengirim = pengirim;
		this.alamat = alamat;
		this.noHp = noHp;
		this.asal = asal;
		this.tujuan = tujuan;
		this.totBerat = totBerat;
	}

	// Overload constructor/method sama paramater beda
	protected JNE(String penerima, String pengirim, String alamat, String noHp, String asal, String tujuan,
			int totBerat, String noPemesanan) {
		this.penerima = penerima;
		this.pengirim = pengirim;
		this.alamat = alamat;
		this.noHp = noHp;
		this.asal = asal;
		this.tujuan = tujuan;
		this.totBerat = totBerat;
		this.noPemesanan = noPemesanan;
	}

	public String getPenerima() {
		return penerima;
	}

	public String getPengirim() {
		return pengirim;
	}

	public String getAlamat() {
		return alamat;
	}

	public String getNoHp() {
		return noHp;
	}

	public String getAsal() {
		return asal;
	}

	public String getTujuan() {
		return tujuan;
	}

	public int getTotBerat() {
		return totBerat;
	}

	public String getNoPemesanan() {
		return noPemesanan;
	}

	public int getOngkir() {
		return totBerat * 10000;
	}

	public void generateCode() {

		Random rand = new Random();
		String t = "";

		for (int i = 0; i < 10; i++) {
			int n = rand.nextInt(10);
			t += n;
		}
		code = t;
	}

	public String getCode() {
		generateCode();
		return ("REG" + code);
	}

	public String getJenis() {
		return "Reguler";
	}

	public String run1() {
		return ("Penerima\t: " + getPenerima() + "\nPengirim\t: " + getPengirim() + "\nAlamat\t\t: " + getAlamat()
				+ "\nNo HP\t\t: " + getNoHp() + "\nAsal\t\t: " + getAsal() + "\nTujuan\t\t: " + getTujuan()
				+ "\nTotal Berat\t: " + getTotBerat() + " Kg" + "\nNo Pemesanan\t: " + getCode()
				+ "\nJenis Pemesanan\t: " + getJenis() + "\nOngkos Kirim\t: " + getOngkir());
	}
}