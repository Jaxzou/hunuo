package com.boot.security.server.utils;

public class PublicMsg {

    public final static String UEDITOR_CONFIG = "{\n" +
            "    \"imageActionName\": \"uploadimage\",\n" +
            "    \"imageFieldName\": \"file\",\n" +
            "    \"imageMaxSize\": 2048000,\n" +
            "    \"imageAllowFiles\": [\".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\"],\n" +
            "    \"imageCompressEnable\": true,\n" +
            "    \"imageCompressBorder\": 1600,\n" +
            "    \"imageInsertAlign\": \"none\",\n" +
            "    \"imageUrlPrefix\": \"http://localhost:8080/statics\",\n" +
            "    \"imagePathFormat\": \"d:/files/{yyyy}/{mm}/{dd}/{filename}\",\n" +
            "    \"scrawlActionName\": \"uploadscrawl\",\n" +
            "    \"scrawlFieldName\": \"upfile\",\n" +
            "    \"scrawlPathFormat\": \"/ueditor/jsp/upload/image/{yyyy}{mm}{dd}/{time}{rand:6}\",\n" +
            "    \"scrawlMaxSize\": 2048000,\n" +
            "    \"scrawlUrlPrefix\": \"\",\n" +
            "    \"scrawlInsertAlign\": \"none\",\n" +
            "    \"snapscreenActionName\": \"uploadimage\",\n" +
            "    \"snapscreenPathFormat\": \"/ueditor/jsp/upload/image/{yyyy}{mm}{dd}/{time}{rand:6}\",\n" +
            "    \"snapscreenUrlPrefix\": \"\",\n" +
            "    \"snapscreenInsertAlign\": \"none\",\n" +
            "    \"catcherLocalDomain\": [\"127.0.0.1\", \"localhost\", \"img.baidu.com\"],\n" +
            "    \"catcherActionName\": \"catchimage\",\n" +
            "    \"catcherFieldName\": \"source\",\n" +
            "    \"catcherPathFormat\": \"/ueditor/jsp/upload/image/{yyyy}{mm}{dd}/{time}{rand:6}\",\n" +
            "    \"catcherUrlPrefix\": \"\",\n" +
            "    \"catcherMaxSize\": 2048000,\n" +
            "    \"catcherAllowFiles\": [\".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\"],\n" +
            "    \"videoActionName\": \"uploadvideo\",\n" +
            "    \"videoFieldName\": \"upfile\",\n" +
            "    \"videoPathFormat\": \"/ueditor/jsp/upload/video/{yyyy}{mm}{dd}/{time}{rand:6}\",\n" +
            "    \"videoUrlPrefix\": \"\",\n" +
            "    \"videoMaxSize\": 102400000,\n" +
            "    \"videoAllowFiles\": [\n" +
            "        \".flv\", \".swf\", \".mkv\", \".avi\", \".rm\", \".rmvb\", \".mpeg\", \".mpg\",\n" +
            "        \".ogg\", \".ogv\", \".mov\", \".wmv\", \".mp4\", \".webm\", \".mp3\", \".wav\", \".mid\"],\n" +
            "    \"fileActionName\": \"uploadfile\",\n" +
            "    \"fileFieldName\": \"upfile\",\n" +
            "    \"filePathFormat\": \"/ueditor/jsp/upload/file/{yyyy}{mm}{dd}/{time}{rand:6}\",\n" +
            "    \"fileUrlPrefix\": \"\",\n" +
            "    \"fileMaxSize\": 51200000,\n" +
            "    \"fileAllowFiles\": [\n" +
            "        \".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\",\n" +
            "        \".flv\", \".swf\", \".mkv\", \".avi\", \".rm\", \".rmvb\", \".mpeg\", \".mpg\",\n" +
            "        \".ogg\", \".ogv\", \".mov\", \".wmv\", \".mp4\", \".webm\", \".mp3\", \".wav\", \".mid\",\n" +
            "        \".rar\", \".zip\", \".tar\", \".gz\", \".7z\", \".bz2\", \".cab\", \".iso\",\n" +
            "        \".doc\", \".docx\", \".xls\", \".xlsx\", \".ppt\", \".pptx\", \".pdf\", \".txt\", \".md\", \".xml\"\n" +
            "    ],\n" +
            "    \"imageManagerActionName\": \"listimage\",\n" +
            "    \"imageManagerListPath\": \"/ueditor/jsp/upload/image/\",\n" +
            "    \"imageManagerListSize\": 20,\n" +
            "    \"imageManagerUrlPrefix\": \"\",\n" +
            "    \"imageManagerInsertAlign\": \"none\",\n" +
            "    \"imageManagerAllowFiles\": [\".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\"],\n" +
            "    \"fileManagerActionName\": \"listfile\",\n" +
            "    \"fileManagerListPath\": \"/ueditor/jsp/upload/file/\",\n" +
            "    \"fileManagerUrlPrefix\": \"/statics/\",\n" +
            "    \"fileManagerListSize\": 20,\n" +
            "    \"fileManagerAllowFiles\": [\n" +
            "        \".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\",\n" +
            "        \".flv\", \".swf\", \".mkv\", \".avi\", \".rm\", \".rmvb\", \".mpeg\", \".mpg\",\n" +
            "        \".ogg\", \".ogv\", \".mov\", \".wmv\", \".mp4\", \".webm\", \".mp3\", \".wav\", \".mid\",\n" +
            "        \".rar\", \".zip\", \".tar\", \".gz\", \".7z\", \".bz2\", \".cab\", \".iso\",\n" +
            "        \".doc\", \".docx\", \".xls\", \".xlsx\", \".ppt\", \".pptx\", \".pdf\", \".txt\", \".md\", \".xml\"\n" +
            "    ]\n" +
            "}";

    /**
     * Ueditor的返回状态类型
     */
    public enum UeditorMsg{
        SUCCESS("SUCCESS"),ERROR("上传失败");
        private String v;
        UeditorMsg(String v){
            this.v =v;
        }
        public String get(){
            return this.v;
        }
    }


}
