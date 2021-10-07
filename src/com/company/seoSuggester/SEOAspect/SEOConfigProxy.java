package com.company.seoSuggester.SEOAspect;

import com.company.serverManager.ServerManager;

public class SEOConfigProxy {
    private SEOAspect config;
    private ServerManager dataServerConnection;

    public SEOConfigProxy() {

        // Loads default SEO aspect configuration object from server
        config = dataServerConnection.getSEOConfig();

    }

    public void updateSEOConfig() {

        // Waits till finish of operations upon configuration object, updates configuration object,
        // and blocks config callers until update finish
        config = dataServerConnection.updateSEOConfig();

    }

}
