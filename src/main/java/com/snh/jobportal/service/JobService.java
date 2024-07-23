package com.snh.jobportal.service;

import com.snh.jobportal.model.JobPost;
import com.snh.jobportal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJobPost(JobPost jobPost) {
        repo.addJobPost(jobPost);
    }

    public List<JobPost> getAllJobPosts() {
        return repo.getAllJobPosts();
    }
}
