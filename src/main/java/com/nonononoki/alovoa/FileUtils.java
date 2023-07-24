package com.nonononoki.alovoa;

import java.io.IOException;
import java.util.Base64;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;


public class FileUtils {

    public static String inputStreamToString(InputStream inputStream) throws IOException {
        return StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
    }

    public static String resourceToBase64(String path) throws IOException {
        Resource resource = new ClassPathResource(path);
        byte[] bytes = StreamUtils.copyToByteArray(resource.getInputStream());
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static String getResourceText(String path) throws IOException {
        Resource resource = new ClassPathResource(path);
        return inputStreamToString(resource.getInputStream());
    }

    public static boolean isTextContainingLine(String content, String text) {
        String[] lines = content.split(System.getProperty("line.separator"));
        for (int i = 0; i < lines.length; i++) {
            if (text.contains(lines[i])) {
                return true;
            }
        }
        return false;
    }
}