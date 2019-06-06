package com.example.fastdfs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping(value = "auth")
    public void auth(){
        throw new ForbiddenException();
    }
    @ResponseStatus(value = HttpStatus.FORBIDDEN, reason="To show an example of a custom message")
    public class ForbiddenException extends RuntimeException {}
}