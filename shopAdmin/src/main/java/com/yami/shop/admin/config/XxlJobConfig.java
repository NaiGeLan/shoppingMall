
package com.yami.shop.admin.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * xxl-job config
 *
 * @author NaiGeLan
 */
@Configuration
public class XxlJobConfig {
    private final Logger logger = LoggerFactory.getLogger(XxlJobConfig.class);

    @Value("${xxl-job.admin.addresses}")
    private String adminAddresses;

    @Value("${xxl-job.accessToken}")
    private String accessToken;

    @Value("${xxl-job.logPath}")
    private String logPath;

    @Value("${server.port}")
    private int port;

    @Autowired
    private InetUtils inetUtils;

}
