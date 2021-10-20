package com.pink.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;

/**
 * @Author Pinknee
 * @Date 2021/10/10 2:45
 */
@Controller
@RequestMapping("/test")
public class FirstController {
    @RequestMapping("/index")
    public String i(){
        return "/index";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sex = sc.next().charAt(0);
        System.out.println(sex);
    }
}
