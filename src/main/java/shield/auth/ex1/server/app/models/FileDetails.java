/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shield.auth.ex1.server.app.models;

import java.util.Map;

/**
 *
 * @author renan-baisso
 */
public class FileDetails {

    private String downloadUrl;
    private String fileName;
    private String fileType;
    private Map<String, String> exportedLinks;
    private String IconUrl;

    public String getIconUrl() {
        return IconUrl;
    }

    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Map<String, String> getExportedLinks() {
        return exportedLinks;
    }

    public void setExportedLinks(Map<String, String> exportedLinks) {
        this.exportedLinks = exportedLinks;
    }
}
