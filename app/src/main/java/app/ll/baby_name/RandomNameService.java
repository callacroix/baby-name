package app.ll.baby_name;

import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class RandomNameService {
    private static final String TAG = "MY_APP_DEBUG_TAG";
    private Handler handler; // handler that gets info from Bluetooth service
  
    private String fileName;
  
    public RandomNameService(String file) {
       this.fileName = file;
    }

    public String getRandomName(SexEnum type) {
      InputStream inputStream = new FileInputStream(new File(fileName));
      
      Yaml yaml = new Yaml();
      BabyNames data = yaml.load(inputStream);
      System.out.println(data.size());
    }
}
