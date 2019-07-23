package cucumber;

import managers.PageObjectManagers;
import managers.WebdriverManager;

public class TextContext {

	public class TestContext {
		private WebdriverManager WebdriverManager;
		private PageObjectManagers PageObjectManagers;

		public TestContext() {
			WebdriverManager = new WebdriverManager();
			PageObjectManagers = new PageObjectManagers(WebdriverManager.getDriver());
		}

		public WebdriverManager getWebDriverManager() {
			return WebdriverManager;
		}

		public PageObjectManagers getPageObjectManager() {
			return PageObjectManagers;
		}
	}
}