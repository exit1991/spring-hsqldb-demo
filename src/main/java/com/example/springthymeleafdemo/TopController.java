package com.example.springthymeleafdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.transaction.Transactional;

@Controller
public class TopController {
    
    @Autowired
    PersonRepository personRepository;

    @GetMapping("/")
    public ModelAndView index(@ModelAttribute("formModel") Person Person, ModelAndView mav) {
        // HTMLファイル名を指定
        mav.setViewName("index");
        
        // HTMLに埋め込む値を設定
        mav.addObject("title", "Hello page");
        mav.addObject("msg","this is JPA sample data.");
        
        // データベースから保存済みのデータを取得してHTMLに埋め込む
        List<Person> list = personRepository.findAll();
        mav.addObject("data", list);
        
        return mav;
    }

    @PostMapping("/")
    @Transactional
    public ModelAndView form(@ModelAttribute("formModel") Person Person, ModelAndView mav) {
        // データベースにフォームのデータを保存する
        personRepository.saveAndFlush(Person);
        
        // 「/」に GET でリダイレクトする
        return new ModelAndView("redirect:/");
    }

}
