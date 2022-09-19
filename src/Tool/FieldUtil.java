package Tool;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FieldUtil {

    public static void print(Object obj) {
        if (obj == null) {
            return;
        }
        //获取类的类类型
        Class c = obj.getClass();
        System.out.println("类的全称：" + c.getName());
        //获取类中的成员变量
        //注：推荐使用getDeclaredFields()，因为该方法获取的是类自身声明的全部成员变量，没有修饰权限的限制
        //而getFields()获取的是public修饰的成员变量
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            //获取成员变量的类型的类类型
            Class fieldType = field.getType();
            System.out.print("成员变量的类型的名称：" + fieldType.getName() + " ");
            //获取成员变量的全称
            System.out.println("成员变量的名称：" + field.getName());
        }
    }

    public static String getVarsName(Object obj) {
        if (obj == null) {
            return null;
        }
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        StringBuilder strBuilder = new StringBuilder();
        for (Field field : fields) {
            //获取成员变量的全称
            strBuilder.append(field.getName()).append(",");
        }
        strBuilder.deleteCharAt(strBuilder.length()-1);

        return strBuilder.toString();
    }

    public static int getVarsSum(Object obj) {
        if (obj == null) {
            return 0;
        }
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();

        return fields.length;
    }

    public static Map<String, String> getVarsMap(Object obj) {
        Map<String, String> map = new HashMap<>();
        if (obj == null) {
            return null;
        }
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            map.put(fieldType.getName(), field.getName());
        }
        return map;
    }

    public static List<String> getVarsList(Object obj) {
        List<String> list = new ArrayList<>();
        if (obj == null) {
            return null;
        }
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            list.add(field.getName());
        }
        return list;
    }

    public static List<String> getVarsTypeList(Object obj) {
        List<String> list = new ArrayList<>();
        if (obj == null) {
            return null;
        }
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            list.add(fieldType.getSimpleName());
        }
        return list;
    }
}
