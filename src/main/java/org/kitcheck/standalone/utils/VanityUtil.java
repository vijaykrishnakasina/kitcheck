package org.kitcheck.standalone.utils;

public class VanityUtil {

	public static int getKeyByCharacter(char ch) {
		int key = -1;
		switch(ch) {
		
		case 'a':
		case 'b':
		case 'c': key = 2; break;
		
		case 'd':
		case 'e':
		case 'f': key = 3; break;
		
		case 'g':
		case 'h':
		case 'i': key = 4; break;
		
		case 'j':
		case 'k':
		case 'l': key = 5; break;
		
		case 'm':
		case 'n':
		case 'o': key = 6; break;
		
		case 'p':
		case 'q':
		case 'r':
		case 's': key = 7; break;
		
		case 't':
		case 'u':
		case 'v': key = 8; break;
		
		case 'w':
		case 'x':
		case 'y': 
		case 'z': key = 9; break;
		
		
		}
		return key;
	}
}
