public class Express extends JNE {
	private String noPemesanan;
	private String jenis_Express;

	Express(String penerima, String pengirim, String alamat, String noHp, String asal, int totBerat, String tujuan,
			String noPemesanan, String jenis_Express) {
		super(penerima, pengirim, alamat, noHp, asal, tujuan, totBerat, noPemesanan);
		this.noPemesanan = noPemesanan;
		this.jenis_Express = jenis_Express;
	}

	public String getJenis_express() {
		return jenis_Express;
	}

	public String getnoPemesanan() {
		return noPemesanan;
	}

	// override method sama dengan isi berbeda *getCode pada JNE berbeda dengan
	// getCOde pada Express
	public String getCode() {
		generateCode();
		return ("EXP" + code);
	}

	// ini juga override dri method getOngkir yang di class jne
	public int getOngkir() {
		return totBerat * 20000;
	}

	// ini juga override dri method getJenis yang di class jne
	public String getJenis() {
		return "Express";
	}

}

// +" \nPengirim : "+getPengirim()+"\nAlamat : "+getAlamat()+" \nNo HP :
// "+getNoHp()+" \nAsal :"+getAsal()+"\n Tujuan : "+getTujuan()+"\nTotal Berat
// :"+getTotBerat()+"\nNo Pemesanan : "+getNoPemesanan()+"Jenis Pemesanan :
// "+getJenis_Express()