package xyz.solarknight.sample.cluster;

import java.util.concurrent.CompletableFuture;

import io.atomix.core.Atomix;
import io.atomix.core.AtomixBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * @author peiheng.zph created on Aug 25, 2020
 * @version 1.0
 */
@Slf4j
public class Application {

    public static void main(String[] args) {
        log.info("Try start atomix application");

        AtomixBuilder builder = Atomix.builder();
        Atomix local = builder.withClusterId("member1")
            .withAddress("30.78.132.73")
            .build();

        CompletableFuture<Void> future = local.start();
        future.join();
    }
}
