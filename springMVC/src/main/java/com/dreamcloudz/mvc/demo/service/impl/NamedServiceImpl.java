package com.dreamcloudz.mvc.demo.service.impl;

import com.dreamcloudz.mvc.framework.annotation.GPAutowired;
import com.dreamcloudz.mvc.demo.service.INamedService;
import com.dreamcloudz.mvc.demo.service.IService;
import com.dreamcloudz.mvc.framework.annotation.GPService;

@GPService("myName")
public class NamedServiceImpl implements INamedService{

	@GPAutowired
 IService service;
	
}
