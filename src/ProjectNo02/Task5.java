package ProjectNo02;

public class Task5 {// implementation of the picture task
}

interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("opens the Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("closes the Chrome browser");
    }

    @Override
    public String getTitle() {
        String title = "gets title of the Chrome browser's page";
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("gets a screenshot of the Chrome browser's page");
    }

    @Override
    public void navigate() {
        System.out.println("navigates to desired the Chrome browser's page");
    }
}

class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("opens the Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("closes the Firefox browser");
    }

    @Override
    public String getTitle() {
        String title = "gets a title of the Firefox browser's page";
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("gets a screenshot of the Firefox browser's page");
    }

    @Override
    public void navigate() {
        System.out.println("navigates to desired the Firefox browser's page");
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("opens the Safari browser");
    }

    @Override
    public void close() {
        System.out.println("closes the Safari browser");
    }

    @Override
    public String getTitle() {
        String title = "gets a title of the Safari browser's page";
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("gets a screenshot of the Safari browser's page");
    }

    @Override
    public void navigate() {
        System.out.println("navigates to the desired Safari browser's page");
    }
}