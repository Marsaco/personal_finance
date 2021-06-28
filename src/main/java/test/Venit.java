package test;

public class Venit {

	private int id;
	private String name;
	private double valoare;

	public Venit(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setValoare(double valoare) {
		this.valoare = valoare;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValoare() {
		return valoare;
	}

	@Override
	public String toString() {
		return "Venit [id=" + id + ", name=" + name + ", valoare=" + valoare + "]";
	}

}
