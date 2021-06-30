import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class FileService {

    public void saveFile(List<Map<String, Object>> list) {

        try {
            // fileUtils 사용
            File file = new File("data.txt");
            FileUtils.write(file, "", false);

            for(int i = 0; i < list.size(); i++) {
                Map<String, Object> map = list.get(i);

                String name = (String) map.get("NAME");
                int level = Integer.parseInt(map.get("LEVEL").toString());
                int class_num = Integer.parseInt(map.get("CLASSNUM").toString());
                int num = Integer.parseInt(map.get("NUM").toString());
                int in_time = Integer.parseInt(map.get("INTIME").toString());
                int out_time = Integer.parseInt(map.get("OUTTIME").toString());

                FileUtils.write (file,name + " / " + level + " / " +class_num + " / " + num + " / " + in_time+ " / " + out_time + "\n", true);
            }
            // fileUtils 사용
        }catch (FileNotFoundException e) {
            System.out.println("data.txt 파일이 존재하지 않습니다.");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
