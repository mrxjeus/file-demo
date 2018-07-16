package com.quangnv.filedemo.model;

import java.io.File;
import java.util.List;

public class ImageUtil {
    public static void loadAllImage(File dir, List<String> files) {
        String tag = ".jpg";
        File[] listFile = dir.listFiles();
        if (listFile != null) {
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isDirectory()) {
                    loadAllImage(listFile[i], files);
                } else {
                    if (listFile[i].getName().endsWith(tag)) {
                        files.add(listFile[i].getAbsolutePath());
                    }
                }
            }
        }
    }
}
