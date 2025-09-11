package com.dawull;

import com.dawull.domain.system.controller.SystemController.SystemController;
import com.dawull.domain.wiseSaying.controller.WiseSayingController.WiseSayingController;

import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private final SystemController systemController;
    private final WiseSayingController wiseSayingController;

    public App(Scanner scanner) {
        this.scanner = scanner;
        this.systemController = new SystemController();
        this.wiseSayingController = new WiseSayingController(scanner);
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.println("명령) ");
            String cmd = scanner.nextLine();

            if ("종료".equals(cmd)) {
                systemController.actionExit();
                break;
            } else if ("등록".equals(cmd)) {
                wiseSayingController.actionAdd();
            } else if ("목록".equals(cmd)) {
                wiseSayingController.actionList();
            }
        }
    }
}
