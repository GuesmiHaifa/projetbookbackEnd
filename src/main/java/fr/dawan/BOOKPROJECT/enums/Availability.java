package fr.dawan.BOOKPROJECT.enums;

public enum Availability {

	AVAILABLE("Disponible"), UNAVAILABLE("Non disponible");

	private String availability;

	Availability(String availability) {
		this.availability = availability;
	}

	public String getUrl() {
		return availability;
	}
}
