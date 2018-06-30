package com.hjy.controller.backend;

import com.hjy.common.ServerResponse;
import com.hjy.service.CourseService;
import com.hjy.service.FileInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjy
 * @create 2018/06/29
 **/
@RestController
@RequestMapping("/file/management/")
public class FileManageController {
	private Logger logger = LoggerFactory.getLogger(FileManageController.class);

	@Autowired
	private FileInfoService fileInfoService;


	@PostMapping(value = "list")
	public ServerResponse getList(
			@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
			@RequestParam(value = "pageSize",defaultValue = "10") int pageSize,
			@RequestParam(value = "courseName",defaultValue = "") String courseName){
		//return  .getCourseList(pageNum,pageSize,majorName);
		return null;
	}


}
