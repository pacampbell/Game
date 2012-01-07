package game.framework;

import java.net.URL;

public class GameHelper
{
    public static URL osIndependentFilePath(String path)
    {

        String fullPath = "/resources/" + path;
        URL systemIndependentPath = null;

        // Ghetto Solution to a cross compatible file path loader
        try
        {
            throw new Exception();
	}
	catch(Exception e)
        {
            StackTraceElement[] sTrace = e.getStackTrace();
            // sTrace[0] will be always there
            systemIndependentPath = sTrace[0].getClass().getResource(fullPath);
            //System.out.println(systemIndependentPath);
	}
        finally
        {
            return systemIndependentPath;
        }
    }
}
