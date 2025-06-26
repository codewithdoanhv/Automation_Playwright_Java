package org.example.utils;

import com.microsoft.playwright.*;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class PageFactory {
    private final Playwright playwright;
    private final Browser browser;
    private final BrowserContext context;
    private final Page page;

    public PageFactory() {
        this.playwright = Playwright.create();
//        this.browser = playwright.chromium().launch();
// Thêm LaunchOptions để chạy ở headed mode
        BrowserType.LaunchOptions options = new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(500); // Thêm độ trễ 500ms để quan sát rõ thao tác

        this.browser = playwright.chromium().launch(options);
        this.context = browser.newContext();
        this.page = context.newPage();
    }

    public Page getPage() {
        return page;
    }

    public void close() {
        context.close();
        browser.close();
        playwright.close();
    }
}
