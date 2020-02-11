package com.alex.file.model;

import lombok.Data;

import javax.persistence.Column;

@Data
public class FileDO {

    @Column(name = "ID_")
    private String id;

    @Column(name = "REV_")
    private String rev;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "FILE")
    private Byte file;

    @Column(name = "UPLOAD_TIME")
    private String uploadTime;
}
