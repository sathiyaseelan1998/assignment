package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileIO f=new FileIO();
		//f.createFile();
		//f.deleteFile();
		//f.createFolder();
		//f.isExists();
		//f.listOfFileAndFolder();
		//f.listOfFileOnly();
		//f.listOfFolderOnly();
		//f.extension();
		//f.writeFile();
		//f.bufferedWriter();
		//f.readFile();
		//f.countSentence();
		//f.bufferedReader();
		//f.subFolder();
	}
	private void subFolder() {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/NewFolder/SubFolder");
		f.mkdirs();
		
	}
	private void bufferedReader() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/new.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String r=br.readLine();
		System.out.println(r);
	}
	private void countSentence() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/new.txt");
		FileReader fr=new FileReader(f);
		int read=fr.read();
		int count=1;
		while(read!=-1) {
			char ch=(char)read;
			System.out.print(ch);// file reading
			if(ch=='.') {
				count++;
			}
			read=fr.read();
		}
		System.out.println(count);// count of sentence

	}

	private void readFile() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/new.txt");
		FileReader fr=new FileReader(f);
		int read=fr.read();
		int count=1;
		while(read!=-1) {
			char ch=(char)read;
			System.out.print(ch);// file reading
			if(ch==' ') {
				count++;
			}
			read=fr.read();
		}
		System.out.println(count);// count of word

	}

	private void bufferedWriter() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/new.txt");
		FileWriter fw=new FileWriter(f,true);//true does not old content change
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("rohit");
		bw.newLine();
		bw.write("rahul");
		bw.flush();
		bw.close();
	}

	private void writeFile() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/new.txt");
		FileWriter fw=new FileWriter(f,true);//true does not old content change
		fw.write("dhoni");
		fw.write("\n");
		fw.write("virat");
		fw.flush();
		fw.close();
	}

	private void extension() {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music");
		File[] file=f.listFiles();
		for(File ff:file) {
			if(ff.isFile()) {
				String name=ff.getName();
				System.out.println(name);
				String extension=name.substring(name.length()-3);
				if(extension.equals("txt")) {
					System.out.println(name);
				}
			}
		}
	}

	private void listOfFolderOnly() {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music");
		File[] file=f.listFiles();
		for(File ff:file) {
			if(ff.isDirectory()) {
			System.out.println(ff);
			}
		}
	}

	private void listOfFileOnly() {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music");
		File[] file=f.listFiles();
		for(File ff:file) {
			if(ff.isFile()) {
			System.out.println(ff);
			}
		}
	}

	private void listOfFileAndFolder() {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music");
		String list[]=f.list();
		for(String l:list) {
			System.out.println(l);
		}
	}

	private void isExists() {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/new2.txt");
		System.out.println(f.exists());

	}

	private void createFolder() {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/NewFolder");
		f.mkdir();
	}

	private void deleteFile() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/new2.txt");
		f.delete();
	}

	private void createFile() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sathiyaseelan/Music/new.txt");
		boolean create=f.createNewFile();
		System.out.println(create);
	}

}
