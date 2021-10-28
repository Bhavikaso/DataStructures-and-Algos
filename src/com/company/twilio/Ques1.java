package com.company.twilio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ques1 {
	private static final Scanner scan = new Scanner(System.in);



	public static void main(String args[]) throws IOException {

		Pattern pattern = null;
		Matcher matcher;

		Pattern.compile("\\w*.gif.*[200]");

		String filename;
		filename = scan.nextLine();
		Path path = Paths.get(filename);
		BufferedReader reader = Files.newBufferedReader(path);

		Set<String> goodValues = new HashSet<>();

		String line = reader.readLine();
		while (line!=null){
			matcher=pattern.matcher(line);
			if(matcher.find()) {
				String value = line.substring(matcher.start(), matcher.end());
				goodValues.add(value);
			}
		}

		Pattern.compile("\\w*.gif");
		for (String s:goodValues) {
			matcher=pattern.matcher(s);
			if(matcher.find()){
				System.out.println(s.substring(matcher.start(), matcher.end()));
			}
		}





	}


}
