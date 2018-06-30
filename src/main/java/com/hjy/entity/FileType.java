package com.hjy.entity;

public class FileType {
    private Long fileTypeId;

    private String fileHash;

    private String fileType;

    public FileType(Long fileTypeId, String fileHash, String fileType) {
        this.fileTypeId = fileTypeId;
        this.fileHash = fileHash;
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

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash == null ? null : fileHash.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }
}