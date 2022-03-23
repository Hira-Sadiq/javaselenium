package de.check24.tests;

import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.ApiHelper;
import api.RestHeader;

public class TransactioMoveTest {

    String request = "{\n" +
            "\"sourceSsoUser\": {\n" +
            "\t\"email\":\"kfz-testing-auto-kb1@check24.de\",\n" +
            "\t\"userId\" :84297531\n" +
            "},\n" +
            "\"targetSsoUser\": {\n" +
            "\t\"email\":\"kfz-testing-android-smoke@check24.de\",\n" +
            "    \"userId\" :74874707\n" +
            "},\n" +
            "\"actionId\": \"1402-4546-4150-08\"\n" +
            "}";

    @Test(description = "Test to check the 'Filter Active, All and Complete' functionality.")
    public void verifyCompleteActiveToDoCount() throws JSONException {

        RestHeader restHeader = new RestHeader();
        restHeader.setRequestPath("/webservices/userAccess/transactionMove.json");
        restHeader.setBody(request);
        String response = new ApiHelper().executePost(restHeader);
        Assert.assertTrue(response.contains("success"));

    }
}
