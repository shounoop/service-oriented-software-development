# Xây dựng và sử dụng dịch vụ WEB

## `I. Các bước xây dựng dịch vụ WEB (SOAP) trong Netbeans IDE`

### 1. Tạo 1 project Web Application

- Setting server (Example: Apache Tomcat or TomcatEE)
- Không cần sử dụng Framework

### 2. Tạo mới Web Service cho project vừa tạo

- Plugin các thư viện Metro
- Tạo các methods

```java
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
```

## `II. Sử dụng Web Service`

### 1. Tạo 1 project phía Client (Java Application/Web Application)

### 2. Tạo mới Web Service Client cho project vừa tạo

- Setting WSDL and Client location (Specify the WSDL file of the Web Service)
- WSDL URL: lấy ở page Test Web Service

1. Build project server
2. Deploy project server
3. Right-click vào file service đã tạo bên phía server và chọn _Test Web Service_
4. Sau khi đã xác định được WSDL URL, tick vào Generate Dispatch code trong form New Web Sercive Client và click finish

### 3. Tạo và gọi Call Web Service Operations:

```java
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        hello(name);
    }


    public static String hello(java.lang.String name){
        Client.SOAPService_Service service = new Client.SOAPService_Service();
        Client.SOAPService port = service.getSOAPServicePort();
        return port.hello(name);
    }

    public static boolean check_Product(String type, int amount){
        Client.SOAPService_Service service = new Client.SOAPService_Service();
        Client.SOAPService port = service.getSOAPServicePort();
        return port.checkProduct(type, amount);
    }
}
```
