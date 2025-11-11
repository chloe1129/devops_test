// src/main/java/com/sonarqube/sca/test/App.java
package com.sonarqube.sca.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        // Log4j를 사용하여 간단한 메시지 로깅
        logger.info("Java SCA Test Application started.");
        logger.warn("This application is using a potentially vulnerable Log4j version!");
        // 여기에 취약점 발생을 시뮬레이션하는 코드를 넣을 수도 있지만, SCA 탐지 목적에는 pom.xml만으로 충분합니다.
    }
}