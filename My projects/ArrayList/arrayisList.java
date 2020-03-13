package com.editop;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayisList {

	public static void main(String[] args) {
		var arrayList = new ArrayList<Integer>();
		var input = new Scanner(System.in);
		var a = input.nextInt();
		for ( var i = 0; i < a; i++) {
		arrayList.add(input.nextInt());
		}
		
//		for ( var element : arrayList) {
		for ( var p = 0; p < arrayList.size(); p++) {
		
//			else if ()
//			{
				arrayList.remove(2);
//			}
			
//			arrayList.remove(element);
//			var one = element;
//			if ( one == arrayList.get(0) )
//				{
//				arrayList.set(element, 0);
//					
//			}
			
			System.out.print( arrayList.get(p) + " ");
			}
		
		}
	}
//}
//			if ()
//			var one = arrayList.get(0); 
//			 System.out.print(element + " ");
//			}
//		var one = arrayList.get(0); 
//		for ( var p = 0; p < a; p++) {
//			var one = arrayList.get(p); 
//			if ( one == arrayList.get(p) )
//				{
//				arrayList.remove(p);
//				
//				System.out.print(p + " ");
//				}
//			else if (one != p){
//				 System.out.print(p + " ");
//			}
//			 System.out.print(p + " ");
			
//		var one = arrayList.get(0);
//		System.out.println(one);
//		for ( var element : arrayList) {
//			if ( one == element)
//			{
//				arrayList.remove(one);
//				 System.out.print(element + " ");
//			}
//			else { 
//				arrayList.set(element, 0);
//			 System.out.print(element + " ");
//			}
//			}
//			 System.out.print(element + " ");
		
	

//        System.out.println(arrayList.size());
//		arrayList.add(2);
//		arrayList.add(2);
//		arrayList.add(2);
//		arrayList.add(2);
//		System.out.println(arrayList.size());
//
//		arrayList.add(2, 7);
//
//		for (var element : arrayList) {
//			System.out.print( element + " ");
//
//		}
//	}


