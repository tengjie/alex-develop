package com.alex.file.service;

import com.alex.file.model.FileDO;

import java.util.List;

/**
 * @Description:
 * @Author: alex
 * @Date: create in 2019-03-20 11:55
 */
public interface FileService {

    /**
     * 获取系统中所有的附件信息
     * @return
     */
    List<FileDO> listFile();

}
