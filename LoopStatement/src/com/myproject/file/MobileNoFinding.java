package com.myproject.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoFinding {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MobileNoFinding mf=new MobileNoFinding();
		//mf.findMobileNo();
		//mf.findAllMobileNo();
		mf.findAllMobileNo2();
	}
	private void findAllMobileNo2() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/mobile");
		//BufferedReader br=new BufferedReader(fr);
		File[] list=f.listFiles();
		//String mobile="";
		String[] mle=new String[list.length];
		System.out.println(list.length);
		int count=0;
		for(File l:list) {
			for(int i=0;i<mle.length;i++) {
				String mobile="";
			if(l.isFile()) {
				FileReader fr=new FileReader(l);
				int read=fr.read();
				while(read!=-1) {
					 char ch=(char)read;
					 mobile=mobile+ch;
					 mle[i]=mobile;
					//System.out.print(ch);
					read=fr.read();
				}
				Pattern pat=Pattern.compile("(0|91)?[6-9][0-9]{9}");
				Matcher mat=pat.matcher(mobile);
				while(mat.find()) {
					mobile=mat.group();
				}
				count++;
				//System.out.println(mobile);
				File f2=new File("/home/sathiyaseelan/Music/allmobile.txt");
				FileWriter fw=new FileWriter(f2,true);
				BufferedWriter bw=new BufferedWriter(fw);
				//bw.write(mobile);
				bw.write("\n");
				bw.flush();
				bw.close();
				
			}
		}
		//System.out.println("-------");
		
		}
		for(int i=0;i<mle.length;i++) {
			System.out.println(mle[i]);
		}
		
	}
	private void findAllMobileNo() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/mobile");
		//BufferedReader br=new BufferedReader(fr);
		File[] list=f.listFiles();
		String mobile="";
		for(File l:list) {
			if(l.isFile()) {
				FileReader fr=new FileReader(l);
				int read=fr.read();
				while(read!=-1) {
					 char ch=(char)read;
					 mobile=mobile+ch;
					System.out.print(ch);
					read=fr.read();
				}
				Pattern pat=Pattern.compile("(0|91)?[6-9][0-9]{9}");
				Matcher mat=pat.matcher(mobile);
				while(mat.find()) {
					mobile=mat.group();
				}
				System.out.println(mobile);
				File f2=new File("/home/sathiyaseelan/Music/allmobile.txt");
				FileWriter fw=new FileWriter(f2,true);
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write(mobile);
				bw.write("\n");
				bw.flush();
				bw.close();
				
			}
		}
	}

	private void findMobileNo() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/info.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int read=br.read();
		String mobile="";
		while(read!=-1) {
			char ch=(char)read;
			mobile=mobile+ch;
			read=br.read();
		}
		System.out.println(mobile);
		Pattern pat=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher mat=pat.matcher(mobile);
		while(mat.find()) {
			mobile=mat.group();
		}
		System.out.println(mobile);
		File f2=new File("/home/sathiyaseelan/Music/mobile.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(mobile);
		bw.flush();
		bw.close();

	}

}
