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

package it.water.email.model;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EMailConstants {
    public static final String EMAIL_OPT_SMTP_SENDER_NAME = "it.water.mail.sender.name";
    public static final String EMAIL_OPT_SMTP_HOST = "it.water.mail.smtp.host";
    public static final String EMAIL_OPT_SMTP_PORT = "it.water.mail.smtp.port";
    public static final String EMAIL_OPT_SMTP_USERNAME = "it.water.mail.smtp.username";
    public static final String EMAIL_OPT_SMTP_PASSWORD = "it.water.mail.smtp.password";
    public static final String EMAIL_OPT_SMTP_AUTH = "it.water.mail.smtp.auth.enabled";
    public static final String EMAIL_OPT_SMTP_START_TTLS_ENABLED = "it.water.mail.smtp.start-ttls.enabled";
}
