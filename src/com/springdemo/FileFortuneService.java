package com.springdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private ArrayList<String> data;

	public FileFortuneService()
	{
		System.out.println(">>FileFortuneService:  inside default contructor");
	}
	
	@PostConstruct
	public void FileFortuneService() {
		
		System.out.println(">> FileFortuneService: inisde post construct ");
		
		try {
			FileReader fr=new FileReader("src/data.properties");
			BufferedReader br = new BufferedReader(fr);
			
			String tempLine;
			
			data= new ArrayList<String>();
			
			while((tempLine=br.readLine())!=null) {
				data.add(tempLine);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		Random rand= new Random();
		int idx=rand.nextInt(data.size());
		
		return data.get(idx);
	}

}
