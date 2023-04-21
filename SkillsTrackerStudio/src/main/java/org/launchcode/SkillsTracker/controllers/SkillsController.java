package org.launchcode.SkillsTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @RequestMapping
    @ResponseBody
    public String createHomepage(){

   return "<html>" +
            "<body>" +
             "<h1>Skills Tracker</h1>" +
           "<h2>Skills and Stuff!</h2>" +
             "<ol>" +
           "<li>Java</li>" +
            "<li>JavaScript</li>" +
             "<li>Python</li>" +
           "</ol>" +
            "</body>" +
            "</html>";
            }
    @GetMapping("/form")
    @ResponseBody
    public String createForm(){
       return "<html>" +
                "<body>" +
               "<form method='post'>" +
               "<label>Name<input type='text' name = 'name' /></label><br>"  +
            "<label>My favorite language:<br>" +
                "<select name ='firstlang' id=\"firstlang\">" +
               "<option value=\"javascript\">JavaScript</option>"+
                "<option value=\"python\">Python</option>" +
               "<option value=\"java\">Java</option>"+
                "</select></label><br>" +
               "<label>My second favorite language:<br>" +
               "<select name ='secondlang' id=\"secondlang\">" +
               "<option value=\"javascript\">JavaScript</option>"+
               "<option value=\"python\">Python</option>" +
               "<option value=\"java\">Java</option>"+
               "</select></label><br>" +
               "<label>My third favorite language:<br>" +
               "<select name ='thirdlang' id=\"thirdang\">" +
               "<option value=\"javascript\">JavaScript</option>"+
               "<option value=\"python\">Python</option>" +
               "<option value=\"java\">Java</option>"+
               "</select></label><br>" +
               "<input type= \"submit\" value\"Submit!!\" />" +
               "</body>" +
        "</html>";


    }
    @PostMapping("/form")
    @ResponseBody
    public String respondToFormSubmission(@RequestParam String name,
                                          @RequestParam String firstlang,
                                          @RequestParam String secondlang,
                                          @RequestParam String thirdlang ) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstlang + "</li>" +
                "<li>" + secondlang +"</li>" +
                "<li>" + thirdlang + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        }
    }


