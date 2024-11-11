package com.example.demo.promedio;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.model;
public class promedio extends model{
		
	
		@GetMapping("/promedio")
		public String elemento(Model m ) {
			m.addAttribute("promedio", promedio );
			return calcularPromedio;
		}

}


