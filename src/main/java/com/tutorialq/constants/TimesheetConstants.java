package com.tutorialq.constants;

import com.google.common.collect.ImmutableMap;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class TimesheetConstants implements Serializable {

    public static final String SALT = "technumen"; //Key used for Encryption.

    public static final String REGISTRATION_STATUS_ACTIVE = "ACTIVE";

    public static final String REGISTRATION_STATUS_INACTIVE = "INACTIVE";

    public static final String USER_ROLE_EMPLOYEE = "EMPLOYEE";

    public static final String USER_ROLE_SUPERVISOR = "SUPERVISOR";

    public static final String USER_ROLE_ADMIN = "ADMIN";

    public static final int USER_ROLE_EMPLOYEE_ID = 100;

    public static final int USER_ROLE_SUPERVISOR_ID = 200;

    public static final int USER_ROLE_ADMIN_ID = 500;

    public static final String TIMESHEET_STATUS_APPROVED = "APPROVED";

    public static final String TIMESHEET_STATUS_SUBMITTED = "SUBMITTED";

    public static final String TIMESHEET_STATUS_REJECTED = "REJECTED";

    public static final String TIMESHEET_STATUS_ALL = "ALL";

    public static final String TIMESHEET_TYPE_WEEKLY = "WEEKLY";

    public static final String TIMESHEET_TYPE_BIWEEKLY = "BIWEEKLY";

    public static final String REST_RESPONSE_CODE_SUCCESS = "SUCCESS";

    public static final String REST_RESPONSE_CODE_ERROR = "ERROR";

    public static final List<String> TIMESHEET_STATUS_LIST = new ArrayList<>(
            Arrays.asList(TIMESHEET_STATUS_ALL, TIMESHEET_STATUS_SUBMITTED, TIMESHEET_STATUS_APPROVED, TIMESHEET_STATUS_REJECTED));

    // All anticipated document types.
    public static final Map<String, String> TIMESHEET_FILE_EXTENSION_MAP = ImmutableMap.<String, String>builder()
            //Images
            .put("bmp", "image/bmp")
            .put("jpg", "image/jpeg")
            .put("jpeg", "image/jpeg")
            .put("png", "image/png")
            .put("pdf", "application/pdf")
            .put("txt", "text/plain")
            .build();

    public static final String INIT_VECTOR_RANDOM_KEY = "RandomInitVector"; // 16 bytes IV any random String with 16 characters can be used.

    public static final String MAX_UPLOAD_FILE_SIZE = "1000000"; // 5MB file limit.

    public static final String fromAddress = "admin@tutorialq.com";

}
