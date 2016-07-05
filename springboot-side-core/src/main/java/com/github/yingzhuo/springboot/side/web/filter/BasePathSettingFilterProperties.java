package com.github.yingzhuo.springboot.side.web.filter;

import com.github.yingzhuo.springboot.side.web.config.AbstractFilterProperties;
import org.springframework.core.Ordered;

public class BasePathSettingFilterProperties extends AbstractFilterProperties {

    private String[] basepathAttributeNames = new String[] { "webroot", "WEBROOT", "basePath", "BASEPATH" };
    private BasePathSettingFilter.AttributeScope scope = BasePathSettingFilter.AttributeScope.REQUEST;

    public BasePathSettingFilterProperties() {
        super();
        super.setEnabled(true);
        super.setFilterName(BasePathSettingFilter.class.getSimpleName());
        super.setFilterOrder(Ordered.LOWEST_PRECEDENCE);
        super.setUrlPatterns(new String[] {"/*"});
    }

    public String[] getBasepathAttributeNames() {
        return basepathAttributeNames;
    }

    public void setBasepathAttributeNames(String[] basepathAttributeNames) {
        this.basepathAttributeNames = basepathAttributeNames;
    }

    public BasePathSettingFilter.AttributeScope getScope() {
        return scope;
    }

    public void setScope(BasePathSettingFilter.AttributeScope scope) {
        this.scope = scope;
    }

}
