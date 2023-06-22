package com.semmaldicao.helloworld.objetivos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-semana")
public class ObjetivosSemana {
	
	@GetMapping
	public String objetivos() {
		return 
		"<html>" +
        "<body style=\"color:blue;\">" +
        "<pre>" +
        "    ___________________________________________________________________________<br>" +
        "                                 Objetivos da Semana<br>" +
        "    ___________________________________________________________________________<br>" +
		"<ul>"+
		 "<li>DB-MYSQL - 2 Creating relational Databases with MySQL</li>"+              
		 "<li>SSM-OM Open Mentorship Session (2° Sessão de Mentoria)</li>"+
		 "<li>DB-MYSQL - 3 Introduction to SQL</li>"+
		 "<li>SSM-OM Open Session Well-Being (2°Sessão de Bem-Estar)</li>"+
		 "<li>SA-RP4 Role Play 4 - Prioritizing and urgent task</li>"+
		 "<li>DB-MYSQL-4 Advanced SQL - Joining Table</li>"+
		 "<li>SA-PI-T2 Task 2: Prototipando o Banco de dados</li>"+
		 "<li>SA-SUD3 Stayind up to Date-Drill 3</li>"+
		 "<li>WEB-JAVA 1 Introduction to Web Development using Java and Spring Boot</li>"+
		 "<li>BSM-CH3 The Big Picture</li>"+
		 "<li>C-TB8 Guess the Fact</li>"+
		 "<li>WEB-JAVA 2 Dependencies Injection using Spring Framework</li>"+
		 "<li>EE-CV (R1) Introduction to CV and Workshop (CANVAS) SESSÃO 1 - ASSINC</li>"+
		 "<li>EE-CV (R1) Introduction to CV and Workshop (CANVAS) SESSÃO 1 - SINC</li>"+
		 "<li>EE-R1 - Introduction to CV and Workshop (CANVAS - assincrono) - Session 3</li>"+
		 "<li>RR-PC1 Peer Coaching Protocol</li>"+
		 "<li>RR-SC Weekly Scorecard Review Protocol</li>"+
		 "</ul>";
		
		}

}
