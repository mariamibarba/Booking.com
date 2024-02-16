import Pom.Steps.MainPageSteps;
import org.testng.annotations.Test;

public class Tests extends BaseConfigSelenide{
    MainPageSteps mainPageSteps;
    @Test
    public void firttest(){
        mainPageSteps
                .clickOnFirstTrendingLocation();

    }

}
