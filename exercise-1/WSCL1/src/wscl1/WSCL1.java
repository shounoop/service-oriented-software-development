package wscl1;

public class WSCL1 {

    public static void main(String[] args) {
        System.out.println(payThroughCreditCard("tuan", "visa", "123456", "123", "11/24"));
        System.out.println(payThroughCreditCard("tuan_wrong", "visa", "123456", "123", "11/24"));
        System.out.println(payThroughCreditCard("minh", "visa", "234567", "234", "10/26"));
    }

    private static Boolean payThroughCreditCard(java.lang.String name, java.lang.String type, java.lang.String cardNumber, java.lang.String cvcNum, java.lang.String expiredDate) {
        com.htc.test.ws.BtWebSV_Service service = new com.htc.test.ws.BtWebSV_Service();
        com.htc.test.ws.BtWebSV port = service.getBtWebSVPort();
        return port.payThroughCreditCard(name, type, cardNumber, cvcNum, expiredDate);
    }
}
