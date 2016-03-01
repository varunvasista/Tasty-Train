package varunnazeema.com.tastytrain.app;

/**
 * Created by varunvasistakusuma on 20/02/16.
 */
public class Config {


    // server URL configuration
    public static final String URL_REQUEST_SMS = "http://192.168.0.107//android_sms/request_sms.php";
    public static final String URL_VERIFY_OTP = "http://192.168.0.107//android_sms/verify_otp.php";

    // SMS provider identification
    // It should match with your SMS gateway origin
    // You can use  MSGIND, TESTER and ALERTS as sender ID
    // If you want custom sender Id, approve MSG91 to get one
    public static final String SMS_ORIGIN = "TTRAIN";

    // special character to prefix the otp. Make sure this character appears only once in the sms
    public static final String OTP_DELIMITER = ":";
}
