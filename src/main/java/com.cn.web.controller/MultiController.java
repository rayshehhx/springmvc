package com.cn.web.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MultiController implements Controller {

	/**
	 * 解析multipart/form-data 提交方式的参数
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return
	 * @throws Exception
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		DiskFileItemFactory factory = new DiskFileItemFactory();
		//创建解析类的实例
		ServletFileUpload sfu = new ServletFileUpload(factory);
		sfu.setHeaderEncoding( "utf-8" );
		//开始解析
		//每个表单域中数据会封装到一个对应的FileItem对象上
		try {
			List<FileItem> items = sfu.parseRequest(httpServletRequest);
			for (FileItem item:items) {
				if (item.isFormField()) {
					//普通文本
					if (item.getFieldName().equals("asset_tagnum")){
						String asset_tagnum = item.getString();
						System.out.println("asset_tagnum==="+asset_tagnum);
					}
					if (item.getFieldName().equals("token")){
						String token = item.getString();
						System.out.println("token===="+token);
					}
				}else {
					//表单上传的文件
					System.out.println("处理需要上传的文件");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  new ModelAndView("/suc");
	}
}
