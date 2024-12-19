package org.zerock.apiserver.util;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Component
@Log4j2
@RequiredArgsConstructor
public class CustomFileUtil {

    @Value("${org.zerock.upload.path}")
    private String uploadPath;

    @PostConstruct
    public void init() {
        File tempFolder = new File(uploadPath);

        if(tempFolder.exists() == false) {
            tempFolder.mkdir();
        }

        uploadPath = tempFolder.getAbsolutePath();

        log.info("------------------------------");
        log.info(uploadPath);

    }

    public List<String> saveFiles(List<MultipartFile> files) throws RuntimeException {
       return null;
    }
}
