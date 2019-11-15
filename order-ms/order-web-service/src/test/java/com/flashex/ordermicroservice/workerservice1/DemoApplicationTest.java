package com.flashex.ordermicroservice.workerservice1;

import static org.assertj.core.api.Assertions.assertThat;

import com.flashex.samplemicroservice.lib.services.SampleService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class DemoApplicationTest {

    @Autowired
    private SampleService sampleService;

    @Test
    public void contextLoads() {
        assertThat(sampleService.message()).isNull();
    }

}
