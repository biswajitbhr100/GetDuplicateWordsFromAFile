package com.file;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class MyClass {
	private static void getWordOccr(String s){
		List<String> list = Arrays.asList(s.split("\\W+"));
		Set<String> uniq = new HashSet<>(list);
		for(String st : uniq){
			int c = Collections.frequency(list, st);
			if(c > 1){
				System.out.println(st + " : " + c);
			}
		}
	}
	private static void getDuplicateWords(String fileName){
		File file = null;
		BufferedReader reader = null;
		String s = "";
		String res = "";
		try{
			file = new File(fileName);
			reader = new BufferedReader(new FileReader(file));
			while((s = reader.readLine()) != null){
				res += s;
			}
			getWordOccr(res);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public static void main(String[] args){
		getDuplicateWords("E:/log.txt");
	}
}
