package com.hjy.entity;

public class FileType {
    private Long fileTypeId;

    private String fileType;

    public FileType(Long fileTypeId, String fileType) {
        this.fileTypeId = fileTypeId;
        this.fileType = fileType;
    }

    public FileType() {
        super();
    }

    public Long getFileTypeId() {
        return fileTypeId;
    }

    public void setFileTypeId(Long fileTypeId) {
        this.fileTypeId = fileTypeId;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }
}