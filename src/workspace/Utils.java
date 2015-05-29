package workspace;

import org.apache.commons.lang3.RandomStringUtils;

public class Utils {

public static String getRandomEmail(){
        return RandomStringUtils.randomAlphanumeric(5);
        }

        public static String getRandomPassword(){
                return RandomStringUtils.randomAlphanumeric(5);
        }
}
