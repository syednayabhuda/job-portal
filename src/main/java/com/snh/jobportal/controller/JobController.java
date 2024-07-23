package com.snh.jobportal.controller;

import com.snh.jobportal.model.JobPost;
import com.snh.jobportal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping(value = {"/", "home"}, method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/addjob", method = RequestMethod.GET)
    public String addJob() {
        return "addjob";
    }

    @RequestMapping(value = "/handleForm", method = RequestMethod.POST)
    public String handleForm(JobPost jobPost) {
        service.addJobPost(jobPost);
        return "success";
    }

    @RequestMapping(value ="viewalljobs", method = RequestMethod.GET)
    public String getAllJobs(Model model) {
        List<JobPost> allJobPosts = service.getAllJobPosts();
        model.addAttribute("jobPosts", allJobPosts);
        return "viewalljobs";
    }
}
