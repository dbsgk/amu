package airplane;

public class AirportDTO {
	private int id;
	private String name;
	private String country;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean equals(Object o) {
		if(o instanceof AirportDTO) {
			AirportDTO a = (AirportDTO)o;
			if(id== a.id) {
				return true;
			}
		}
		return false;
	}
}
