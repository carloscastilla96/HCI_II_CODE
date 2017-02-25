package info;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
import root.client.Main;
import setup.Pantalla;

public class AdministradorInfo {
	PApplet app = Pantalla.app;

	public static PImage PLAYER;

	public AdministradorInfo() {
		PLAYER = app.loadImage("");
	}

}
