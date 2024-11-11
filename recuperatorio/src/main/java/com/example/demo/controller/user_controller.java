package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Random;

public class user_controller {	

		public static void main (String[] args) {
			ArrayList<Integer> elementos = new ArrayList<>();
			Random random = new Random();
			for(int i=0;i<5;i++) {
				int elementoAleatorio = random.nextInt(4)+1;
				elementos.add(elementoAleatorio);
			}
			System.out.println("Lista de 5 elementos aleatorios: ");
			for(int elemento : elementos) {
				System.out.println(elemento);
			}

			
		}
	}


