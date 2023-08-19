package com.playwrightdemo.playwrightframework.utility;

import com.microsoft.playwright.Page;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
@Lazy
public class ScreenShotUtil {

    @Autowired
    public Page page;

    public void TakeScreenShot() throws IOException {
        Path path = Paths.get("screenshot.png");
        page.screenshot(new Page.ScreenshotOptions()
                .setPath(path)
                .setFullPage(true));
        try(InputStream is = Files.newInputStream(path)){
            Allure.addAttachment("Failed", is);
        }
    }

    @Attachment(value = "Failure Screenshot", type = "image/png")
    public byte[] SaveScreenShot()
    {
        return page.screenshot();
    }
}
