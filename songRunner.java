package com.xworkz.constructor;

public class songRunner {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	

		{
		Song ref=new Song();
		
		 System.out.println("entered ");
		
		ref.lang="telugu";
		ref.lyricist="santhosh sooraj";
		ref.name="o sayanara sayanara selavntu ";
		ref.singer="M M maanasi";
		ref.type="melody";
		
		System.out.println("name :"+ref.name);
		System.out.println("lang  :"+ref.lang);
		System.out.println("lyricist :"+ref.lyricist);
		System.out.println("singer  :"+ref.singer);
		System.out.println("type :"+ref.type);
		
		 System.out.println("******************** ");
		 System.out.println("updated ");
		 

			ref.lang="english";
			ref.lyricist="justin biber";
			ref.name="i know u love me ";
			ref.singer="justin biber";
			ref.type="melody";
			
			System.out.println("name :"+ref.name);
			System.out.println("lang  :"+ref.lang);
			System.out.println("lyricist :"+ref.lyricist);
			System.out.println("singer  :"+ref.singer);
			System.out.println("type :"+ref.type);

		 
		
		
		
		
		
		
	}

	}
