package airplane2;

public class AirportViewer {
	AirportController airportController;
	
	public AirportViewer(AirportController airportController) {
		this.airportController = airportController;
		
	}
	public void showStart() {
		// TODO Auto-generated method stub
		for(AirportDTO a : airportController.selectAll()) {
			System.out.println(a.getId()+". "+a.getName());
		}
	}

	public void showEnd(int startAirportId) {
		for(AirportDTO a: airportController.selectAll())
			if(a.getId() != startAirportId) {
				System.out.println(a.getId()+". "+a.getName());
			}
	}

}
