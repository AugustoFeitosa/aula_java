package com.semmaldicao.helloworld.bsm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/bsm")
public class Bsm {

	@GetMapping
    public String bsm() {
        return "<html>" +
                "<body>" +
                "<pre>" +
                "____________________________________________<br>" +
                "               Mentalidades<br>" +
                "____________________________________________<br>" +
                "1. Mentalidade de crescimento;<br>" +
                "2. Mentalidade de persistência;<br>" +
                "3. Mentalidade de responsabilidade pessoal;<br>" +
                "4. Mentalidade de Orientação ao futuro.<br>" +
                "____________________________________________<br>" +
                "               Competências<br>" +
                "____________________________________________<br>" +
                "1. Comunicação;<br>" +
                "2. Orientação ao Detalhe;<br>" +
                "3. Trabalho em Equipe;<br>" +
                "4. Proatividade.<br>" +
                "</pre>" +
                "</body>" +
                "</html>";
    }
	
}
