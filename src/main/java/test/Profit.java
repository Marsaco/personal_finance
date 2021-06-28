package test;

public class Profit {

	private Venit venit;
	private Cheltuiala cheltuiala;
	private double profit;

	public Venit getVenit() {
		return venit;
	}

	public void setVenit(Venit venit) {
		this.venit = venit;
	}

	public Cheltuiala getCheltuiala() {
		return cheltuiala;
	}

	public void setCheltuiala(Cheltuiala cheltuiala) {
		this.cheltuiala = cheltuiala;
	}

	public double getProfit() {
		return this.venit.getValoare() - this.cheltuiala.getValoare();
	}

	@Override
	public String toString() {
		return "Profit [venit=" + venit + ", cheltuiala=" + cheltuiala + ", profit=" + profit + "]";
	}

}
