package ExcelBinOutput;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import ExcelBinOutput.creater.CreaterHandler;
import Tool.FieldUtil;
import com.google.gson.Gson;

public class ExcelBinOutputHandler {

    public void Handler(String jsonPath){
        CreaterHandler createrHandler = new CreaterHandler();
        createrHandler.Create(jsonPath);
    }



}
