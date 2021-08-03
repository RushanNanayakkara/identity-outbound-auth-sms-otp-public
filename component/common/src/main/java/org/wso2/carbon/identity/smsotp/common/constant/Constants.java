/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.smsotp.common.constant;

/**
 * SMS OTP service constants.
 */
public class Constants {

    public static final String CORRELATION_ID_MDC = "Correlation-ID";

    public static final String ALGORITHM_NAME = "SHA1PRNG";
    public static final String ALGORITHM_HMAC = "HmacSHA1";
    public static final String ALGORITHM_HMAC_SHA = "HMAC-SHA-1";
    public static final String SESSION_TYPE_OTP = "SMS_OTP";

    public static final int NUMBER_BASE = 2;
    public static final int DEFAULT_OTP_LENGTH = 6;
    public static final int DEFAULT_SMS_OTP_EXPIRY_TIME = 60000;
    public static final String SMS_OTP_NOTIFICATION_TEMPLATE = "sendOTP";

    public static final String SMS_OTP_IDENTITY_EVENT_MODULE_NAME = "smsOtp";
    public static final String SMS_OTP_ENABLED = "smsOtp.enabled";
    public static final String SMS_OTP_TOKEN_LENGTH = "smsOtp.tokenLength";
    public static final String SMS_OTP_TOKEN_EXPIRY_TIME = "smsOtp.tokenExpiryTime";
    public static final String SMS_OTP_ALPHANUMERIC_TOKEN_ENABLED = "smsOtp.isEnableAlphanumericToken";
    public static final String SMS_OTP_TRIGGER_NOTIFICATION = "smsOtp.triggerNotification";
    public static final String SMS_OTP_TOKEN_RENEW_INTERVAL = "smsOtp.tokenRenewInterval";
    public static final String SMS_OTP_SHOW_FAILURE_REASON = "smsOtp.showValidationFailureReason";

    /**
     * SMS OTP service error codes.
     */
    public enum ErrorMessage {

        // Client error codes.
        CLIENT_BAD_REQUEST("SMS-60001", "Bad request.", "Bad request : %s."),
        CLIENT_EMPTY_USER_ID("SMS-60002", "Provided user ID is empty.", "Provided user ID is empty."),
        CLIENT_INVALID_USER_ID("SMS-60003", "Invalid user Id.", "Provided user ID is invalid : %s."),
        CLIENT_BLANK_MOBILE_NUMBER("SMS-60004", "Invalid mobile number.",
                "No valid mobile number for the user : %s."),
        CLIENT_EXPIRED_OTP("SMS-60005", "Expired OTP.",
                "Expired OTP provided for the user : %s."),
        CLIENT_INVALID_TRANSACTION_ID("SMS-60006", "Invalid transaction Id.",
                "Invalid transaction Id : %s."),
        CLIENT_MANDATORY_VALIDATION_PARAMETERS_EMPTY("SMS-60007", "Mandatory parameters not found.",
                "Mandatory parameters not found : %s."),
        CLIENT_OTP_USER_VALIDATION_FAILED("SMS-60007", "OTP user validation failed.",
                "Provided OTP doesn't belong to the mentioned user : %s."),
        CLIENT_OTP_VALIDATION_FAILED("SMS-60008", "Provided OTP is invalid.",
                "Provided OTP is invalid. User id : %s."),

        // Server error codes.
        SERVER_USER_STORE_MANAGER_ERROR("SMS-65001", "User store manager error.",
                "User store manager error : %s."),
        SERVER_RETRIEVING_MOBILE_ERROR("SMS-65002", "User store manager error.",
                "Error retrieving mobile number of the user : %s."),
        SERVER_GENERATE_ALPHA_NUMERIC_OTP_ERROR("SMS-65003", "Error generating alpha numeric OTP.",
                "Error generating alpha numeric OTP : %s."),
        SERVER_GENERATE_OTP_ERROR("SMS-65004", "Error generating the OTP.",
                "Error generating the OTP : %s."),
        SERVER_SESSION_JSON_MAPPER_ERROR("SMS-65005", "Error parsing to JSON.",
                "Error parsing to JSON : %s."),
        SERVER_NOTIFICATION_SENDING_ERROR("SMS-65006", "Error while sending the notification.",
                "Error while sending the SMS notification to the user : %s."),
        SERVER_JSON_SESSION_MAPPER_ERROR("SMS-65007", "Error parsing to sessionDTO.",
                "Error parsing to SessionDTO."),
        SERVER_EVENT_CONFIG_LOADING_ERROR("SMS-65008", "Error while loading SMS OTP event configs.",
                "Error while loading SMS OTP event configs : %s"),
        SERVER_INCOMPATIBLE_USER_STORE_MANAGER_ERROR("SMS-65009", "Incompatible user store manager.",
                "user store manager doesn't support unique Ids."),
        SERVER_UNEXPECTED_ERROR("SMS-65010", "An unexpected server error occurred.",
                "An unexpected server error occurred.");

        private final String code;
        private final String message;
        private final String description;

        ErrorMessage(String code, String message, String description) {

            this.code = code;
            this.message = message;
            this.description = description;
        }

        public String getCode() {

            return code;
        }

        public String getMessage() {

            return message;
        }

        public String getDescription() {

            return description;
        }

        public String toString() {

            return getCode() + " | " + message;
        }
    }

    /**
     * Forbidden Error Messages
     */
    public enum ForbiddenErrorMessages {

    }

    /**
     * Not Found Error Messages
     */
    public enum NotFoundErrorMessages {

        SMS_60003
    }

    /**
     * Conflict Error Messages
     */
    public enum ConflictErrorMessages {

    }
}

