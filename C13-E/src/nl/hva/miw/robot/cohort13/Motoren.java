package nl.hva.miw.robot.cohort13;

import lejos.hardware.BrickFinder;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.utility.Delay;
import lejos.robotics.RegulatedMotor;
import lejos.hardware.motor.*;
import lejos.hardware.port.*;

public class Motoren {

	private int motorSpeedA;
	private int motorSpeedB;
	private int kleurXpassage = 0;
	private final double RICHT_INTENSITEIT = 0.50;
	private LichtsensorMeting meting = new LichtsensorMeting();
	private int oudeKleurMeting;
	private int nieuweKleurMeting = 2;
	private Tijdswaarneming tijdswaarneming = new Tijdswaarneming();

	GraphicsLCD LCD = BrickFinder.getDefault().getGraphicsLCD();
	static RegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.A);
	static RegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.B);

	void moveRobotFwd() {

		// Display on robot screen
		LCD.clear();
		LCD.drawString("Fikkie apport!", 100, 20, GraphicsLCD.BASELINE | GraphicsLCD.HCENTER);

		while (kleurXpassage < 2) {
			this.setKleurXpassage();
			meting.meetIntensiteit();
			zetMotorSnelheid(meting.getIntensiteit());
			vooruitRijden();
			if (kleurXpassage == 1) {
				tijdswaarneming.startStopwatch();
			}
		}
		tijdswaarneming.stopStopwatch();
		leftMotor.stop();
		rightMotor.stop();
		LCD.clear();
		LCD.drawString(tijdswaarneming.toString(), 100, 20, GraphicsLCD.BASELINE | GraphicsLCD.HCENTER);
		Delay.msDelay(20000);
		// toevoegen SFX
	}

	/**
	 * Deze methode hoogt de aantal passages op als een niet zwarte haakse lijn
	 * wordt gepasseerd. Methode finishkleur wordt aangeroepen om te bepalen of een
	 * gemeten kleur een meting is die niet zwart, wit of undefined is. van de float
	 * die terugkomt van de kleurmeting is een int gemaakt via casting.
	 */
	private void setKleurXpassage() {
		this.oudeKleurMeting = this.nieuweKleurMeting;
		meting.meetKleur();
		this.nieuweKleurMeting = (int) meting.getKleur();
		boolean oudeKleurMetingFinish = this.finishkleur(oudeKleurMeting);
		boolean nieuweKleurMetingFinish = this.finishkleur(nieuweKleurMeting);

		if (oudeKleurMetingFinish && !nieuweKleurMetingFinish) {
			kleurXpassage++;
			System.out.println("kleurpassage");
		}
	}

	private boolean finishkleur(int kleur) {
		if (kleur == 2 || kleur == 6 || kleur == 7) {
			return false;
		} else
			return true;

		// Meetresultaten kleurcoderingen:
		// zwart 7
		// rood 0
		// wit 6
		// grens zwart/wit 2
	}
	private void zetMotorSnelheid(float lichtIntensiteit) {
		// scherpbocht naar links
		if (lichtIntensiteit > 0.9 || lichtIntensiteit < 0.1) {
			draaiOpDePlek(lichtIntensiteit);
		}
		// flauwe bocht naar links
		else if (lichtIntensiteit > this.RICHT_INTENSITEIT) {
			this.motorSpeedA = 100;
			this.motorSpeedB = 200;
		}
		// flauwe bocht naar rechts
		else if (lichtIntensiteit < this.RICHT_INTENSITEIT) {
			this.motorSpeedA = 200;
			this.motorSpeedB = 100;
		}
	}

	public void vooruitRijden() {
		leftMotor.setSpeed(motorSpeedA);
		rightMotor.setSpeed(motorSpeedB);
		leftMotor.backward();
		rightMotor.backward();
		Delay.msDelay(100);
	}

	public void draaiOpDePlek(float lichtIntensiteit) {
		if (lichtIntensiteit > 0.9) {
			this.motorSpeedA = 0;
			this.motorSpeedB = 200;
			leftMotor.setSpeed(motorSpeedA);
			rightMotor.setSpeed(motorSpeedB);
			leftMotor.forward();
			rightMotor.backward();
			Delay.msDelay(50);
			moveRobotFwd();
		} else {
			this.motorSpeedA = 200;
			this.motorSpeedB = 0;
			leftMotor.setSpeed(motorSpeedA);
			rightMotor.setSpeed(motorSpeedB);
			leftMotor.backward();
			rightMotor.forward();
			Delay.msDelay(50);
			moveRobotFwd();
		}
	}
}
