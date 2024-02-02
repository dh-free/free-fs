package com.free.fs.service.impl;

import com.free.fs.domain.StorageSettings;
import com.free.fs.mapper.StorageSettingsMapper;
import com.free.fs.service.StorageSettingsService;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.free.fs.domain.table.StorageSettingsTableDef.STORAGE_SETTINGS;

/**
 * @author yann
 */
@Slf4j
@Service
public class StorageSettingsServiceImpl extends ServiceImpl<StorageSettingsMapper, StorageSettings> implements StorageSettingsService {

    @Override
    public StorageSettings getStorageSettingsByUser(Long userId, Integer enabled) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.where(STORAGE_SETTINGS.USER_ID.eq(userId))
                .and(STORAGE_SETTINGS.ENABLED.eq(enabled));
        return this.getOne(queryWrapper);
    }
}