package ExcelBinOutput;

import java.lang.reflect.Field;
import java.util.List;

import ExcelBinOutput.sub.LittleGameData;
import utils.Position;

public class BuildData {

    private int id;
    private String NLSDPADFFC; // type
    private Position startPos;
    private List<LittleGameData> sceneData;
    private List<LittleGameData> monsterData;


    public enum NLSDPADFFC {
        creat, game, sceneOnly, monsterOnly
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.NLSDPADFFC = type;
    }

    public void setStartPos(Position startPos) {
        this.startPos = startPos;
    }

    public void setSceneData(List<LittleGameData> sceneData) {
        this.sceneData = sceneData;
    }

    public void setMonsterData(List<LittleGameData> monsterData) {
        this.monsterData = monsterData;
    }

    //@Override
    public int getId() {
        return id;
    }

    public String getType() {
        return NLSDPADFFC;
    }

    public Position getStartPos(){
        return startPos;
    }

    public List<LittleGameData> getSceneData(){
        return sceneData;
    }

    public List<LittleGameData> getMonsterData(){
        return monsterData;
    }
}
