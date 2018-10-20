package com.boot.security.server.controller;

import com.boot.security.server.model.FileInfo;
import com.boot.security.server.model.Ueditor;
import com.boot.security.server.service.FileService;
import com.boot.security.server.utils.PublicMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class UEditorController {

    @Autowired
    private FileService fileService;

    @RequestMapping(value="/ueditor")
    @ResponseBody
    public String ueditor(HttpServletRequest request) {

        return PublicMsg.UEDITOR_CONFIG;
    }

    @RequestMapping(value="/imgUpload")
    @ResponseBody
    public Ueditor imgUpload(MultipartFile file) {
        Ueditor ueditor = new Ueditor();
        try {
            FileInfo fileInfo = fileService.save(file);
            ueditor.setState("上传成功");
            ueditor.setUrl("http://localhost:8080/statics"+fileInfo.getUrl());
            ueditor.setTitle(fileInfo.getId());
            ueditor.setOriginal(fileInfo.getId());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ueditor;
    }

}
