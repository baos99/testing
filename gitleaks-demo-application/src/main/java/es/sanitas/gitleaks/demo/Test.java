package es.sanitas.gitleaks.demo;

public class MyTaskOne implements Tasklet {
 
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception
    {
      System.out.println("MyTaskOne start..");
   
        // ... your code

        /* 
        kafka

     sasl.jaas.config=org.apache.kafka.common.security.scram.ScramLoginModule required \
     username="tokenID123" \
     password="lAYYSFmLs4bTjf+lTZ1LCHR/ZZFNA==" \
     tokenauth="true";
         * 
         * passw = "asdfgs"
    ADAFRUIT_IO_KEY = "1b17ac78df65288d1b17ac78df65288d"
    ADOBE_TOKEN = "1b17ac78df65288d1b17ac78df65288d"
    ADOBLE_CLIEENT = "p8e-1b17ac78df65288d1b17ac78df6528ES"
    AGE_SECRET_KEY = "AGE-SECRET-KEY-1QPZRY9X8GQPZRY9X8GQPZRY9X8GQPZRY9X8GQPZRY9X8GQPZRY9X8G9X8Z" #acepta caracteres de no base58 (B o A)
    AWS_ACCESS_TKN = "AKIA126A5S8F4R1F2T23"
    DISCORD_KEY = "1b17ac78df65288d1b17ac78df65288d"
    DROPBOX_TOKEN = "a2w56e6e5dcAAAAAAAAAAs45s2e1r4f1s45s2e1r4f1s45s2e1r4f1s45s2e1r4f"
    FACEBOOK_EXAMPLE = "1b17ac78df65288d1b17ac78df65288d"
    GITHUB_TOKEN = "ghu_1a2s5w1e41a2s5w1e41a2s5w1e41a2s5w1e4"
    GITHUB_PAT = "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d4"
    HEROKU_APY_KEI = "12345678-1234-1234-1234-123456789abc"
    LINKEDIN_CLIEENT = "123456asdfghasd1" 
    POSTMAN_APY_TKN = "PMAK-0123456789ABCDEF01234567-0123456789ABCDEF0123456789ABCDEF01"
 
    TELEGRAM_BOT_APY_TKN = "12345678:A123456asdfgh123asd456qwe123asd45fg"
    TWITTER_ACCSS_SCRT = "asd123asdasd123asdasd123asdasd123asdasd123asd"
    TWITTER_ACCSS_TKN = "12345678910121314-DSDFDF4454241Aaasdf541324asd"
         * 
    Authorization: Basic eW91cl9lbWFpbEBkb21haW4uY29tOnlvdXJfdXNlcl9hcGlfdG9rZW4=
         * 
         * Atlassian:
         * "userKey": "402880824ff933a4014ff9345d7c0002",
         *  "self": "http://myhost:8080/confluence/rest/experimental/user?key=402880824ff933a4014ff9345d7c0002"
         
 PRIVAT3_KEI = "-----BEGIN RSA PRIVATE KEY-----\
MIIBOgIBAAJBAKj34GkxFhD90vcNLYLInFEX6Ppy1tPf9Cnzj4p4WGeKLs1Pt8Qu\
KUpRKfFLfRYC9AIKjbJTWit+CqvjWYzvQwECAwEAAQJAIJLixBy2qpFoS4DSmoEm\
o3qGy0t6z09AIJtH+5OeRV1be+N4cDYJKffGzDa88vQENZiRm0GRq6a+HPGQMd2k\
TQIhAKMSvzIBnni7ot/OSie2TmJLY4SwTQAevXysE2RbFDYdAiEBCUEaRQnMnbp7\
9mxDXDf6AU0cN/RPBjb9qSHDcWZHGzUCIG2Es59z8ugGrDY+pxLQnwfotadxd+Uy\
v/Ow5T0q5gIJAiEAyS4RaI9YG8EWx/2w0T67ZUVAw8eOMB6BIUg0Xcu+3okCIBOs\
/5OiPgoTdSy7bcF9IGpSE8ZgGKzgYQVZeN97YE00\
-----END RSA PRIVATE KEY-----"

Azure directory
client_id=7df2s309-erdp-0927-v203-p0e4df7409d5&scope=api://7df2s309-erdp-0927-v203-p0e4df7409d5/.default&client_secret=0Ec82@3dfafesQljc-9kzNf1De210nJasWPw2&grant_type=client_credentials

Bitbucket

"Client ID": "hqfXs3eSKbQ4vsAtSm"
"Client secret": "ySBdaCPKykpQuTXVGFkbmRc6WTHJWaky"

AWS

<header>.
{
   "sub":"aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee",
   "device_key": "aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee",
   "cognito:groups":[
      "testgroup"
   ],
   "iss":"https://cognito-idp.us-west-2.amazonaws.com/us-west-2_example",
   "version":2,
   "client_id":"djc98u3jiedmi283eu928",
   "origin_jti":"aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee",
   "event_id":"aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee",
   "token_use":"access",
   "scope":"phone openid profile resourceserver.1/appclient2 email",
   "auth_time":1676313851,
   "exp":1676317451,
   "iat":1676313851,
   "jti":"aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee",
   "username":"my-test-user"
   "aws_access_key_id": "HedvigAdmin",
   "aws_secret_access_key": "ehoFGrkHd6qnYhp7ufJYEtA5/gzuDP0Ydc+gPsdl"
}
.<token signature>

JWT clamis.sub
{
  "iss": "https://accounts.google.com",
  "sub": "dZJPsd9oVtAciRY8F5lHzk4yS0hfnBiE@clients",
  "aud": "https://kafka.auth",
  "iat": 1672817905,
  "exp": 1672904305,
  "azp": "dZJPsd9oVtAciRY8F5lHzk4yS0hfnBiE",
  "scope": "scope",
  "gty": "client-credentials"
}
clientId="dZJPsd9oVtAciRY8F5lHzk4yS0hfnBiE" \
clientSecret="XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" \

{
  "credentials": {
    "app.terraform.io": {
      "token": "abc.123.abc123"
    }
  }
}

databrickscfg
[DEFAULT]
host  = https://adb-1234567890123456.7.azuredatabricks.net
token = dapi12345678901234567890123456789012

[DEVELOPMENT]
host  = https://adb-2345678901234567.8.azuredatabricks.net
token = dapi23456789012345678901234567890123


Digital ocean
dop_v1_7aca966c06a4e7cd67a7ac90f24ceb2b651d7fdf7cc901c5773f86677a34b20;
        
Dynatrace API = dt0s01.ST2EY72KQINMH574WMNVI7YN.G3DFPBEJYMODIDAEX454M7YWBUVEFOWKPRVMWFASS64NFH52PX6BNDVFFM572

grafana = eyJrIjoiR0ZXZmt1UFc0OEpIOGN5RWdUalBJTllUTk83VlhtVGwiLCJuIjoiYXBpa2V5Y3VybCIsImlkIjo2fQ==

gitea = access_token="a936efc887b1947561ab901d08abe3b3b3128a80"

- sonar: |
    SONAR_TOKEN="8542358fa39f75d30ca699bc27c57335e047c162"
    apikey: 8542358fa39f75d30ca699bc27c57335e047c162

    jwt: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c

teams webhook: https://cloudnueva.webhook.office.com/webhookb2/fe1f1b7e-123r-4d65-8c48-b3d5b732f987@990876cd-77d7-4fab-8cd2-57020376ed11/IncomingWebhook/34d33b0195204a0c9aba6ae8b240ef4f/111a2f8-d26c-4fc1-b1c0-ffbaf2af1337

POSTMAN
client_id = *12345678-9ABC-DEF0-1234-56789ABCDEF0
https://WebApiServer1.APIServerDomain.com/webapibe3.0/sem/v3/Companies('dfbbe4ae-bfb2-44a3-9169-cd6f9f6159b7')/Environments('220b72a9-a805-4e54-a343-60ed95d0532b')

consumer_key = QAktM6W6DF6F7XXXXXX
consumer_secret = AJX560A2Omgwyjr6Mml2esedujnZLHXXXXXX
access_token = 1995XXXXX-0NGqVhk3s96IX6SgT3H2bbjOPjcyQXXXXXXX
token_secret = rHVuh7dgDuJCOGeoe4tndtjKwWiDjBZHLaZXXXXXX
bearer_token = AAAAAAAAAAAAAAAAAAAAAL9v6AAAAAAA99t03huuqRYg0mpYAAFRbPR3XXXXXXX

Postman-Token: 6ad07f7c-4846-9c3f-2a3e-b24e8d2273ad

"access_token": "BQAHVkZFKuMbhSYNA6wYqAwnOv9lIAQXMGyh2C2Upj7H5o6RpafUa30fqoR2w5ssOu9bq6DhQnL0fGjJfss",
  "token_type": "Bearer",


  vault token

token                hvs.CAESIJRM-T1q5lEjIWux1Tjx-VGqAYJdd4FZtbp1wpD5Ym9pGh4KHGh2cy5TSjRndGoxaU44NzNscm5MSlRLQXZ0ZGg
token_accessor       GMAlk9ZNLGOCuTrOEIAooJG3
accessor             kfhjoayUCHo1yjdbT0YWvlJ1
export USE_LIMIT_TOKEN="hvs.CAESIJRM-T1q5lEjIWux1Tjx-VGqAYJdd4FZtbp1wpD5Ym9pGh4KHGh2cy5TSjRndGoxaU44NzNscm5MSlRLQXZ0ZGg"

    <add class-name="usr" jdbc:op-id="0" 
                          jdbc:op-type="password-set-operation">
        <add-attr name="fname">
            <value>John</value>
        </add-attr>
        <add-attr name="lname">
            <value>Doe</value>
        </add-attr>
        <password>Doe1278eusdjkhf</password>
    </add>

Yandex OAuth token: y3_Vdheub7w9bIut67GHeL345gfb5GAnd3dZnf08FRbvjeUFvetYiohGvc
secret key: YCVdheub7w9bImcGAnd3dZnf08FRbvjeUFvehGvc
Sample IAM Cookie: c1f9eugktrZqYks_a=7Y-TmpGUnUKHz-3rfjrtoDw3_npWay4-SjJ_ghY7KlouMjJ3Kncrl9PcSLTl0-e8rTxrv3fT3Uls2dPnvK08a7w==

kraken
{
    "name": "ownTrades",
    "token": "WW91ciBhdXRoZW50aWNhdGlvbiB0b2tlbiBnb2VzIGhlcmUu"
  }

*/
         
        System.out.println("MyPassword done..");
        return RepeatStatus.FINISHED;
    }	
  }
