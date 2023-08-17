package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties prop;

    public ConfigReader() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(Constants.CONFIG_FILE_PATH);
            prop = new Properties();
            prop.load(fileInputStream);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        return prop.getProperty("browser");
    }

    public String getChromeDriverPath() {
        return prop.getProperty("chromeDriverPath");
    }

    public String getIEDriverPath() {
        return prop.getProperty("ieDriverPath");
    }

    public String getFirefoxDriverPath() {
        return prop.getProperty("firefoxDriverPath");
    }
}
