package com.free.fs.common.constant;

/**
 * 全局公共常量
 *
 * @author dinghao
 * @date 2021/3/17
 */
public interface CommonConstant {

    /**
     * 路径目录分隔符
     */
    String DIR_SPLIT = "/";

    /**
     * 字符串分隔符
     */
    String STRING_SPLIT = ",";

    /**
     * 后缀分隔符
     */
    String SUFFIX_SPLIT = ".";

    /**
     * 目录默认类型
     */
    String DEFAULT_DIR_TYPE = "dir";

    /**
     * 编码
     */
    String UTF_8 = "UTF-8";

    /**
     * 默认管理员角色code
     */
    String ROLE_ADMIN = "admin";

    /**
     * 默认普通角色code
     */
    String ROLE_USER = "user";

    /**
     * 默认树顶级id
     */
    Long ROOT_PARENT_ID = -1L;

    /**
     * dtree指定图标
     */
    String DTREE_ICON_1 = "dtree-icon-weibiaoti5";

    /**
     * dtree指定图标
     */
    String DTREE_ICON_2 = "dtree-icon-normal-file";

    String X_REQUESTED_WITH = "X-Requested-With";

    String XML_HTTP_REQUEST = "XMLHttpRequest";

    /**
     * 存储类型-本地
     */
    String FILE_TYPE_LOCAL = "local";

    /**
     * 阿里云存储类型aliyun_oss
     */
    String FILE_TYPE_OSS = "aliyunOss";

    /**
     * 云存储类型-七牛
     */
    String FILE_TYPE_QINIU = "qiniu";

    /**
     * 云存储类型-Minio
     */
    String FILE_TYPE_MINIO = "minio";

    /**
     * 需要租户过滤的字段
     */
    String SYSTEM_TENANT_ID = "source";
}