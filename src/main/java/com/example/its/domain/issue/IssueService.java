package com.example.its.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class IssueService {

    private final IssueRepository issueRepository;

    public List<IssueEntity> findAll(){
       return issueRepository.findAll();
    }

    //TODO transaction
    public void create(String summary, String description) {
        issueRepository.insert(summary, description);
    }
}
