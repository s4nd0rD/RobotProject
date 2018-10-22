package nl.hva.miw.robot.cohort13;

import lejos.hardware.lcd.GraphicsLCD;
import lejos.hardware.lcd.Image;

public class Scherm {

	private GraphicsLCD LCD;

	public Scherm(GraphicsLCD LCD) {
		this.LCD = LCD;
	}

	public void printSnuffel() {
		LCD.clear();
		System.out.println("Snuffel finish, druk op enter als ie klaarstaat");
	}

	public void printKlaarOmTeRijden() {
		LCD.clear();
		System.out.printf("Finish:\nR%.1f - G%.1f - B%.1f\nEnter als Fikkie klaar is om te rijden.", // **
				Finish.finishPassageMeting.getR(), Finish.finishPassageMeting.getG(),
				Finish.finishPassageMeting.getB());
	}

	public void printRondeTijd(String rondetijd) {
		LCD.clear();
		LCD.drawString(rondetijd, 100, 20, GraphicsLCD.BASELINE | GraphicsLCD.HCENTER);
	}

	public void printOgen() {

		Image ogen = new Image(134, 87, new byte[] {(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x80, (byte) 0xff, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x80, 
				(byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xf0, (byte) 0xff, 
				(byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0xf0, (byte) 0xff, (byte) 0x07, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0xfe, (byte) 0xff, (byte) 0x3f, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xfe, (byte) 0xff, 
				(byte) 0x3f, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x80, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x80, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xc0, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x01, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0xc0, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0xf0, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x07, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xf0, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x07, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0xf8, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x0f, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0xf8, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x0f, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xfc, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x1f, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x1f, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0xfe, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x3f, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xfe, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x3f, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x7f, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xe1, 
				(byte) 0x7f, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x7f, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0xff, 
				(byte) 0x7f, (byte) 0x80, (byte) 0x7f, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x80, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x07, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x80, 
				(byte) 0xff, (byte) 0xff, (byte) 0x3f, (byte) 0x00, (byte) 0xff, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xc0, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x03, (byte) 0xfe, (byte) 0x01, 
				(byte) 0x00, (byte) 0xc0, (byte) 0xff, (byte) 0xff, (byte) 0x1f, 
				(byte) 0x00, (byte) 0xfe, (byte) 0x01, (byte) 0x00, (byte) 0x00, 
				(byte) 0xc0, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x01, 
				(byte) 0xfc, (byte) 0x01, (byte) 0x00, (byte) 0xc0, (byte) 0xff, 
				(byte) 0xff, (byte) 0x0f, (byte) 0x00, (byte) 0xfc, (byte) 0x01, 
				(byte) 0x00, (byte) 0x00, (byte) 0xe0, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x00, (byte) 0xf8, (byte) 0x03, (byte) 0x00, 
				(byte) 0xe0, (byte) 0xff, (byte) 0xff, (byte) 0x0f, (byte) 0x00, 
				(byte) 0xfc, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0xe0, 
				(byte) 0xff, (byte) 0xff, (byte) 0x7f, (byte) 0x00, (byte) 0xf0, 
				(byte) 0x03, (byte) 0x00, (byte) 0xe0, (byte) 0xff, (byte) 0xff, 
				(byte) 0x07, (byte) 0x00, (byte) 0xf8, (byte) 0x03, (byte) 0x00, 
				(byte) 0x00, (byte) 0xf0, (byte) 0xff, (byte) 0xff, (byte) 0x7f, 
				(byte) 0x00, (byte) 0xf0, (byte) 0x07, (byte) 0x00, (byte) 0xf0, 
				(byte) 0xff, (byte) 0xff, (byte) 0x07, (byte) 0x00, (byte) 0xf8, 
				(byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0xf0, (byte) 0xff, 
				(byte) 0xff, (byte) 0x3f, (byte) 0x00, (byte) 0xe0, (byte) 0x07, 
				(byte) 0x00, (byte) 0xf0, (byte) 0xff, (byte) 0xff, (byte) 0x07, 
				(byte) 0x00, (byte) 0xf8, (byte) 0x07, (byte) 0x00, (byte) 0x00, 
				(byte) 0xf0, (byte) 0xff, (byte) 0xff, (byte) 0x3f, (byte) 0x00, 
				(byte) 0xe0, (byte) 0x0f, (byte) 0x00, (byte) 0xf0, (byte) 0xff, 
				(byte) 0xff, (byte) 0x07, (byte) 0x00, (byte) 0xf8, (byte) 0x0f, 
				(byte) 0x00, (byte) 0x00, (byte) 0xf8, (byte) 0xff, (byte) 0xff, 
				(byte) 0x3f, (byte) 0x00, (byte) 0xe0, (byte) 0x0f, (byte) 0x00, 
				(byte) 0xf8, (byte) 0xff, (byte) 0xff, (byte) 0x07, (byte) 0x00, 
				(byte) 0xf8, (byte) 0x0f, (byte) 0x00, (byte) 0x00, (byte) 0xf8, 
				(byte) 0xff, (byte) 0xff, (byte) 0x3f, (byte) 0x00, (byte) 0xe0, 
				(byte) 0x0f, (byte) 0x00, (byte) 0xf8, (byte) 0xff, (byte) 0xff, 
				(byte) 0x07, (byte) 0x00, (byte) 0xf8, (byte) 0x0f, (byte) 0x00, 
				(byte) 0x00, (byte) 0xf8, (byte) 0xff, (byte) 0xff, (byte) 0x3f, 
				(byte) 0x00, (byte) 0xe0, (byte) 0x0f, (byte) 0x00, (byte) 0xf8, 
				(byte) 0xff, (byte) 0xff, (byte) 0x07, (byte) 0x00, (byte) 0xf8, 
				(byte) 0x0f, (byte) 0x00, (byte) 0x00, (byte) 0xfc, (byte) 0xff, 
				(byte) 0xff, (byte) 0x3f, (byte) 0x00, (byte) 0xe0, (byte) 0x1f, 
				(byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xff, (byte) 0x0f, 
				(byte) 0x00, (byte) 0xfc, (byte) 0x1f, (byte) 0x00, (byte) 0x00, 
				(byte) 0xfc, (byte) 0xff, (byte) 0xff, (byte) 0x3f, (byte) 0x00, 
				(byte) 0xe0, (byte) 0x1f, (byte) 0x00, (byte) 0xfc, (byte) 0xff, 
				(byte) 0xff, (byte) 0x0f, (byte) 0x00, (byte) 0xfc, (byte) 0x1f, 
				(byte) 0x00, (byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xff, 
				(byte) 0x7f, (byte) 0x00, (byte) 0xf0, (byte) 0x1f, (byte) 0x00, 
				(byte) 0xfc, (byte) 0xff, (byte) 0xff, (byte) 0x1f, (byte) 0x00, 
				(byte) 0xfe, (byte) 0x1f, (byte) 0x00, (byte) 0x00, (byte) 0xfc, 
				(byte) 0xff, (byte) 0xff, (byte) 0x7f, (byte) 0x00, (byte) 0xf0, 
				(byte) 0x1f, (byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xff, 
				(byte) 0x3f, (byte) 0x00, (byte) 0xff, (byte) 0x1f, (byte) 0x00, 
				(byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x00, (byte) 0xf8, (byte) 0x1f, (byte) 0x00, (byte) 0xfc, 
				(byte) 0xff, (byte) 0xff, (byte) 0x7f, (byte) 0x80, (byte) 0xff, 
				(byte) 0x1f, (byte) 0x00, (byte) 0x00, (byte) 0xfc, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x00, (byte) 0xf8, (byte) 0x1f, 
				(byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xc1, (byte) 0xff, (byte) 0x1f, (byte) 0x00, (byte) 0x00, 
				(byte) 0xfc, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x03, 
				(byte) 0xfc, (byte) 0x1f, (byte) 0x00, (byte) 0xfc, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x1f, 
				(byte) 0x00, (byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x07, (byte) 0xff, (byte) 0x1f, (byte) 0x00, 
				(byte) 0xfc, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x1f, (byte) 0x00, (byte) 0x00, (byte) 0xfc, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x1f, (byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x1f, (byte) 0x00, 
				(byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x1f, (byte) 0x00, (byte) 0xfc, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x1f, (byte) 0x00, (byte) 0x00, (byte) 0xfc, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x1f, 
				(byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x1f, (byte) 0x00, (byte) 0x00, 
				(byte) 0xf8, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x0f, (byte) 0x00, (byte) 0xf8, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x0f, 
				(byte) 0x00, (byte) 0x00, (byte) 0xf8, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x0f, (byte) 0x00, 
				(byte) 0xf8, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x0f, (byte) 0x00, (byte) 0x00, (byte) 0xf8, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x0f, (byte) 0x00, (byte) 0xf8, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x0f, (byte) 0x00, 
				(byte) 0x00, (byte) 0xf8, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x0f, (byte) 0x00, (byte) 0xf8, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x0f, (byte) 0x00, (byte) 0x00, (byte) 0xf0, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x07, 
				(byte) 0x00, (byte) 0xf0, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x07, (byte) 0x00, (byte) 0x00, 
				(byte) 0xf0, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x07, (byte) 0x00, (byte) 0xf0, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x07, 
				(byte) 0x00, (byte) 0x00, (byte) 0xe0, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x03, (byte) 0x00, 
				(byte) 0xe0, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0xe0, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x03, (byte) 0x00, (byte) 0xe0, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x03, (byte) 0x00, 
				(byte) 0x00, (byte) 0xc0, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x01, (byte) 0x00, (byte) 0xc0, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0xc0, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x01, 
				(byte) 0x00, (byte) 0xc0, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x01, (byte) 0x00, (byte) 0x00, 
				(byte) 0x80, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x7f, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x7f, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0xfe, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x3f, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0xfe, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x3f, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xfc, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x1f, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x1f, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0xf8, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x0f, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xf8, 
				(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x0f, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xf0, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x07, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0xf0, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
				(byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0xe0, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x03, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xe0, (byte) 0xff, 
				(byte) 0xff, (byte) 0xff, (byte) 0x03, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0xff, (byte) 0xff, 
				(byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x80, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0xfe, (byte) 0xff, (byte) 0x3f, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xfe, (byte) 0xff, 
				(byte) 0x3f, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0xf8, (byte) 0xff, (byte) 0x0f, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0xf8, (byte) 0xff, (byte) 0x0f, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x80, 
				(byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0xff, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, });

		LCD.drawImage(ogen, 20, 20, GraphicsLCD.BASELINE | GraphicsLCD.HCENTER);
	}
}