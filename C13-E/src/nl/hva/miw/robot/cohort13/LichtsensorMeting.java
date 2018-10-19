package nl.hva.miw.robot.cohort13;

import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;

public class LichtsensorMeting {

	private float intensiteit;
	private float kleur;
	private double R;
	private double G;
	private double B;
	private double oudeR;
	private double oudeG;
	private double oudeB;
	private EV3ColorSensor lichtSensor;

	public LichtsensorMeting(EV3ColorSensor lichtSensor) {
		super();
		this.lichtSensor = lichtSensor;
	}

	public void meetIntensiteit() {
		// zet sensor op RedMode (type meting voor lichtintensiteit)
		SampleProvider redMode = lichtSensor.getRedMode();
		// maak float array aan, deze is nodig om resultaat in op te slaan
		float[] sample = new float[redMode.sampleSize()];
		// haal een meting op en zet deze in de eerste index van de gemaakte sample
		// array
		redMode.fetchSample(sample, 0);
		// zet attribuut op laatste metingswaarde
		this.intensiteit = sample[0];
	}

	public float getIntensiteit() {
		return intensiteit;
	}

	public void meetKleur() {
		// zet sensor op RedMode (type meting voor kleurmeting)
		SampleProvider colorId = lichtSensor.getColorIDMode();
		// maak float array aan, deze is nodig om resultaat in op te slaan
		float[] sample = new float[colorId.sampleSize()];
		// haal een sample op
		colorId.fetchSample(sample, 0);
		// zet attribuut op laatste metingswaarde
		this.kleur = sample[0];
	}

	public void meetKleurRGB() {
		// zet sensor op RedMode (type meting voor kleurmeting)
		SampleProvider rgb = lichtSensor.getRGBMode();
		// maak float array aan, deze is nodig om resultaat in op te slaan
		float[] sample = new float[rgb.sampleSize()];
		// haal een sample op
		rgb.fetchSample(sample, 0);
		// zet attribuut op laatste metingswaarde
		this.R = afronden(sample[0]);
		this.G = afronden(sample[1]);
		this.B = afronden(sample[2]);
	}

	public double afronden(float onafgerond) {
		double onafgerondeDouble = (double) onafgerond;
		return (Math.round(onafgerondeDouble * 10) / 10.0);
	}

	public void nieuweMetingWordtOudeMeting() {
		this.oudeR = this.R;
		this.oudeG = this.G;
		this.oudeB = this.B;
	}
	
	public float getKleur() {
		return kleur;
	}

	public double getR() {
		return R;
	}

	public double getG() {
		return G;
	}

	public double getB() {
		return B;
	}

	public double getOudeR() {
		return oudeR;
	}

	public double getOudeG() {
		return oudeG;
	}

	public double getOudeB() {
		return oudeB;
	}
}
