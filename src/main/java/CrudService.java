import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrudService {

    BufferedReader br;

    public void readData(DQLService dql) {
        List<Map<String, Object>>  resultList = dql.selectAll();
        dql.printMapList(resultList);
    }

    public HashMap<String, Object> createData() {

        //int id;
        String name;
        int level;
        int class_num;
        int num;
        int in_time;
        int out_time;

        final HashMap<String, Object> dataMap = new HashMap<String, Object>();

        try {
            System.out.println("이름 입력");
            br = new BufferedReader(new InputStreamReader(System.in));
            name = br.readLine();
            dataMap.put("NAME" , name);
            System.out.println("학년 입력");
            level = Integer.parseInt(br.readLine());
            dataMap.put("LEVEL"   , level);
            System.out.println("반 입력");
            class_num = Integer.parseInt(br.readLine());
            dataMap.put("CLASSNUM" ,class_num);
            System.out.println("번호 입력");
            num = Integer.parseInt(br.readLine());
            dataMap.put("NUM" ,num);
            System.out.println("등교시간 입력");
            in_time = Integer.parseInt(br.readLine());
            dataMap.put("INTIME" ,in_time);
            System.out.println("하교시간 입력");
            out_time = Integer.parseInt(br.readLine());
            dataMap.put("OUTTIME" ,out_time);
            //grade = Person.calculateGrade(korScore, engScore, mathScore);
            //dataMap.put("GRADE" , grade);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        LocalDate date = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        regDate = date.format(formatter);
//
//        dataMap.put("REG_DATE" , regDate);

        return dataMap;
    }

    public HashMap<String, Object> updateData() {

        String name;
        int level;
        int class_num;
        int num;
        int in_time;
        int out_time;

        final HashMap<String, Object> updateMap = new HashMap<String, Object>();

        try {
            System.out.println("수정할 번호 입력");
            br = new BufferedReader(new InputStreamReader(System.in));

            num = Integer.parseInt(br.readLine());
            updateMap.put("updateID" , num);

            System.out.println("이름 입력");
            name = br.readLine();
            updateMap.put("NAME"   , name);
            System.out.println("학년 입력");
            level = Integer.parseInt(br.readLine());
            updateMap.put("LEVEL"   , level);
            System.out.println("반 입력");
            class_num = Integer.parseInt(br.readLine());
            updateMap.put("ENG_SCORE" ,class_num);
            System.out.println("번호 입력");
            num = Integer.parseInt(br.readLine());
            updateMap.put("NUM" ,num);
            System.out.println("등교시간 입력");
            in_time = Integer.parseInt(br.readLine());
            updateMap.put("INTIME" ,in_time);
            System.out.println("하교시간 입력");
            out_time = Integer.parseInt(br.readLine());
            updateMap.put("OUTTIME" ,out_time);


        } catch (IOException e) {
            e.printStackTrace();
        }

        return updateMap;
    }

    public int deleteData() {

        int num = 0;

        try {
            System.out.println("삭제할 번호 입력");
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return num;
    }

}
