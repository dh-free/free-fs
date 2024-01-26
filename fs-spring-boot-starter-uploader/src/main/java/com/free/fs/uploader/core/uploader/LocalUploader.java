package com.free.fs.uploader.core.uploader;

import com.free.fs.common.domain.FileBo;
import com.free.fs.uploader.config.UploaderProperties.LocalProperties;
import com.free.fs.uploader.core.IFileUploader;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

/**
 * 本地文件上传
 *
 * @Author: hao.ding@insentek.com
 * @Date: 2024/1/26 13:59
 */
public class LocalUploader implements IFileUploader {

    private final LocalProperties properties;

    public LocalUploader(LocalProperties properties) {

        this.properties = properties;
    }

    @Override
    public String getBucketByUrl(String url) {
        return null;
    }

    @Override
    public String getObjectNameByUrl(String url) {
        return null;
    }

    @Override
    public boolean bucketExists(String bucket) {
        //判断本地文路径是否存在
//        if (properties.getBasePath() != null) {
//            return true;
//        }
        return false;
    }

    @Override
    public void makeBucket(String bucket) {

    }

    @Override
    public FileBo upload(MultipartFile file) {
        return null;
    }

    @Override
    public void delete(String url) {

    }

    @Override
    public void download(String url, HttpServletResponse response) {

    }

    @Override
    public String getPolicyUrl(String url) {
        return null;
    }
}
