import com.codahale.metrics.health.HealthCheck
import com.codahale.metrics.health.HealthCheck.Result

/**
 * Created by tabiul on 21 May 2016.
 */
class TemplateHealthCheck extends HealthCheck {

    private final String template;

    def TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final String saying = String.format(template, "TEST");
        if (!saying.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }
}
