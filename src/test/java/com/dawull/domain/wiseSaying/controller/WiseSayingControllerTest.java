package com.dawull.domain.wiseSaying.controller;

import com.dawull.AppTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.assertThat;

public class WiseSayingControllerTest {
    @BeforeEach
    void beforeEach() {
        //AppTest.clear();
    }

    @Test
    @DisplayName("등록을 입력하면 내용과 작가를 입력받는다.")
    public void t4() {
        String output = AppTest.run("""
                등록
                현재를 사랑하라.
                작자미상
                """);

        assertThat(output)
                .contains("명언 : ")
                .contains("작가 : ");
    }


}
