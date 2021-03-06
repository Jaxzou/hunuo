package com.boot.security.server.service.impl;

import java.io.IOException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.boot.security.server.dao.FileInfoDao;
import com.boot.security.server.model.FileInfo;
import com.boot.security.server.service.FileService;
import com.boot.security.server.utils.FileUtil;

@Service
public class FileServiceImpl implements FileService {

	private static final Logger log = LoggerFactory.getLogger("adminLogger");

	@Value("${files.path}")
	private String filesPath;
	@Autowired
	private FileInfoDao fileInfoDao;

	@Override
	public FileInfo save(MultipartFile file) throws IOException {
		String fileOrigName = file.getOriginalFilename();
		if (!fileOrigName.contains(".")) {
			throw new IllegalArgumentException("缺少后缀名");
		}

		String uuid = UUID.randomUUID().toString();

		FileInfo fileInfo = fileInfoDao.getById(uuid);
		if (fileInfo != null) {
			fileInfoDao.update(fileInfo);
			return fileInfo;
		}

		fileOrigName = fileOrigName.substring(fileOrigName.lastIndexOf("."));
		String pathname = FileUtil.getPath() +  uuid + fileOrigName;
		String fullPath = filesPath + pathname;
		FileUtil.saveFile(file, fullPath);

		long size = file.getSize();
		String contentType = file.getContentType();

		fileInfo = new FileInfo();
		fileInfo.setId(uuid);
		fileInfo.setContentType(contentType);
		fileInfo.setSize(size);
		fileInfo.setPath(fullPath);
		fileInfo.setUrl(pathname);
		fileInfo.setType(contentType.startsWith("image/") ? 1 : 0);

		fileInfoDao.save(fileInfo);

		log.debug("上传文件{}", fullPath,"2");

		return fileInfo;

	}

	@Override
	public FileInfo saveAnnex(MultipartFile file) throws IOException {
		String fileOrigName = file.getOriginalFilename();
		if (!fileOrigName.contains(".")) {
			throw new IllegalArgumentException("缺少后缀名");
		}
		long millis = System.currentTimeMillis();

		String pathname = FileUtil.getPath() + millis +"_"+fileOrigName;
		String fullPath = filesPath +  pathname;
		FileUtil.saveFile(file, fullPath);

		long size = file.getSize();
		String contentType = file.getContentType();


		FileInfo fileInfo = new FileInfo();
		fileInfo.setId(millis+"_"+fileOrigName);
		fileInfo.setContentType(contentType);
		fileInfo.setSize(size);
		fileInfo.setPath(fullPath);
		fileInfo.setUrl(pathname);
		fileInfo.setType(contentType.startsWith("image/") ? 1 : 0);

		fileInfoDao.save(fileInfo);
		log.debug("上传文件{}", fullPath,"2");

		return fileInfo;
	}



	@Override
	public void delete(String id) {
		FileInfo fileInfo = fileInfoDao.getById(id);
		if (fileInfo != null) {
			String fullPath = fileInfo.getPath();
			FileUtil.deleteFile(fullPath);

			fileInfoDao.delete(id);
			log.debug("删除文件：{}", fileInfo.getPath());
		}
	}



}
