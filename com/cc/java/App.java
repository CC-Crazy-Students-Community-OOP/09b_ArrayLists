package com.cc.java;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
		// ArrayList (AL) anlegen ...
			System.out.println( c( "#y" ) + "---ArrayList AL anlegen-----------------------------" );
			ArrayList<String> carMakers = new ArrayList<>();
			System.out.println( t( 1 ) + c( "#c" ) + "ArrayList: " + c( "#g" ) + carMakers );
			System.out.println( t( 1 ) + c( "#c" ) + "ArraySize: " + c( "#g" ) + carMakers.size() );
		
		// AL dynamisch füllen (JS --> push() / J --> add())
			System.out.println( "\n" + c( "#y" ) + "---AL dynamisch füllen------------------------------" );
			carMakers.add( "Volvo" );
			carMakers.add( "BMW" );
			carMakers.add( "Ford" );
			carMakers.add( "Honda" );
			carMakers.add( "Tesla" );

			System.out.println( t( 1 ) + c( "#c" ) + "ArrayList: " + c( "#g" ) + carMakers );
			System.out.println( t( 1 ) + c( "#c" ) + "ArraySize: " + c( "#g" ) + carMakers.size() );
		
		// Daten aus AL lesen
			System.out.println( "\n" + c( "#y" ) + "---Daten aus AL lesen-------------------------------" );
			System.out.println( t( 1 ) + c( "#c" ) + "ArrayEntry: " + c( "#g" ) + carMakers.get( 0 )) ;

		// Iteration 1
			System.out.println( "\n" + c( "#y" ) + "---Iteration 1--------------------------------------" );
			System.out.println( t( 1 ) + c( "#c" ) + "ArrayList: ");
			for ( int i = 0; i < carMakers.size(); i++ ) {
				System.out.print( t( 1 ) + c( "#g" ) + carMakers.get(i) + " " );
			}

		// Iteration 2
			System.out.println( "\n\n" + c( "#y" ) + "---Iteration 2--------------------------------------" );
			System.out.println( t( 1 ) + c( "#c" ) + "ArrayList: ");
			for ( String element : carMakers ) {
				System.out.print( t( 1 ) + c( "#g" ) + element + " " );
			}
		
		// Daten in AL ersetzen / Überschreiben
			System.out.println( "\n\n" + c( "#y" ) + "---Daten in AL ersetzen-----------------------------" );
			carMakers.set(1, "MB");
			System.out.println( t( 1 ) + c( "#c" ) + "ArrayList: " + c( "#g" ) + carMakers );
			System.out.println(t( 1 ) + c( "#r" ) + "---sortiert---------------------------------" );
			Collections.sort( carMakers );
			System.out.println( t( 1 ) + c( "#c" ) + "ArrayList: " + c( "#g" ) + carMakers );
			System.out.println( t( 1 ) + c( "#c" ) + "ArrayEntry: " + c( "#g" ) + carMakers.get( 0 ) );
		
		// AL leeren ...
			System.out.println( "\n" + c( "#y" ) + "---AL leeren----------------------------------------" );
			System.out.println( t( 1 ) + c( "#c" ) + "ArrayList: " + c( "#g" ) + carMakers );
			System.out.println(t( 1 ) + c( "#r" ) + "---carMakers.clear()------------------------" );
			carMakers.clear();
			System.out.println( t( 1 ) + c( "#c" ) + "ArrayList: " + c( "#g" ) + carMakers );
			
		// Thema: Wrapper ...
			System.out.println( "\n" + c( "#y" ) + "---Wrapper------------------------------------------" );
			// ArrayList<String> strList = new ArrayList<>();
			// ArrayList<int> intList = new ArrayList<>();		// Fehler, da hier die Klasse Integer verwendet werden muss

		// Lösung: Wrapper ...
			// int boo = 2;
			// Integer boo = 2;
			// System.out.println( t( 1 ) + c( "#c" ) + "ArraySize: " + c( "#g" ) + boo.intValue() );
			
			ArrayList<Integer> intList = new ArrayList<>();
			intList.add( 10 );
			intList.add( 11 );
			intList.add( 12 );
			
			System.out.println( t( 1 ) + c( "#c" ) + "ArrayList: " + c( "#g" ) + intList );
			System.out.println( t( 1 ) + c( "#c" ) + "ArraySize: " + c( "#g" ) + intList.size() );
		
			System.out.println( "\n" + c( "#y" ) + "---end of file--------------------------------------" );
	
	}
	// colored output
	public static String c( String c ) {
		switch ( c ) {
			case "#r": return "\u001b[31m";
			case "#g": return "\u001b[32m";
			case "#y": return "\u001b[33m";
			case "#b": return "\u001b[34m";
			case "#p": return "\u001b[35m";
			case "#c": return "\u001b[36m";
			default: return "\u001b[0m";
		}
	}
	public static String t( int t ) {
        switch ( t ) {
            case 1: return "\t";
            case 2: return "\t";
            case 3: return "\t\t\t";
            case 4: return "\t\t\t\t";
            default: return "";
        }
    }
}
