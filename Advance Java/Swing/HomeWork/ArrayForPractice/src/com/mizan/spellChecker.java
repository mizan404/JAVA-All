/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author mohdm
 */
public class spellChecker {
    public static void main(String[] args) throws IOException
	{
		URL url = new URL("http://andrew.cmu.edu/course/15-121/dictionary.txt");
		Scanner sc = new Scanner( url.openStream() );

		HashSet<String> dict =  new HashSet<String>();

		while( sc.hasNext() ) dict.add(sc.next());
		sc.close();

		sc = new Scanner( new File("Spellchecker.java") );
		while( sc.hasNextLine() )
		{
			String[] tokens = sc.nextLine().split("\\W");
			for(String token : tokens)
			   if (token.length() > 1 && !dict.contains(token.toLowerCase()))
			      System.out.println(token);
		}
	}
}
