package com.example.its.domain.issue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class IssueEntity {
    private long id;
    private String summary;
    private String description;
}