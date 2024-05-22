package dev.archie.productservice.model;

import java.util.Date;

public class BaseModel {
    private int id;
    private Date createdAt;
    private Date updatedAt;
    private boolean isDeleted;
    private String createdBy;
    private String updatedBy;
}
