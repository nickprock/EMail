/*
 * Copyright 2024 Aristide Cittadino
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.water.email.service;

import it.water.core.api.bundle.ApplicationProperties;
import it.water.core.interceptors.annotations.FrameworkComponent;
import it.water.core.interceptors.annotations.Inject;
import it.water.email.api.EMailOptions;
import it.water.email.model.EMailConstants;
import lombok.Setter;

/**
 * @Author Aristide Cittadino
 * Basic implementation of EMailOptions interface
 */
@FrameworkComponent
public class EMailOptionsImpl implements EMailOptions {
    @Inject
    @Setter
    private ApplicationProperties applicationProperties;

    @Override
    public String systemSenderName() {
        if (applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_SENDER_NAME) != null)
            return String.valueOf(applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_SENDER_NAME));
        return "Water-Application";
    }

    @Override
    public String smtpHostname() {
        if (applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_HOST) != null)
            return String.valueOf(applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_HOST));
        return "localhost";
    }

    @Override
    public String smtpPort() {
        if (applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_PORT) != null)
            return String.valueOf(applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_PORT));
        return "587";
    }

    @Override
    public String smtpUsername() {
        if (applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_USERNAME) != null)
            return String.valueOf(applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_USERNAME));
        return "-";
    }

    @Override
    public String smtpPassword() {
        if (applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_PASSWORD) != null)
            return String.valueOf(applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_PASSWORD));
        return "-";
    }

    @Override
    public boolean isSmtpAuthEnabled() {
        if (applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_AUTH) != null)
            return Boolean.valueOf((String) applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_AUTH));
        return false;
    }

    @Override
    public boolean isStartTTLSEnabled() {
        if (applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_START_TTLS_ENABLED) != null)
            return Boolean.valueOf((String) applicationProperties.getProperty(EMailConstants.EMAIL_OPT_SMTP_START_TTLS_ENABLED));
        return false;
    }
}
