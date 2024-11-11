package com.example.demo.model;

import com.example.demo.controller.user_controller;

public class model extends user_controller{
	
		public double calcularPromedio() {
			if (elemento.isEmpty()) return 0.0;
			
			int suma = 0;
			for (int elemento : elementos) {
				suma += elemento;
			}
			return (double)suma / elementos.size();
		}
	}

