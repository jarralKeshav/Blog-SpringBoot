package com.studyeasy.springBlog.utils.constants;

import java.io.File;

public class AppUtil {
    public static String get_upload_path(String fileName){
        return new File("src"+ File.separator+"main"+ File.separator+"resources"+ File.separator+"static"+ File.separator+"uploads").getAbsolutePath() + File.separator + fileName;
    }
}
