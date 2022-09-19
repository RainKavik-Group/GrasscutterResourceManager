import ExcelBinOutput.BuildData;
import ExcelBinOutput.creater.CreaterHandler;

public class Main {
    public static void main(String[] args) {

        //ExcelBinOutputHandler handler = new ExcelBinOutputHandler();
        String jsonPath = "C:/Users/Aby2s/Desktop/test/test.json";
        //handler.Handler(jsonPath);
        CreaterHandler createrHandler = new CreaterHandler();
        BuildData buildData = new BuildData();
        createrHandler.CreatGroup(buildData, 0);

    }
}