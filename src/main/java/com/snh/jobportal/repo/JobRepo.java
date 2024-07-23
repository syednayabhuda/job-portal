package com.snh.jobportal.repo;

import com.snh.jobportal.model.JobPost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobRepo.class);

    static List<JobPost> jobPostList = new ArrayList<>(List.of(
            new JobPost(145796, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
            List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(236749, "Frontend Developer", "Experience in building responsive web applications using React",
                    3, List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(479325, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    List.of("Python", "Machine Learning", "Data Analysis")),
            new JobPost(476300, "Network Engineer",
                    "Design and implement computer networks for efficient data communication", 5,
                    List.of("Networking", "Cisco", "Routing", "Switching")),
            new JobPost(705454, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
                    3, List.of("iOS Development", "Android Development", "Mobile App")),
            new JobPost(666789, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines",
                    4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")),
            new JobPost(712897, "UI/UX Designer", "Create engaging user experiences and intuitive user interfaces",
                    2, List.of("User Experience", "User Interface Design", "Prototyping")
            )));

    public void addJobPost(JobPost jobPost) {
        jobPostList.add(jobPost);
        LOGGER.info("{}", jobPostList);
    }

    public List<JobPost> getAllJobPosts() {
        return jobPostList;
    }
}
