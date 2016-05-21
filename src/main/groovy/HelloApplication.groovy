import io.dropwizard.Application
import io.dropwizard.assets.AssetsBundle
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

/**
 * Created by tabiul on 21 May 2016.
 */
class HelloApplication extends Application<HelloConfiguration> {

    def static main(args){
        def application = new HelloApplication();
        application.run(args)
    }

    @Override
    void initialize(Bootstrap<HelloConfiguration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/webapp", "/", "index.html"))
    }

    @Override
    def void run(HelloConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new HelloWorldResource(configuration.template, configuration.defaultName));
        environment.healthChecks().register("template", new TemplateHealthCheck())
    }
}
