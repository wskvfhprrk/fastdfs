package com.example.fastdfs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FastDFSController {
    @Autowired
    private FastDFSClientWrapper dfsClient;

    @PostMapping("/files-anon/fdfsupload")
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        String imgUrl = dfsClient.uploadFile(file);
        return imgUrl;
    }
}