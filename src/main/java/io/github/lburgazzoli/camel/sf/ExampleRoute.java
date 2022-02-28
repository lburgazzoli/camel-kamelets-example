package io.github.lburgazzoli.camel.sf;

import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.builder.RouteBuilder;

@ApplicationScoped
public class ExampleRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("kamelet:timer-source?message=hello")
            .to("kamelet:log-sink?showAll=true");
    }
}
