package com.tang.service.serviceImpl;

import com.tang.mapper.FileMapper;
import com.tang.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    FileMapper fileMapper;

    @Override
    public String insertUrl(String path) {
        return fileMapper.insertUrl(path);
    }
}
