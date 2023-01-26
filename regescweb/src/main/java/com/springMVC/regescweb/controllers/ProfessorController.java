package com.springMVC.regescweb.controllers;

import com.springMVC.regescweb.models.Professor;
import com.springMVC.regescweb.models.StatusProfessor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProfessorController {
    @GetMapping("/professores")
    public ModelAndView index(){
        Professor batman = new Professor("Batman", new BigDecimal(5000.0), StatusProfessor.ATIVO);
        batman.setId(1L);
        Professor coringa = new Professor("Coringa", new BigDecimal(1000.0), StatusProfessor.APOSENTADO);
        coringa.setId(2L);
        Professor chaves = new Professor("Chaves", new BigDecimal(8000.0), StatusProfessor.INATIVO);
        chaves.setId(3L);
        List<Professor> professors = Arrays.asList(batman, coringa, chaves);

        ModelAndView mv = new ModelAndView("professores/index");
        mv.addObject("professores", professors);

        return mv;
    }
}
