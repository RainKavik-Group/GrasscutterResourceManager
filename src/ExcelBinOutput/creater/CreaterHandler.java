package ExcelBinOutput.creater;

import ExcelBinOutput.BuildData;
import Tool.FieldUtil;
import Tool.PrintLayerUtil;
import com.google.gson.Gson;
import utils.Position;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class CreaterHandler {
    public void Create(String jsonPath){



        Gson gson = new Gson();
        BuildData buildData = new BuildData();
        buildData.setType("1");

        try (
                FileWriter writer = new FileWriter(jsonPath)) {
            String jsonObject = gson.toJson(buildData);
            writer.write(jsonObject);
            writer.flush();
            writer.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void CreatGroup(Object obj, int layer) {
        layer++;
        Map<String, String> varsMap = FieldUtil.getVarsMap(obj);
        List<String> varsList = FieldUtil.getVarsList(obj);
        List<String> varsTypeList = FieldUtil.getVarsTypeList(obj);
        int varsSum = FieldUtil.getVarsSum(obj);
        Scanner scanner = new Scanner(System.in);

        System.out.printf(PrintLayerUtil.printDefault(layer, "正在编辑%s%n"), obj.getClass().getSimpleName());

        for (int i = 0; i < varsSum; i++) {
            if (Objects.equals(varsTypeList.get(i), "Position")) {
                CreaterHandler creater = new CreaterHandler();
                Position pos = new Position();
                creater.CreatGroup(pos, layer);
            }

            System.out.printf(PrintLayerUtil.printDefault(layer, "请输入%s（%s):"), varsList.get(i), varsTypeList.get(i));
            String a = scanner.nextLine();
        }
        System.out.printf(PrintLayerUtil.printDefault(layer, "%s编辑结束%n"), obj.getClass());
    }

}
