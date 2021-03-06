package Common;

import Remote.FCMClient;
import Remote.IFCMService;
import Remote.IGoogleAPI;
import Remote.RetrofitClient;

public class Common {
    public  static  final  String driver_tbl ="Drivers";
    public  static  final  String user_driver_tbl ="DriversInformation";
    public  static  final  String user_rider_tbl ="RidersInformation";
    public  static  final  String pickup_request_tbl ="PickupRequest";
    public  static  final  String tokens_tbl ="Tokens";


    public  static  final String baseURL ="https://maps.googleapis.com";
    public  static  final String fcmURL ="https://fcm.googleapis.com";
    public  static IGoogleAPI getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
    public  static IFCMService getIFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
