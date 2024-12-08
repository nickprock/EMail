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

package it.water.email.api;

import it.water.core.api.service.Service;

/**
 * @Author Aristide Cittadino
 * Basic Email Provider configurations
 */
public interface EMailOptions extends Service {
    /**
     * Used to show the sender name when an email is received
     *
     * @return
     */
    String systemSenderName();

    /**
     * SMTP hostname
     *
     * @return
     */
    String smtpHostname();

    /**
     * SMTP Port
     *
     * @return
     */
    String smtpPort();

    /**
     * SMTP Username
     *
     * @return
     */
    String smtpUsername();

    /**
     * SMTP Password
     *
     * @return
     */
    String smtpPassword();

    /**
     * If SMTP Auth is enabled
     *
     * @return
     */
    boolean isSmtpAuthEnabled();

    /**
     * If start TTLS is enabled
     *
     * @return
     */
    boolean isStartTTLSEnabled();
}
